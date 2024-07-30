import {RoomType} from "./room-type";
import {Unit} from "./unit";

export class Room {

  id: number;
  roomType: RoomType;
  units: Unit[];

  constructor() {
    this.id=0;
    this.roomType=new RoomType();
    this.units = [];
  }
}
