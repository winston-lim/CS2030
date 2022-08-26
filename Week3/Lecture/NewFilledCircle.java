import java.awt.Color;

class NewFilledCircle extends Circle {
    private final Color color;
  
    NewFilledCircle(double radius, Color color) {
        super(radius);
        this.color = color;
    }

    FilledCircle fillColor(Color color) {
        return new FilledCircle(super.radius, color);
    }

    public String toString() {
        return "filled " + super.toString() + " and color: " + this.color; 
    }

    public static void main(String[] args) {}
}
