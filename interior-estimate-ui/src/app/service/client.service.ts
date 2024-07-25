import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import {Client} from "../model/client";
import {Observable} from "rxjs";
import {ClientList} from "../model/clientList";

@Injectable({
  providedIn: 'root'
})
export class ClientService {

  private url: string;
  // private sclient: ClientList[]=[]

  constructor(private http:HttpClient) {
    this.url='/rest/client';
  }

   public getClient(id: number): Observable<ClientList> {
     return this.http.get<ClientList>(this.url + "/" + id);
   }
}
