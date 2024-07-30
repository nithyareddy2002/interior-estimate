import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {PropertyType} from "../model/propertyType";
import {RoomType} from "../model/room-type";

@Injectable({
  providedIn: 'root'
})
export class RoomtypeService {

  private url:string;

  constructor(private http:HttpClient) {
    this.url="/rest/room/getroomtypes"
  }

  public findAll(): Observable<RoomType[]> {
    return this.http.get<RoomType[]>(this.url);
  }
}
