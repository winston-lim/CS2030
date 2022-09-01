class Circle {
    private static final double epsilon = 1e-15;
    private final Point centre;
    private final double radius;

    Circle(Point centre, double radius) {
        this.centre = centre;
        this.radius = radius;
    }

    public Point getCentre() {
        return this.centre;
    }

    public double getRadius() {
        return this.radius;
    }

    public boolean contains(Point p) {
        if (centre.distanceTo(p) > this.radius + epsilon) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "circle of radius " + this.radius + " centred at " + centre.toString();
    }
}
