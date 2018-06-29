package Hotel;

import Hotel.RoomTypes.Bedroom;
import Hotel.RoomTypes.ConferenceRoom;
import Hotel.RoomTypes.DiningRoom;

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
}
