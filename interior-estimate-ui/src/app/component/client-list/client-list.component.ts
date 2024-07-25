import { Component, OnInit } from '@angular/core';
import { ClientList} from "../../model/clientList";
import { ClientListService} from "../../service/client-list.service";
import {FormsModule} from "@angular/forms";
import {NgForOf} from "@angular/common";
import {PropertyType} from "../../model/propertyType";

@Component({
  selector: 'app-client-list',
  standalone: true,
  imports: [
    FormsModule,
    NgForOf
  ],
  templateUrl: './client-list.component.html',
  styleUrl: './client-list.component.css'
})
export class ClientListComponent implements OnInit {

  clientList: ClientList[]=[];
  propertyType: PropertyType[]=[];

  constructor(private clientService: ClientListService) {
  }

  ngOnInit(){
    this.clientService.findAll().subscribe(data => {
      this.clientList=data;
    })
  }

}
