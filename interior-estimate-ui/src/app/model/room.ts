import {RoomType} from "./room-type";

export class Room {

  id: number;
  roomType: RoomType;

  constructor() {
    this.id=0;
    this.roomType=new RoomType();
  }
}
