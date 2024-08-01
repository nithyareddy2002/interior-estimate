import {RoomType} from "./room-type";
import {Unit} from "./unit";

export class Room {

  id: number;
  roomTypeId: number;
  units: Unit[];

  constructor() {
    this.id=null as any;
    this.roomTypeId=null as any;
    this.units = [];
  }
}
