public class CircleBean {
    private double radius;

    public double getRadius() { return radius; }
    public void setRadius(double radius) { this.radius = radius; }

    // read-only properties
    public double getArea() { return Math.PI * radius * radius; }
    public double getCircumference() { return 2 * Math.PI * radius; }

    public static void main(String[] args) {
        CircleBean c = new CircleBean();
        c.setRadius(7);
        System.out.printf("Area = %.2f, Circumference = %.2f%n", c.getArea(), c.getCircumference());
    }
}