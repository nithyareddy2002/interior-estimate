import {PropertyType} from "./propertyType";
import {Room} from "./room";

export class Property {

  id: number;
  addressLine1:String;
  addressLine2:String;
  city:String;
  postalCode: String;
  status: String;
  propertyType: PropertyType;
  rooms:Room[];

  constructor() {
    this.id=0;
    this.addressLine1="";
    this.addressLine2="";
    this.city="";
    this.postalCode="";
    this.status="";
    this.propertyType = new PropertyType();
    this.rooms=[];
  }
}
