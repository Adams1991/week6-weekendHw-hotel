package Hotel;

import Hotel.People.Guest;

import java.util.ArrayList;

public abstract class Room {
    public int capacity;
    public ArrayList<Guest> guests;

    public Room(int capacity, ArrayList<Guest> guests) {
        this.capacity = capacity;
        this.guests = guests;
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

    public boolean isBooked() {
        boolean answer = false;
        if (guests.size() > 0){answer = true;}
        return answer;
    }

    public void emptyRoom(){
        guests.clear();
    }

    public String guestsNamesInRoom(){
        ArrayList<String> nameArray = new ArrayList<String>();
        for ( Guest guest : guests) nameArray.add(guest.getName());
        return nameArray.toString();
    }

}
