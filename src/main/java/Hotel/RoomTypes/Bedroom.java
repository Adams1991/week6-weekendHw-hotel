package Hotel.RoomTypes;

import Hotel.People.Guest;
import Hotel.Room;

import java.util.ArrayList;

public class Bedroom extends Room {

    private RoomTypes roomType;
    private double nightlyRate;
    private int roomNumber;

    public Bedroom(ArrayList<Guest> guests, RoomTypes roomType, int roomNumber) {
        super(roomType.getCapacity(), guests);
        this.nightlyRate = roomType.getNightlyRate() ;
        this.roomType = roomType;
        this.roomNumber = roomNumber;
    }


    public double getNightlyRate() {
        return nightlyRate;
    }

    public RoomTypes getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomTypes roomType) {
        this.roomType = roomType;
    }

    public int getRoomNumber() {
        return roomNumber;
    }
}
