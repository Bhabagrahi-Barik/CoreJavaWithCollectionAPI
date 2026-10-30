abstract class I{
    public abstract void play();

    public abstract void stop();

    public void config(){
        System.out.println("I's config");
    }

    static void seen(){
        System.out.println("I seen");
    }
}
abstract class I1 extends I{

    @Override
    public void play() {
        System.out.println("I's play");
    }
}

class I2 extends I1{

    @Override
    public void stop() {
        System.out.println("I2's stop");
    }
}

public class AbstractKeyword {
    public static void main(String[] args) {
        I2 i2 = new I2();
        i2.config();
        i2.play();
        i2.stop();

        I.seen();
    }
}

//todo=============== "abstract" keyword in java ==========================
//? "abstract" keyword is used to make something abstract or we can say achieve abstraction.
//? We can create a abstract method using the abstract keyword. Abstract methods have no method definition, means abstract methods are methods with no method body. And abstract methods must be present inside a abstract class. But is it not mandatory that an abstract class only can contain abstract methods.
//? If we create an abstract method in the parent class then we must have to give the implementation for the abstract method in the child class. If we failed to give implementation for the abstract method in the child class, then we have to make the child class as abstract class and create a child class again for it and provide the implementation the new child class.

//? Abstraction is one of the fundamental concept of oops in java like Encapsulation, Inheritance, and Polymorphism.

//todo Why we can't instantiate abstract class and interface in java ?
//? We can't instantiate an abstract class because abstract class may have abstract methods(methods with no implementation), if java allows us to create object of it then theoretically we can call the abstract class methods. Then if the java compiler call the abstract methods then it get confused because what he executes because abstract methods has nobody. So due to this java restricted the abstract class instantiation. Again interface methods are by default public and abstract, so the same above scenario arises while creating object for interface.

// todo Again if we can't create abstract class objects then why there is constructor present in abstract class ?
//? Even if we can't instantiate abstract class, but when the abstract methods implementations we provide from the subclass then from the subclass's constructor by default the abstract class's constructor(nonparameterized) called, because every constructor has super() by default in it. And we all know that we use constructor to instantiate the instance fields, so if we want to instantiate the abstract class fields then we can do it.

//todo Why we can't make abstract class and interface methods private ? Again why we can't write default keyword in abstract methods but can write inside an interface in Java ?
//? The abstract keyword and the private modifier are mutually exclusive. An abstract method is a contract that has no body and must be overridden by a child class. However, a private method is accessible only within the class where it is declared and is hidden from all subclasses. Because a subclass cannot see or access a private method, it cannot override it. Therefore, making an abstract method private creates a logical contradiction.

//? The default keyword was introduced in Java 8 specifically for interfaces to allow backward compatibility—it lets us add concrete methods with a body to an interface without breaking existing implementing classes. Since all interface methods are implicitly public abstract by default, the default keyword is required to tell the compiler: 'This interface method has an implementation.'

//? In contrast, abstract classes already support fully implemented (concrete) methods naturally. If you want a method with a body inside an abstract class, you simply declare it as a regular method without any extra keyword. Adding the default keyword inside an abstract class is invalid syntax because default in this context is exclusively an interface feature.

//todo Why we can't create static methods inside an abstract class or also inside an interface without providing method body to it ?
//? Because we know that if we not provide method body then the methods are abstract, so to provide implementation or method body we need to override it in a child class, but the issue is we can't override a static method. So we can't make the static methods of java's interface and abstract class as abstract methods.
