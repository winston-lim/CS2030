import java.util.Scanner;

class Main {
    private static final double THRESHOLD = 1E-15;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        Server s = new Server(name);
        int idCounter = 0;

        while (sc.hasNextDouble()) {
            double arrivalTime = sc.nextDouble();
            double serviceTime = sc.nextDouble();
            Customer c = new Customer(++idCounter, arrivalTime, serviceTime);
            Server newServer =  s.serveCustomer(c);
            if (Math.abs(newServer.getBusyUntilTime() - -1) > THRESHOLD) {
                s = newServer;
            }
        }

        sc.close();
    }
}
