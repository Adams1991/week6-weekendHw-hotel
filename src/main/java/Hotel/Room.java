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



}
