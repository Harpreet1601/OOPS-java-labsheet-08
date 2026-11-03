public class CarBean {
    private String make, model;
    private int year;

    public String getMake() { return make; }
    public void setMake(String make) { this.make = make; }
    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }
    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    public static void main(String[] args) {
        CarBean c = new CarBean();
        c.setMake("Maruti");
        c.setModel("Swift");
        c.setYear(2024);
        System.out.println(c.getMake() + " " + c.getModel() + " " + c.getYear());
    }
}