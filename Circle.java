public class Circle extends Figure{
    private static final String NAME = "Круг";
    public Circle(double radius) {
        super(radius);
        this.side = radius;
    }
    public double getArea(){
        double area = Math.PI * side * side;
        return area;
    }
    public String getName() {
        return NAME;
    }
    public double getLength(){
        double length = 2 * Math.PI * side;
        return length;
    }


}
