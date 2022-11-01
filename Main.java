public class Main {
    public static void main(String[] args) {
        Circle figure = new Circle(3);
        System.out.println(figure.getName() + ": радиус = " + figure.getSide());
        System.out.println(figure.getName() + ": площадь = " + figure.getArea());
        System.out.println(figure.getName() + ": периметр = " + figure.getLength());
        figure.setSide(43);
        System.out.println(figure.getName() + ": радиус = " + figure.getSide());

        Square square = new Square(2);
        System.out.println(square.getName() + ": длина стороны = " + square.getSide());
        System.out.println(square.getName() + ": площадь = " + square.getArea());
        System.out.println(square.getName() + ": периметр = " + square.getLength());
        square.setSide(5);
        System.out.println(square.getName() + ": длина стороны = " + square.getSide());

        Rectangle rectangle = new Rectangle(2, 3);
        System.out.println(rectangle.getName() + ": длины сторон = " + rectangle.getSide());
        System.out.println(rectangle.getName() + ": площадь = " + rectangle.getArea());
        System.out.println(rectangle.getName() + ": периметр = " + rectangle.getLength());
        rectangle.setSide(-1, 2);
        System.out.println(rectangle.getName() + ": длины сторон = " + rectangle.getSide());


    }
}
