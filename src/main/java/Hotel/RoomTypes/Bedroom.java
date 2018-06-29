package Hotel.RoomTypes;

import Hotel.People.Guest;
import Hotel.Room;

import java.util.ArrayList;

public class Bedroom extends Room {

    private RoomTypes roomType;
    private double nightlyRate;

    public Bedroom(int capacity, ArrayList<Guest> guests,  double nightlyRate) {
        super(capacity, guests);
        this.nightlyRate = nightlyRate;
    }


}
