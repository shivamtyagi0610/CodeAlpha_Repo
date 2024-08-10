import java.util.ArrayList;
import java.util.List;

class Hotel {
    private List<Room> rooms = new ArrayList<>();
    private List<Reservation> reservations = new ArrayList<>();

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public void searchRooms(String category) {
        System.out.println("Available Rooms in Category: " + category);
        for (Room room : rooms) {
            if (room.getCategory().equalsIgnoreCase(category) && room.isAvailable()) {
                System.out.println(room);
            }
        }
    }

    public void makeReservation(String customerName, int roomNumber, int numberOfNights) {
        for (Room room : rooms) {
            if (room.getRoomNumber() == roomNumber && room.isAvailable()) {
                room.setAvailable(false);
                Reservation reservation = new Reservation(room, customerName, numberOfNights);
                reservations.add(reservation);
                System.out.println("Reservation Successful!");
                System.out.println(reservation);
                return;
            }
        }
        System.out.println("Room not available!");
    }

    public void viewReservations(String customerName) {
        System.out.println("Booking Details for " + customerName + ":");
        for (Reservation reservation : reservations) {
            if (reservation.getCustomerName().equalsIgnoreCase(customerName)) {
                System.out.println(reservation);
            }
        }
    }

    public void processPayment(Reservation reservation) {
        System.out.println("Processing payment of $" + reservation.getTotalCost() + " for " + reservation.getCustomerName());
        // Simulate payment processing
        System.out.println("Payment Successful!");
}
}
