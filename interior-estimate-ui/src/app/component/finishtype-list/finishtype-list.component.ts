import {Component, OnInit} from '@angular/core';
import { Finishtype } from '../../model/finishtype';
import { FinishtypeService } from "../../service/finishtype.service";
import {NgForOf} from "@angular/common";


@Component({
  selector: 'app-finishtype-list',
  standalone: true,
  imports: [
    NgForOf
  ],
  templateUrl: './finishtype-list.component.html',
  styleUrl: './finishtype-list.component.css'
})
export class FinishtypeListComponent implements OnInit{
  finishTypes: Finishtype[] = [];

  constructor(private finishTypeService: FinishtypeService) {
  }

  ngOnInit() {
    this.finishTypeService.findAll().subscribe(data => {
      console.log("Entered ng on init");
      console.log(data);
      this.finishTypes = data;
    });
  }

}
