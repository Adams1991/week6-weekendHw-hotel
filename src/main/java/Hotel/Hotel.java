package Hotel;

import Hotel.People.Guest;
import Hotel.RoomTypes.Bedroom;
import Hotel.RoomTypes.ConferenceRoom;
import Hotel.RoomTypes.DiningRoom;
import Hotel.RoomTypes.RoomTypes;

import java.util.ArrayList;

public class Hotel {

    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private ArrayList<DiningRoom> diningRooms;
    private double takings;

    public Hotel(ArrayList<Bedroom> bedrooms, ArrayList<ConferenceRoom> conferenceRooms,
                 ArrayList<DiningRoom> diningRooms, double takings){
                     this.bedrooms = bedrooms;
                     this.conferenceRooms = conferenceRooms;
                     this.diningRooms = diningRooms;
                     this.takings = takings;
    }

    public double getTakings() {
        return takings;
    }

    public ArrayList<Bedroom> getBedrooms() {
        return bedrooms;
    }


    public int getAmountOfBedrooms() {
        return bedrooms.size();
    }

    public void addBedroom(Bedroom bedroom) {
        bedrooms.add(bedroom);
    }

    public int getAmountOfDiningRomms() {
        return diningRooms.size();
    }

    public void addDiningRoom(DiningRoom diningRoom) {
        diningRooms.add(diningRoom);
    }


    public int getAmountOfConferenceRooms() {
        return conferenceRooms.size();
    }

    public void addConferenceRoom(ConferenceRoom conferenceRoom) {
        conferenceRooms.add(conferenceRoom);
    }

    public Bedroom getBedroomByTypeForBooking(RoomTypes roomType) {
        Bedroom availableRoom = null;
        for (Bedroom bedroom : bedrooms) {
            if (bedroom.getRoomType() == roomType && !bedroom.isBooked())
                availableRoom = bedroom;
        }
        return availableRoom;
    }


    public ConferenceRoom getConferenceRoomByNameForBooking(String roomName) {
        ConferenceRoom availableRoom = null;
        for (ConferenceRoom conferenceRoom : conferenceRooms) {
            if (conferenceRoom.getName() == roomName && !conferenceRoom.isBooked())
                availableRoom = conferenceRoom;
        }
        return availableRoom;
    }

    public DiningRoom getDiningRoomByNameForBooking(String roomName) {
        DiningRoom availableRoom = null;
        for (DiningRoom diningRoom : diningRooms) {
            if (diningRoom.getName() == roomName && !diningRoom.isFull())
                availableRoom = diningRoom;
        }
        return availableRoom;
    }

    public Bedroom GetBedroomByNumber(int roomNumber) {
        Bedroom foundRoom= null;
        for (Bedroom bedroom : bedrooms) {
            if (bedroom.getRoomNumber() == roomNumber)
                foundRoom = bedroom;
        }
        return foundRoom;
    }

    public ConferenceRoom GetConferenceRoomByName(String roomName) {
        ConferenceRoom foundRoom= null;
        for (ConferenceRoom conferenceRoom : conferenceRooms) {
            if (conferenceRoom.getName() == roomName)
                foundRoom = conferenceRoom;
        }
        return foundRoom;
    }

    public DiningRoom GetDiningRoomByName(String roomName) {
        DiningRoom foundRoom= null;
        for (DiningRoom diningRoom : diningRooms) {
            if (diningRoom.getName() == roomName)
                foundRoom = diningRoom;
        }
        return foundRoom;
    }

    public String guestsInBedroom(int roomNumber) {
        return GetBedroomByNumber(roomNumber).guestsNamesInRoom();
    }

    public String guestsInConferenceRoom(String roomName) {
        return GetConferenceRoomByName(roomName).guestsNamesInRoom();
    }

    public String guestsInDiningRoom(String roomName) {
        return GetDiningRoomByName(roomName).guestsNamesInRoom();
    }

    public void addGuestToBedroom(RoomTypes roomType, Guest guest) {
        getBedroomByTypeForBooking(roomType).addGuest(guest);
    }


    public void addGuestToConferenceRoom(String roomName, Guest guest) {
        getConferenceRoomByNameForBooking(roomName).addGuest(guest);
    }

    public void addGuestToDiningRoom(String roomName, Guest guest) {
        getDiningRoomByNameForBooking(roomName).addGuest(guest);
    }

    public String getVacantBedrooms() {
        ArrayList<Integer> vacantRooms = new ArrayList<>();
        for (Bedroom bedroom : bedrooms) {
            if (!bedroom.isBooked())
                vacantRooms.add(bedroom.getRoomNumber());
        }
        return vacantRooms.toString();
    }
}
