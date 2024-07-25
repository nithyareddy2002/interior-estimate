import {Component, Input, OnInit, Output} from '@angular/core';
import {PropertyType} from "../../model/propertyType";
import {PropertytypeService} from "../../service/propertytype.service";
import EventEmitter from "events";

@Component({
  selector: 'app-propertytype',
  standalone: true,
  imports: [],
  templateUrl: './propertytype.component.html',
  styleUrl: './propertytype.component.css'
})
export class PropertytypeComponent implements OnInit{

  propertyTypes:PropertyType[]=[];

  constructor(private propertytype:PropertytypeService) {
  }

  ngOnInit() {
  }


}
