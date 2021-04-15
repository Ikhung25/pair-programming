public class Circle {

    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getPerimiter() {
        return (this.radius)*2* Math.PI;
    }

    public double getArea() {
        return (Math.pow(this.radius, 2)*Math.PI);
    }
}
