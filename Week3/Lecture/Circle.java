class Circle {
    protected final double radius;
  
    Circle(double radius) {
        this.radius = radius;
    }

    double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    public String toString() {
        return "circle with area: " + String.format("%.2f", this.getArea()); 
    }

}
