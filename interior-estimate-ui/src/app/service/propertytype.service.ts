import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {PropertyType} from "../model/propertyType";
import {Material} from "../model/material";

@Injectable({
  providedIn: 'root'
})
export class PropertytypeService {

  private url:string
  constructor(private http:HttpClient) {
    this.url="/rest/property-types"
  }

  public findAll(): Observable<PropertyType[]> {
    return this.http.get<PropertyType[]>(this.url);
  }

}
