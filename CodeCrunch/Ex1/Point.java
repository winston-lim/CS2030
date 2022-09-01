class Point {
    private final double x;
    private final double y;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }
    
    public Point midPoint(Point p) {
        double midX = (this.x + p.x) / 2;
        double midY = (this.y + p.y) / 2;
        return new Point(midX, midY); 
    }

    public double angleTo(Point p) {
        return Math.atan2(p.y - this.y, p.x - this.x);
    }

    public double distanceTo(Point p) {
        double yDist = Math.abs(p.y - this.y);
        double xDist = Math.abs(p.x - this.x);
        return Math.hypot(yDist, xDist);
    }

    public Point moveTo(double ang, double d) {
        return new Point(x + d * Math.cos(ang), y + d * Math.sin(ang));
    }

    @Override
    public String toString() {
        String stringX = String.format("%.3f", this.x);
        String stringY = String.format("%.3f", this.y);
        return "point (" + stringX + ", " + stringY + ")";
    }
}
