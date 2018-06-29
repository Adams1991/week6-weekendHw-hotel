package Hotel;

import Hotel.People.Guest;
import Hotel.RoomTypes.Bedroom;
import Hotel.RoomTypes.ConferenceRoom;
import Hotel.RoomTypes.DiningRoom;
import Hotel.RoomTypes.RoomTypes;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class HotelTest {


    ArrayList<Bedroom> bedrooms;
    ArrayList<DiningRoom> diningRooms;
    ArrayList<ConferenceRoom> conferenceRooms;
    Hotel hotel;
    Guest guest;
    ArrayList<Guest> guests;
    Bedroom bedroom;
    DiningRoom diningRoom;
    ConferenceRoom conferenceRoom;



    @Before
    public void setUp() {
        guest = new Guest("Bob", 400);
        guests = new ArrayList<>();
        bedrooms = new ArrayList<>();
        diningRooms = new ArrayList<>();
        conferenceRooms = new ArrayList<>();
        bedroom = new Bedroom(guests, RoomTypes.SINGLE, 300);
        conferenceRoom = new ConferenceRoom(50, guests, "Bezo Room", 150);
        diningRoom = new DiningRoom(12, guests);
        hotel = new Hotel(bedrooms,conferenceRooms,diningRooms, 100000);
    }

    @Test
    public void canGetTakings(){
        assertEquals(100000, hotel.getTakings(), 0.01);
    }

    @Test
    public void canGetBedroomsArray(){
        assertEquals(bedrooms, hotel.getBedrooms());
    }

    @Test
    public void canGetDiningRoomsArray(){
        assertEquals(bedrooms, hotel.getBedrooms());
    }

    @Test
    public void canGetConferenceRoomsArray(){
        assertEquals(bedrooms, hotel.getBedrooms());
    }

   @Test
   public void canCheckAmountOfBedrooms(){
        assertEquals(0, hotel.getAmountOfBedrooms());
   }

    @Test
    public void canAddBedroom(){
        hotel.addBedroom(bedroom);
        assertEquals(1, hotel.getAmountOfBedrooms());
    }

    @Test
   public void canCheckAmountOfDiningRoom(){
        assertEquals(0, hotel.getAmountOfDiningRomms());
   }

    @Test
    public void canAddDiningRoom(){
        hotel.addDiningRoom(diningRoom);
        assertEquals(1, hotel.getAmountOfDiningRomms());
    } 
    
    @Test
   public void canCheckAmountOfConferenceRooms(){
        assertEquals(0, hotel.getAmountOfConferenceRooms());
   }

    @Test
    public void canAddConferenceRoom(){
        hotel.addConferenceRoom(conferenceRoom);
        assertEquals(1, hotel.getAmountOfConferenceRooms());
    }

    @Test
    public void canGetBedroomByType(){
        hotel.addBedroom(bedroom);
        assertEquals(bedroom, hotel.getBedroomByType(RoomTypes.SINGLE));
    }



}