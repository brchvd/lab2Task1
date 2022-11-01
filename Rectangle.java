public class Rectangle extends Figure {
    private static final String NAME = "Прямоугольник";
    private double side2;

    public Rectangle(double side, double side2) {
        super(side);
        this.side2 = side2;
    }
    public String getSide() {
        return String.format("%s, %s", this.side, this.side2);
    }
    public void setSide(double side, double side2) {
        if ((side >= 0) && (side2 >= 0)) {
            this.side = side;
            this.side2 = side2;
        }
        else {System.out.println("Ошибка! Сторона не может быть отрицательной!");}
    }
    public double getArea(){
        double area = side * side2;
        return area;
    }
    public String getName() {
        return NAME;
    }

    public double getLength(){
        double length = 2 * (side + side2);
        return length;
    }
}

