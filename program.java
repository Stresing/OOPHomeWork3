public class program {
    public static void main(String[] args) {
        car b1 = new car("Bus1", 3500);
        car t1 = new car("Truck1", 5600);
    b1.setLocation("Moscow");
    t1.setLocation("Saratov");
    System.out.println(b1.toString());
    System.out.println(t1.toString());
    }
}
