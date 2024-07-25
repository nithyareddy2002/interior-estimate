import {Component, OnInit} from '@angular/core';
import {Client} from "../../model/client";
import {ClientService} from "../../service/client.service";
import {ActivatedRoute} from "@angular/router";
import {NgForOf, NgIf} from "@angular/common";
import {Property} from "../../model/property";
import {PropertyType} from "../../model/propertyType";
import {Room} from "../../model/room";
import {RoomType} from "../../model/room-type";

@Component({
  selector: 'app-s-client-list',
  standalone: true,
  imports: [
    NgForOf,
    NgIf
  ],
  templateUrl: './client.component.html',
  styleUrl: './client.component.css'
})
export class ClientComponent implements OnInit {
  sClient: Client = new Client();
  propertyList: Property[] = [];
  propertyType: PropertyType = new PropertyType();
  roomsList:Room[]=[];
  roomType: RoomType= new RoomType();

  constructor(private route:ActivatedRoute,private sClientService:ClientService) {
  }

  ngOnInit() {
    this.route.paramMap.subscribe(params => {
      var id = params.get('clientId');
      // console.log(id);

      this.sClientService.getClient(Number(id))
        .subscribe({
          next:(data: any)=>{
            this.sClient = data;
            this.propertyList = data.properties;
            console.log(this.propertyList);
          }
        })
    });
  }

  getRooms(p:any){
    console.log('Entered test',p);
    this.roomsList = p.rooms;
    for(let i=0;i<p.rooms.length;i++)
    {
      this.roomType=p.rooms[i].roomType;
    }

    console.log(this.roomsList);
    console.log(this.roomType);
  }
}
