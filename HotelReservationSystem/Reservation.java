class Reservation {
    private Room room;
    private String customerName;
    private int numberOfNights;
    private double totalCost;

    public Reservation(Room room, String customerName, int numberOfNights) {
        this.room = room;
        this.customerName = customerName;
        this.numberOfNights = numberOfNights;
        this.totalCost = room.getPrice() * numberOfNights;
    }

    public Room getRoom() {
        return room;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getTotalCost() {
        return totalCost;
    }

    @Override
    public String toString() {
        return "Reservation Details:\n" +
                "Customer Name: " + customerName + "\n" +
                "Room: " + room + "\n" +
                "Number of Nights: " + numberOfNights + "\n" +
                "Total Cost: $" + totalCost;
}
}