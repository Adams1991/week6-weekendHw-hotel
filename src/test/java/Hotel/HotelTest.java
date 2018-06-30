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
    Guest guest2;
    ArrayList<Guest> guests;
    Bedroom bedroom;
    Bedroom bedroom2;
    DiningRoom diningRoom;
    ConferenceRoom conferenceRoom;



    @Before
    public void setUp() {
        guest = new Guest("Bob", 400);
        guest2 = new Guest("Billy", 400);
        guests = new ArrayList<>();
        bedrooms = new ArrayList<>();
        diningRooms = new ArrayList<>();
        conferenceRooms = new ArrayList<>();
        bedroom = new Bedroom(guests, RoomTypes.SINGLE, 300);
        bedroom2 = new Bedroom(guests, RoomTypes.SINGLE, 300);
        conferenceRoom = new ConferenceRoom(50, guests, "Bezo Room", 150);
        diningRoom = new DiningRoom(12, guests, "Main");
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
    public void canGetBedroomByTypeForBooking(){
        hotel.addBedroom(bedroom);
        assertEquals(bedroom, hotel.getBedroomByTypeForBooking(RoomTypes.SINGLE));
    }

    @Test
    public void canGetBedroomByTypeOnlyIfNotBooked(){
        bedroom.addGuest(guest);
        hotel.addBedroom(bedroom);
        assertEquals(null, hotel.getBedroomByTypeForBooking(RoomTypes.SINGLE));
    }

    @Test
    public void canGetRoomByTypeThenAdd(){
        hotel.addBedroom(bedroom);
        hotel.addBedroom(bedroom2);
        Bedroom availableRoom = hotel.getBedroomByTypeForBooking(RoomTypes.SINGLE);
        availableRoom.addGuest(guest);
        assertEquals(1, availableRoom.numberOfGuestsInRoom());
    }

    @Test
    public void canGetConferenceRoomByNameForBooking(){
        hotel.addConferenceRoom(conferenceRoom);
        assertEquals(conferenceRoom, hotel.getConferenceRoomByNameForBooking("Bezo Room"));
    }

    @Test
    public void canGetDiningRoomByNameForBooking(){
        hotel.addDiningRoom(diningRoom);
        assertEquals(diningRoom, hotel.getDiningRoomByNameForBooking("Main"));
    }

    @Test
    public void canGetBedroomByNumber(){
        hotel.addBedroom(bedroom);
        assertEquals(bedroom, hotel.GetBedroomByNumber(300));
    }

    @Test
    public void canGetConferenceRoomByName(){
        hotel.addConferenceRoom((conferenceRoom));
        assertEquals(conferenceRoom, hotel.GetConferenceRoomByName("Bezo Room"));
    }

    @Test
    public void canGetDiningRoomByName(){
        hotel.addDiningRoom(diningRoom);
        assertEquals(diningRoom, hotel.GetDiningRoomByName("Main"));
    }

    @Test
    public void canGetGuestListBedroom(){
        bedroom.addGuest(guest);
        hotel.addBedroom(bedroom);
        assertEquals("[Bob]", hotel.GuestsinBedroom(300));

    }




}