package Hotel;

import Hotel.People.Guest;

import java.util.ArrayList;

public abstract class Room {
    public int capacity;
    public ArrayList<Guest> guests;
//    public boolean occupied;

    public Room(int capacity, ArrayList<Guest> guests){
        this.capacity = capacity;
        this.guests = guests;
//        this.occupied = false;
    }

    public int numberOfGuestsInRoom() {
        return guests.size();
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }


    public ArrayList<Guest> getGuests() {
        return guests;
    }


    public void addGuest(Guest guest) {
        guests.add(guest);
    }

}
