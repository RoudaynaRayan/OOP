import java.util.Date;
public class Triangle extends GeometricObject{
    private double [3]  sides;

    public Triangle (String blue, boolean b, double[] sides) {
        dateCreated = new Date(2023, 3, 7);
    }

    public Triangle (String color, boolean filled, double[3]S) {
        super(color, filled);
        this.sides = S;
        dateCreated = new Date(2023, 3, 7);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }
    public String getsides() {
        return getsides();
    }

    public void setsides(int [] sides) {
        this.sides = sides;
    }
    @Override
    public String toString() {
        return "Triangle{" +
                "color='" + color + "'," +
                " filled='" + filled + "'," +
                "}\n";
    }
}

