class Customer {
    private final int id;
    private final double arrivalTime;
    private final double endTime;

    Customer(int id, double arrivalTime, double serviceDuration) {
        this.id = id;
        this.arrivalTime = arrivalTime;
        this.endTime = arrivalTime + serviceDuration;
    }
    
    int getId() {
        return this.id;
    }

    double getArrivalTime() {
        return this.arrivalTime;
    }

    double getEndTime() {
        return this.endTime;
    }
}
