public class Square extends Figure{
    private static final String NAME = "Квадрат";
    protected double side;
    public Square(double side) {
        super(side);
    }
    public double getArea(){
        double area = side * side;
        return area;
    }
    public double getLength(){
        double length = 4 * side;
        return length;
    }
    public String getName() {
        return NAME;
    }

}

