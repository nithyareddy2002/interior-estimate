import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import {Finishtype} from "../model/finishtype";
import {Observable} from "rxjs";


@Injectable({
  providedIn: 'root'
})
export class FinishtypeService {

  private url: string;

  constructor(private http: HttpClient) {
    // this.url="http://localhost:8080/rest/finishtypes";
    this.url="/rest/finishtypes";
  }

  public findAll(): Observable<Finishtype[]> {
    console.log("entered findAll method");
    return this.http.get<Finishtype[]>(this.url);
  }

}
