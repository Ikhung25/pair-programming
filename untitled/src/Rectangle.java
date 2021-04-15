public class Rectangle implements IShape{
    double width;
    double length;

    @Override
    public double getPerimeter() {
        return (2 * width) + (2 * length);
    }

    @Override
    public double getArea() {
        return width * length;
    }
}
