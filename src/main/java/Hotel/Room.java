package Hotel;

import Hotel.People.Guest;

import java.util.ArrayList;

public abstract class Room {
    int capacity;
    ArrayList<Guest> guests;

    public Room(int capacity, ArrayList<Guest> guests){
        this.capacity = capacity;
        this.guests = guests;
    }

    public int numberOfGuestsinRoom() {
        return guests.size();
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }


}
