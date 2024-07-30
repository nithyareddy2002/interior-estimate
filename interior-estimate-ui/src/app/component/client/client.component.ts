import {Component, OnInit} from '@angular/core';
import {Client} from "../../model/client";
import {ClientService} from "../../service/client.service";
import {MaterialService} from "../../service/material.service";
import {ActivatedRoute} from "@angular/router";
import {NgForOf, NgIf} from "@angular/common";
import {Property} from "../../model/property";
import {PropertyType} from "../../model/propertyType";
import {Room} from "../../model/room";
import {RoomType} from "../../model/room-type";
import {
  AccordionButtonDirective,
  AccordionComponent,
  AccordionItemComponent,
  TemplateIdDirective
} from "@coreui/angular";
import {
  MatAccordion,
  MatExpansionPanel, MatExpansionPanelDescription,
  MatExpansionPanelHeader,
  MatExpansionPanelTitle
} from "@angular/material/expansion";
import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import {UnitType} from "../../model/unit-type";
import {MatFormField} from "@angular/material/form-field";
import {MatInput} from "@angular/material/input";
import {MatSelect} from "@angular/material/select";
import {Material} from "../../model/material";
import {Category} from "../../model/category";
import {types} from "util";
import {PropertytypeService} from "../../service/propertytype.service";
import {RoomtypeService} from "../../service/roomtype.service";
import {Unit} from "../../model/unit";


@Component({
  selector: 'app-s-client-list',
  standalone: true,
  imports: [
    NgForOf,
    NgIf,
    AccordionButtonDirective,
    AccordionComponent,
    AccordionItemComponent,
    TemplateIdDirective,
    MatAccordion,
    MatExpansionPanel,
    MatExpansionPanelHeader,
    MatExpansionPanelTitle,
    MatExpansionPanelDescription,
    FormsModule,
    ReactiveFormsModule,
    MatFormField,
    MatInput,
    MatSelect
  ],
  templateUrl: './client.component.html',
  styleUrl: './client.component.css'
})
export class ClientComponent implements OnInit {
  sClient: Client = new Client();
  materials: Material[]=[];
  categories: String[]= Object.keys(Category).filter(v => isNaN(Number(v)));
  propertyTypes: PropertyType[]=[];
  roomTypes:RoomType[]=[];

  constructor(private route:ActivatedRoute,private sClientService:ClientService,private materialService:MaterialService,
  private propertyTypeService:PropertytypeService,private roomTypeService:RoomtypeService) {
  }

  ngOnInit() {
    this.route.paramMap.subscribe(params => {
      var id = params.get('clientId');
      // console.log(id);
      if(id !== 'null'){
        this.sClientService.getClient(Number(id))
          .subscribe({
            next:(data: any)=>{
              console.log(data);
              this.sClient = data;
            }
          })
      }
    });



    this.materialService.findAll().subscribe(data => {
      this.materials=data;
    })

    this.propertyTypeService.findAll().subscribe(data=>{
      this.propertyTypes=data;
    })

    this.roomTypeService.findAll().subscribe(data=>{
      this.roomTypes=data;
    })



  }


  onSubmit(){
    console.log("Entered on sav");
    this.sClientService.save(this.sClient).subscribe({
      next:(data: any)=>{
        console.log("Entered response");
        console.log(data);
      }
    })
  }

  onAddProperty(){
    console.log("Entered on onAddProperty");
    this.sClient.properties.push(new Property());
  }

  onAddRoom(id:number){
    console.log("Entered OnRoom Method:"+id);
    console.log(this.sClient.properties[id]);
    console.log(this.sClient.properties.length);
    for(let i=0;i<this.sClient.properties.length;i++){
      if(this.sClient.properties[i].id==id){
        this.sClient.properties[i].rooms.push(new Room());
      }
    }
  }

  // onAddUnit(id:number){
  //   console.log("Entered OnUnit Method");
  //   for(let i=0;i<this.sClient.properties.length;i++){
  //     for(let j=0;j<this.sClient.properties[i].rooms.length;j++){
  //       if(this.sClient.properties[i].rooms[j].id==id){
  //         this.sClient.properties[i].rooms[j].units.push(new Unit());
  //         console.log(this.sClient.properties[i].rooms[j].units);
  //       }
  //     }
  //   }
  // }

  onAddUnit(pid:number,rid:number){
    console.log("Entered on unit method");
    for(let i=0;i<this.sClient.properties.length;i++)
    {
      if(this.sClient.properties[i].id==pid){
        for(let j=0;j<this.sClient.properties[i].rooms.length;j++){
          if(this.sClient.properties[i].rooms[j].id==rid){
            console.log(this.sClient.properties[i].rooms[j]);
            this.sClient.properties[i].rooms[j].units.push(new Unit());
          }
        }
      }
    }
  }

  protected readonly Object = Object;
  protected readonly Category = Category;

  protected readonly isNaN = isNaN;
  protected readonly Number = Number;
}
