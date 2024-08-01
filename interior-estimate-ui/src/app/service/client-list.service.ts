import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import {ClientList} from "../model/clientList";
import {Observable} from "rxjs";



@Injectable({
  providedIn: 'root'
})
export class ClientListService {

  private url: string;
  private deleteurl:string;
  constructor(private http:HttpClient) {
    this.url=`/rest/client`
    this.deleteurl=`/rest`

  }

  public findAll(): Observable<ClientList[]> {
     return this.http.get<ClientList[]>(this.url);
   }

   public deleteClient(id:number):Observable<any> {
    return this.http.delete(this.url+"/"+id);
   }

}

