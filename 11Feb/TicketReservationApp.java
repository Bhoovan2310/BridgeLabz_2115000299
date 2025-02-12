class Ticket {
    int ticketId;
    String customerName, movieName, seatNumber, bookingTime;
    Ticket next;

    public Ticket(int ticketId, String customerName, String movieName, String seatNumber, String bookingTime) {
        this.ticketId = ticketId;
        this.customerName = customerName;
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.bookingTime = bookingTime;
        this.next = null;
    }
}

class TicketReservationSystem {
    private Ticket head, tail;
    private int totalTickets = 0;

    public void addTicket(int ticketId, String customerName, String movieName, String seatNumber, String bookingTime) {
        Ticket newTicket = new Ticket(ticketId, customerName, movieName, seatNumber, bookingTime);
        if (head == null) {
            head = tail = newTicket;
            tail.next = head;
        } else {
            tail.next = newTicket;
            tail = newTicket;
            tail.next = head;
        }
        totalTickets++;
    }

    public void removeTicket(int ticketId) {
        if (head == null) return;

        if (head.ticketId == ticketId) {
            if (head == tail) {
                head = tail = null;
            } else {
                tail.next = head.next;
                head = head.next;
            }
            totalTickets--;
            return;
        }

        Ticket temp = head;
        do {
            if (temp.next.ticketId == ticketId) {
                temp.next = temp.next.next;
                if (temp.next == head) {
                    tail = temp;
                }
                totalTickets--;
                return;
            }
            temp = temp.next;
        } while (temp != head);
    }

    public void displayTickets() {
        if (head == null) {
            System.out.println("No tickets booked.");
            return;
        }
        Ticket temp = head;
        do {
            System.out.println("Ticket ID: " + temp.ticketId + ", Customer: " + temp.customerName +
                    ", Movie: " + temp.movieName + ", Seat: " + temp.seatNumber + ", Time: " + temp.bookingTime);
            temp = temp.next;
        } while (temp != head);
    }

    public void searchTicket(String keyword) {
        if (head == null) return;
        Ticket temp = head;
        do {
            if (temp.customerName.equalsIgnoreCase(keyword) || temp.movieName.equalsIgnoreCase(keyword)) {
                System.out.println("Ticket Found - ID: " + temp.ticketId + ", Customer: " + temp.customerName +
                        ", Movie: " + temp.movieName + ", Seat: " + temp.seatNumber + ", Time: " + temp.bookingTime);
                return;
            }
            temp = temp.next;
        } while (temp != head);
        System.out.println("Ticket not found.");
    }

    public void totalTickets() {
        System.out.println("Total Booked Tickets: " + totalTickets);
    }
}

public class TicketReservationApp {
    public static void main(String[] args) {
        TicketReservationSystem system = new TicketReservationSystem();

        system.addTicket(101, "Alice", "Avengers", "A1", "10:00 AM");
        system.addTicket(102, "Bob", "Inception", "B2", "12:00 PM");
        system.addTicket(103, "Charlie", "Avatar", "C3", "2:00 PM");

        system.displayTickets();
        
        system.searchTicket("Alice");
        
        system.removeTicket(102);
        system.displayTickets();

        system.totalTickets();
    }
}
