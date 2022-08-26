class Server {
    private final String name;
    private final double busyUntilTime;

    Server(String name) {
        this.name = name;
        this.busyUntilTime = -1;
    }

    Server(String name, double busyUntilTime) {
        this.name = name;
        this.busyUntilTime = busyUntilTime;
    }

    double getBusyUntilTime() {
        return this.busyUntilTime;
    }

    Server serveCustomer(Customer c) {
        if (c.getArrivalTime() < this.busyUntilTime) {
            System.out.println("customer " + c.getId() + " left");
            return new Server(this.name, -1);
        }
        System.out.println("customer " + c.getId() + " served by " + this.name);
        return new Server(this.name, c.getEndTime());
    }
}
