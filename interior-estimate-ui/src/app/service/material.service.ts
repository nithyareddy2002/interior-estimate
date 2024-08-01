import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {ClientList} from "../model/clientList";
import {Material} from "../model/material";

@Injectable({
  providedIn: 'root'
})
export class MaterialService {

  private url: string;
  constructor(private http:HttpClient) {
    this.url="/rest/material"
  }

  public findAll(): Observable<Material[]> {
    return this.http.get<Material[]>(this.url);
  }
}
