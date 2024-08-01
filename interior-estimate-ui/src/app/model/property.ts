import {PropertyType} from "./propertyType";
import {Room} from "./room";

export class Property {

  id: number;
  addressLine1:String;
  addressLine2:String;
  city:String;
  postalCode: String;
  status: String;
  propertyTypeId: number;
  rooms:Room[];

  constructor() {
    this.id=null as any;
    this.addressLine1="";
    this.addressLine2="";
    this.city="";
    this.postalCode="";
    this.status="";
    this.propertyTypeId = null as any;
    this.rooms=[];
  }
}
