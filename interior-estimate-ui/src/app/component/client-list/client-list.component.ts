import { Component, OnInit } from '@angular/core';
import { ClientList} from "../../model/clientList";
import { ClientListService} from "../../service/client-list.service";
import {FormsModule} from "@angular/forms";
import {NgForOf} from "@angular/common";
import {PropertyType} from "../../model/propertyType";
import {CdkAccordionModule} from '@angular/cdk/accordion';
import {
  AccordionButtonDirective,
  AccordionComponent,
  AccordionItemComponent,
  TemplateIdDirective
} from '@coreui/angular';
import {Client} from "../../model/client";
import {ActivatedRoute} from "@angular/router";
import {Router} from "express";
import {ClientService} from "../../service/client.service";

@Component({
  selector: 'app-client-list',
  standalone: true,
  imports: [
    FormsModule,
    NgForOf,
    CdkAccordionModule,
    AccordionComponent,
    AccordionItemComponent,
    TemplateIdDirective,
    AccordionButtonDirective
  ],
  templateUrl: './client-list.component.html',
  styleUrl: './client-list.component.css'
})
export class ClientListComponent implements OnInit{

  clientList: ClientList[]=[];
  propertyType: PropertyType[]=[];
  client:Client[]=[]

  constructor(private clientService: ClientListService) {
  }

  ngOnInit(){
    this.clientService.findAll().subscribe(data => {
      this.clientList=data;
    })
  }

}
