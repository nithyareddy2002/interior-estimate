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
  private posturl:string;
  // private sclient: ClientList[]=[]

  constructor(private http:HttpClient) {
    this.url='/rest/client';
    this.posturl='/rest/updateclient';
  }

   public getClient(id: number): Observable<ClientList> {
     return this.http.get<ClientList>(this.url + "/" + id);
   }

   public save(client:Client){
    return this.http.post<Client>(this.posturl,client);
   }
}
