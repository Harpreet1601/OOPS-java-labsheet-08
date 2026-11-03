public class RectangleBean {
    private double length, width;

    public double getLength() { return length; }
    public void setLength(double length) { this.length = length; }
    public double getWidth() { return width; }
    public void setWidth(double width) { this.width = width; }

    public double calculateArea() { return length * width; }
    public double calculatePerimeter() { return 2 * (length + width); }

    public static void main(String[] args) {
        RectangleBean r = new RectangleBean();
        r.setLength(10);
        r.setWidth(5);
        System.out.println("Area = " + r.calculateArea());
        System.out.println("Perimeter = " + r.calculatePerimeter());
    }
}