package Hotel.RoomTypes;

import Hotel.People.Guest;
import Hotel.Room;

import java.util.ArrayList;

public class Bedroom extends Room {

    private RoomTypes roomType;
    private double nightlyRate;

    public Bedroom(ArrayList<Guest> guests, RoomTypes roomType) {
        super(roomType.getCapacity(), guests);
        this.nightlyRate = roomType.getNightlyRate() ;
        this.roomType = roomType;
    }


}
