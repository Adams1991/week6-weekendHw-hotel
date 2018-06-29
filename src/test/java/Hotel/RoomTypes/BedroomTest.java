package Hotel.RoomTypes;

import Hotel.People.Guest;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class BedroomTest {
    ArrayList<Guest> guests;
    Bedroom bedroom;
    Bedroom bedroom2;
    Guest guest;

    @Before
    public void setUp() {
        guest = new Guest("Bob", 500);
        guests = new ArrayList<>();
        guests.add(guest);
        bedroom = new Bedroom(guests, RoomTypes.SINGLE, 300);
        bedroom2 = new Bedroom(guests, RoomTypes.DOUBLE, 300);
    }

    @Test
    public void canGetGuestsInRoom() {
        assertEquals(guests, bedroom.getGuests());
    }

    @Test
    public void canGetNumberOfGuestsInRoom() {
        assertEquals(1, bedroom.numberOfGuestsInRoom());
    }

    @Test
    public void canGetCapacity() {
        assertEquals(1, bedroom.getCapacity());
    }

    @Test
    public void canSetCapacity() {
        bedroom.setCapacity(14);
        assertEquals(14, bedroom.getCapacity());
    }

    @Test
    public void canGetNightlyRate() {
        assertEquals(30.00, bedroom.getNightlyRate(), 0.01);
    }

    @Test
    public void canGetRoomNumber() {
        assertEquals(300, bedroom.getRoomNumber());
    }

    @Test
    public void canGetRoomType() {
        assertEquals(RoomTypes.SINGLE, bedroom.getRoomType());
    }

    @Test
    public void canSetRoomType() {
        bedroom.setRoomType(RoomTypes.DOUBLE);
        assertEquals(RoomTypes.DOUBLE, bedroom.getRoomType());
    }

    @Test
    public void canAddGuest() {
        bedroom.addGuest(guest);
        assertEquals(2, bedroom.numberOfGuestsInRoom());

    }

    @Test
    public void canCheckIsFull__true(){
        assertEquals(true, bedroom.isFull());
    }

    @Test
    public void canCheckIsFull__false(){
        bedroom.emptyRoom();
        assertEquals(false, bedroom.isFull());
    }

    @Test
    public void canEmptyRoom(){
        bedroom.emptyRoom();
        assertEquals(0, bedroom.numberOfGuestsInRoom() );
    }







}