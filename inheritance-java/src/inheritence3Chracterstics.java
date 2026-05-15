class Plane{
    public void takeoff(){
        System.out.println("the plane is taking off");
    }
    public void fly(){
        System.out.println("the plane is flying");
    }
    public void land(){
        System.out.println("thr plane is landing");
    }
        }

        class CargoPlane extends Plane{
            public void carryCargo(){
                System.out.println("the plane ia carrying goods");
            }
        }

class PassengerPlane extends Plane{
    public void carryPassenger(){
        System.out.println("the plane ia carrying goods");
    }
}

class FighterPlane extends Plane{
    public void carryWeapons(){
        System.out.println("the plane ia carrying goods");
    }
}



public class inheritence3Chracterstics {
    static void main(String[] args) {

        System.out.println("\n");
        CargoPlane cp = new  CargoPlane();
        PassengerPlane pp = new PassengerPlane();
        FighterPlane fp = new  FighterPlane();


        cp.takeoff();
        cp.fly();
        cp.carryCargo();
        cp.land();
        System.out.println("\n");


        pp.takeoff();
        pp.fly();
        pp.carryPassenger();
        pp.land();
        System.out.println("\n");


        fp.takeoff();
        fp.fly();
        fp.carryWeapons();
        fp.land();
        System.out.println("\n");


    }
}
