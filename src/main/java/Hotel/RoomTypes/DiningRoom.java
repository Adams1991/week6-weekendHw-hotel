package Hotel.RoomTypes;

import Hotel.People.Guest;
import Hotel.Room;

import java.util.ArrayList;

public class DiningRoom extends Room {

    private String name;


    public DiningRoom(int capacity, ArrayList<Guest> guests, String name) {
        super(capacity, guests);
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public boolean isFull() {
        boolean answer = false;
        if (guests.size() > getCapacity()){answer = true;}
        return answer;
    }
}
