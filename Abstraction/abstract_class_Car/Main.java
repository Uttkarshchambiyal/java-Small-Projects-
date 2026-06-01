abstract class car {
    public void start(){
        System.out.println("car is started"+"\n");
    }
    abstract public void accerlerate();
    abstract public void drive();
    abstract public void combustion();

    public void stop() {
        System.out.println("car is stopped"+"\n");
    }
}
class Maruti extends car{
     public void accerlerate(){
        System.out.println("car is acc at 180km/hr"+"\n");
    }
    public void drive(){
        System.out.println("car is driving in  manual gear"+"\n");
    }
    public void combustion(){
        System.out.println("car has petrol engine"+"\n");
    }
    public void racing(){
        System.out.println("maruti is racing with ferrari");
    }

}
class Innova extends car{
    public void accerlerate(){
        System.out.println("car is acc at 240km/hr"+"\n");
    }
    public void drive(){
        System.out.println("car is driving in automatic gear"+"\n");
    }
    public void combustion(){
        System.out.println("car has diesel engine"+"\n");
    }
    public void hitandKill(){
        System.out.println("he get the bail"+"\n");
    }

}
class Ferrari extends car{

    public void accerlerate(){
        System.out.println("car is acc at 340km/hr"+"\n");
    }
    public void drive(){
        System.out.println("car is driving in turbo gear"+"\n");
    }
    public void combustion(){
        System.out.println("car has hybrid petrol engine"+"\n");
    }
    public void writeEssay(){
        System.out.println("300 words SA done"+"\n");
    }
}

class Road{
    public void permit(car m){
        m.start();
        m.accerlerate();
        m.drive();
        m.combustion();
        m.stop();
    }
}
 class Main {
    public static void main(String[] args) {
       car c1 = new Maruti();
        car c2 = new Innova();
        car c3 = new Ferrari();

        Road r = new Road();

        r.permit(c1);
        r.permit(c2);
        r.permit(c3);

        Maruti  m = (Maruti)c1;
        Innova   i = (Innova)c2;
        Ferrari  f = (Ferrari)c3;

        m.racing();
        i.hitandKill();
        f.writeEssay();
    }
}
