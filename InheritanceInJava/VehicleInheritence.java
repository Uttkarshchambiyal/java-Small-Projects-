class Car{
    public void start(){
        System.out.println("car is started");
    }
    public void accelerate(){
        System.out.println("car is moving");
    }
    public void drive(){
        System.out.println("car is being driven in 120km/hr");
    }
    public void stop(){
        System.out.println("car is stopped");
    }
}

class ferrari extends Car{
    public void accelerate(){
        System.out.println("car is moving at 220-km/hr");
    }

    public void drive(){
        System.out.println("car is being driven in 8th");
    }


    public void combustion() {
        System.out.println("car has v12 engine");
    }
}
class M5 extends Car{
    public void accelerate(){
        System.out.println("car is moving at 250=km/hr");
    }

    public void drive(){
        System.out.println("car is being driven in 8th gear");
    }
    public void combustion() {
        System.out.println("car has v6 engine");
    }
}

class Gwagon extends Car{
    public void accelerate(){
        System.out.println("car is moving at 180-km/hr");
    }

    public void drive(){
        System.out.println("car is being driven in 7th gear");
    }
    public void combustion() {
        System.out.println("car has v8 engine");
    }
}


public class VehicleInheritence {
    static void main(String[] args) {
        System.out.println("\n");

        ferrari f1 = new ferrari();
        f1.start();
        f1.accelerate();
        f1.drive();
        f1.combustion();
        f1.stop();

        System.out.println("\n");

        M5 m1 = new M5();
        m1.start();
        m1.accelerate();
        m1.drive();
        m1.combustion();
        m1.stop();

        System.out.println("\n");

        Gwagon g1 = new Gwagon();
        g1.start();
        g1.accelerate();
        g1.drive();
        g1.combustion();
        g1.stop();
    }
}
