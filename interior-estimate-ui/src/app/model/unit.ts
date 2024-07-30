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
  material:Material;
  finish:Material;

  constructor(){
    this.id= null as any;
    this.quantity=null as any;
    this.category=null as any;
    this.unitName=null as any;
    this.material= new Material();
    this.finish=new Material();
  }

}
