public class CircleTester {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        System.out.println("The circle just constructed has an area " + circle.getArea());
        System.out.println("and a perimeter " + circle.getPerimeter());
    }
}