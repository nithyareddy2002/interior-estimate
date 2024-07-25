import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {PropertyType} from "../model/propertyType";

@Injectable({
  providedIn: 'root'
})
export class PropertytypeService {


  constructor(private http:HttpClient) {
  }

}
