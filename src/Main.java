public class Main {
    public static void main(String[] args) {
        Vehicle bicycle = new Bicycle("Highway Riding Bicycle", 2);
        Vehicle bicycle2 = new Bicycle("Mountain Riding Bicycle", 2);
        Vehicle car = new Car("Sport Car", 4);
        Vehicle car2 = new Car("Family Car", 4);
        Vehicle truck = new Truck("Monster Truck", 8);
        Vehicle truck2 = new Truck("Cargo Truck", 10);


        ServiceStation serviceStation = new ServiceStation();
        serviceStation.check(bicycle);
        serviceStation.check(bicycle2);
        serviceStation.check(car);
        serviceStation.check(car2);
        serviceStation.check(truck);
        serviceStation.check(truck2);
    }
}