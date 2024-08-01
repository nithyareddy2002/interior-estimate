import {UnitType} from "./unit-type";
import {Category} from "./category";
import {Material} from "./material";

export class Unit {

  id: number;
  length?: number;
  height?: number;
  depth?: number;
  quantity:number;
  category:string;
  unitName: string;
  materialId:number;
  finishId:number;

  constructor(){
    this.id= null as any;
    this.quantity=null as any;
    this.category=null as any;
    this.unitName=null as any;
    this.materialId=null as any ;
    this.finishId=null as any;
  }

}
