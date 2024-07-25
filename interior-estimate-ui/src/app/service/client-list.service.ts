import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import {ClientList} from "../model/clientList";
import {Observable} from "rxjs";



@Injectable({
  providedIn: 'root'
})
export class ClientListService {

  private url: string;
  constructor(private http:HttpClient) {
    this.url=`/rest/clientbynumber`
  }

  public findAll(): Observable<ClientList[]> {
     return this.http.get<ClientList[]>(this.url);
   }


}

