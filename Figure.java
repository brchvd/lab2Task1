public class Figure {
    private static final String NAME = "";
    protected double side;
    public String getSide() {
        return String.format("%s", this.side);
    }
    public void setSide(double side) {
        if (side >= 0) {this.side = side; }
        else {System.out.println("Ошибка! Сторона не может быть отрицательной!");}
    }
    public Figure(double side) {
        this.side = side;
    }

}
