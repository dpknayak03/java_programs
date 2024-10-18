package Abstraction.Anonymous;

abstract class Animal {

    abstract void sound();
}
 class car{
    void run()
    {
       System.out.println("Caar is running highly ");
    }
    
 }

public class abstract_trial{

    public static void main(String[] args) {

        Animal cat= new Animal(){ /// Anonymous class



            void sound(){

                System.out.println("Maow");

            }

        };

        cat.sound();
        car c1=new car(){
            void run(){ //normal class has an anonyomus class
                System.out.println("i am called in  anonymous class");
            }
        };
        c1.run();
    }

}

