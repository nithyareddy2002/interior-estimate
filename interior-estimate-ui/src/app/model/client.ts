import {Property} from "./property";

export class Client {

  id: number;
  lastName: string;
  firstName:string;
  email:string;
  phoneNumber:number;
  address:string;
  properties: Property[];

  constructor(){
    this.id= null as any;
    this.lastName="";
    this.firstName="";
    this.email="";
    this.phoneNumber=0;
    this.address="";
    this.properties = [];
  }

}
