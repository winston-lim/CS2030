import java.awt.Color;

class FilledCircle {
    private final double radius;
    private final Color color;
  
    FilledCircle(double radius, Color color) {
        this.radius = radius;
        this.color = color;
    }

    double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    FilledCircle fillColor(Color color) {
        return new FilledCircle(this.radius, color);
    }

    public String toString() {
        return "circle with area: " + String.format("%.2f", this.getArea() + " and color: " + this.color); 
    }

    public static void main(String[] args) {}
}
