package Hotel.RoomTypes;

import Hotel.People.Guest;
import Hotel.Room;

import java.util.ArrayList;

public class ConferenceRoom extends Room {

    private String name;
    private double dailyRate;

    public ConferenceRoom(int capacity, ArrayList<Guest> guests, String name, double dailyRate) {
        super(capacity, guests);
        name = this.name;
        dailyRate = this.dailyRate;
    }


}
