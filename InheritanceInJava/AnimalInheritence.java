class Animal{
    public void eat(){
        System.out.println("animal is eating");
    }
    public void breath(){
        System.out.println("animal is breathing");
    }

     public void sleep(){
    System.out.println("animal is sleeping");
     }
}

class Dear extends Animal{
    public void eat(){
        System.out.println("animal is eating the grass");
    }
    public void foodHabit(){
        System.out.println("animal has a habit of herbivores");
    }
}

class Tiger extends Animal{
      public void eat(){
          System.out.println("animal is eating the dear");
      }
      public void foodHabit(){
          System.out.println("animal has habit od the carnivores");
      }
}


class Monkey extends Animal{
    public void eat(){
        System.out.println("animal is eating the banana");
    }
    public void foodHabit(){
        System.out.println("animal has habit of the omnivores");
    }
}


public class AnimalInheritence {
    static void main(String[] args) {

        System.out.println("\n");


        Dear s1 = new  Dear();
        Tiger s2 = new Tiger();
        Monkey s3 = new Monkey();

        s1.eat();
        s1.breath();
        s1.foodHabit();
        s1.sleep();
        System.out.println("\n");

        s2.eat();
        s2.breath();
        s2.foodHabit();
        s2.sleep();
        System.out.println("\n");

        s3.eat();
        s3.breath();
        s3.foodHabit();
        s3.sleep();



    }
}
