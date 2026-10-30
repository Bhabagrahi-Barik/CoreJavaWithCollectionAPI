class G{
    public void play(){
        System.out.println("G play");
    }

    public void show(){
        System.out.println("G show");
    }
}
class G1 extends G{
    public void eat(){
        System.out.println("G1 eat");
    }
}

public class ObjectCasting {
    public static void main(String[] args) {
        G g = new G1(); //todo upCasting -> Here we can access only parent methods look clearly here dynamic method dispatch works.
        g.play();
        g.show();

        G1 g1 = (G1) g; //todo downCasting -> Here we can access the child methods.
        g1.eat();
    }
}

//?Object casting is the process where the reference of one object is assigned to the reference of another. It is of 2 types:
                        //? 1) UpCasting -> process where the reference of Child object is assigned to the reference of Parent. It is safe because every child is basically a type of its parent. It is also known as widening casting.

                        //? 2) DownCasting ->  process where the reference of Parent object is assigned to the reference of Child. It is known as Narrowing casting. It is not safe, because while performing narrowing casting we need to make sure the source type(parent reference which hold child object as of upcasting) hold the actual object of target type(Child type). If type mismatch happens then we get "ClassCastException". So before performing narrowing casting we need to conform that the source reference(the object going to change) is the actual object of target type or not using the "instanceOf" operator.

/* todo In Java, the instanceof operator is used to test whether an object is an instance of a specific class, a subclass, or implements a particular interface.

**Ex:-

        Animal myAnimal = new Animal()
        Dog myDog = new Dog();

        System.out.println(myAnimal instanceof Dog); (false)
        System.out.println(myDog instanceof Animal);  (true)
        System.out.println(myDog instanceof Dog); (true)

todo Just like with classes, the instanceof operator can also be used with interfaces in Java.It checks whether an object's class implements a specific interface (or inherits from a class that implements it). It still returns true or false.

***Ex:-
        Bird myBird = new Bird();
        Car myCar = new Car();

        System.out.println(myBird instanceof Flyable);
        Output: true (Because Bird implements Flyable)

        System.out.println(myCar instanceof Flyable);
        Output: false (Car does not implement Flyable) */