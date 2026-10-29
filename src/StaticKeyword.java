class A {
    public static void play(){
        System.out.println("Play cricket");
    }
}

class B extends A {
//!    @Override -> It is not allowed on the top of static methods. We can't override static methods , bcz overriding is the concept related to runtime polymorphism where which child class method to call is decided at runtime after object id created. But static methods or static members not related to runtime polymorphism they are related to compile time polymorphism means which method to call is decided by compiler at compile time by the references. So If we declare a static method in a subclass with the exact same signature as a static method in the superclass, it is called method hiding, not method overriding.
    public static void play(){
        System.out.println("Play Football - Method hiding");
    }
}

public class StaticKeyword {

    //? static variables are get memory only once at the time of class loading before the object creation even before the constructor is called.
    public static int a;

    public static void display(){
        System.out.println("Display something");
    }//? Remember the 4 rules of accessing static members.

    static{
        a=10;
    }//? Static block is used to initialize static fields. And static block is executed first, if there are multiple static block then the execution follows the order of static blocks.

    public static void main(String[] args) {
        System.out.println("Inside the same class a: "+a);
        display();

        B a = new B();
        a.play();
    }

}
//? Static keyword is used for efficient memory management because we can access static members(variables, methods, classes, blocks) without creation object, can access through classname. Again static members are belong to class level not individual objects, means static members are shared by all objects of the class for all objects static members are same, means any changes though one object changes that members value for all objects of the class.


//? Main method in java is static because we know to access non-static members we need objects.Aagain we know main method is the entry point for execution of a Java program so if we not make main method static then to create object execution need to enter to main method and to execute main method JVM need object of that class, so it becomes a circular dependency kind of thing. So to avoid this circular dependency we make JAVA'S main method static.