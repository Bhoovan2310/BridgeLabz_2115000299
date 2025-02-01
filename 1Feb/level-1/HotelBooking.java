public class HotelBooking {
    private String guestName, roomType;
    private int nights;

    public HotelBooking() {
        this("Unknown", "Standard", 1);
    }

    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    public HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

    public String getBooking() {
        return guestName + " booked " + roomType + " for " + nights + " nights.";
    }

    public void setBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    public static void main(String[] args) {
        HotelBooking h = new HotelBooking("John", "Deluxe", 3);
        System.out.println(h.getBooking());
        h.setBooking("Emma", "Suite", 5);
        System.out.println(h.getBooking());
    }
}
