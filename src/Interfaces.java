//? Remember an abstract class can also implement an interface .

interface Interface1 {
    void start(); //!Multiple inheritance through interface.

    default void show(){
        System.out.println("We don't need to override these default methods in an child as we provide body to the method directly here.");
    }
}
interface Interface2 {
    void start(); //!Multiple inheritance through interface.

    static void play(){
        System.out.println("We don't need to override these static methods in an child as we provide body to the method directly here.");
    }
}
class Son implements Interface1, Interface2 {

    @Override
    public void start() { //!Multiple inheritance through interface.
        System.out.println("Child 1");
    }
}
public class Interfaces {
    public static void main(String[] args) {
        Son son = new Son();
        son.start();

        son.show();//! Here as the Son is child of Interface1, so it has the access to the default show() present in Interface1, so due to this i access here the default method through the child object.

        Interface2.play(); //! Access the static method using Interface name.

    }
}

//todo What is the difference between an abstract class and an interface in Java, and why is it traditionally said that interfaces achieve 100% abstraction while abstract classes do not ?
// OR
//todo Can you explain how abstract classes and interfaces differ when it comes to holding state versus defining behavior ?
// OR
//todo With features like default methods introduced in modern Java, does the concept of '100% abstraction' in interfaces still hold true today ?

//? The core difference between an abstract class and an interface comes down to State vs. Contract.

//? Abstract Classes provide Partial Abstraction: An abstract class is a partial blueprint. It can contain instance fields (state), constructors, and concrete methods alongside abstract methods. Because it can hold working code and maintain object state, it does not hide everything—giving us partial abstraction.

//? Interfaces provide Pure Abstraction (100%): An interface is a pure behavioral contract. It dictates what a class should do without specifying how. It cannot have instance fields or constructors, completely decoupling specification from state and implementation.

//* The Modern Java Nuance:
// ?While textbook definitions say interfaces give 100% abstraction, modern Java introduced concrete methods to interfaces—default and static methods in Java 8, and private helper methods in Java 9.
                                      //? However, even with these features, interfaces still cannot hold instance state (no non-static fields or constructors). So while modern interfaces can share default behavior, they still achieve 100% abstraction of state, preserving their role as pure architectural contracts.

//todo Why we can't create constructor inside interface ?
//? As we know that we use constructor to initialize instance fields. But inside interface our fields are by default public, static, and final. So to initialize static fields we need static blocks or we can say access static fields using class name so there is no matter of creating interface is here, again we can't instantiate interface .

//todo Why in java there is broken constructor chaining for interfaces ?
//? We know that a class can extends only a single class(due to multiple inheritance), but can implements multiple interfaces. Again we know that there is super() by default in every constructor that calls the immediate parent class constructor of the object for which the constructor is used (new ConstructorName()). So if java allows us to write constructors inside interfaces then the by default super() is automatically called, and again as a class can implements multiple interface, so we have multiple constructors(those which are present inside the interfaces which are parents for the class), and the diamond or ambiguity problem again now arises. So we can say that for interfaces in java the constructor chaining is broken or again it must be a reason for why java don't allowed us to create constructors inside interfaces in java.

//todo Which are the scenarios where we can face Diamond problem in java ?
//* The Diamond Problem is an ambiguity that occurs in object-oriented programming when a class inherits from multiple sources that share a common ancestor, leading to confusion over which version of a method or property to inherit.

//? Scenario 1: Multiple Interfaces with Conflicting Default Methods :
//!The Problem: A class implements two different interfaces, and both interfaces provide a default method with the exact same signature. The compiler gets confused about which default implementation to inherit.

//How to Resolve It:
//The compiler forces you to explicitly override the method in the implementing class. Inside your override, you can choose one implementation or combine them using the syntax: InterfaceName.super.methodName();.

///     public class MyClass implements InterfaceA, InterfaceB {
///     @Override
///     public void show() {
///         // Explicitly choose InterfaceA's version
///         InterfaceA.super.show();
///         // Or write custom logic
///        }
///    }

//?Scenario 2: Class Method vs. Interface Default Method (Class Wins Rule) :
//! The Problem: A class extends a parent class that has a concrete method, and at the same time implements an interface that has a default method with the exact same signature.

//How Java Resolves It:
//Java uses a strict "Class Wins" rule. The compiler automatically chooses the method from the parent class, completely ignoring the interface's default method. You don't even need to override it unless you want to change it.

///     class Parent {
///        public void display() { System.out.println("Parent class"); }
///    }
///    interface MyInterface {
///        default void display() { System.out.println("Interface default"); }
///    }
///
///    // Child inherits Parent's display(), Interface's display() is ignored.
///    class Child extends Parent implements MyInterface { }

//? Scenario 3: Interface Inheritance Chains (Hierarchical Conflicts) :
//! The Problem: Interface A has a default method. Interface B extends A and overrides that default method. Interface C also extends A (or defines its own default method with the same name). Finally, a class implements both B and C.

//How to Resolve It:
//The most specific interface wins. If B overrides A's method, B's version is considered more specific than A's. However, if B and C both inherit from A and both override the method differently, it triggers a compiler error, and the implementing class must explicitly resolve it using the InterfaceName.super.methodName() syntax just like in Scenario 1.

//*In Java, the diamond problem is prevented at the class level because Java doesn't support multiple class inheritance. It only appears in modern Java due to interface default methods. Java handles these conflicts using two rules: explicit resolution (via InterfaceName.super.methodName()) when two independent interfaces clash, and the 'Class Wins' rule when a parent class method conflicts with an interface default method.

//todo When to choose an Abstract Class vs. an Interface in real-time system design ?
//? We choose an Abstract Class when:
//! 1. Code Reusability: Write common logic once in the parent class instead of duplicating it across multiple children.
/// Example: Instead of writing the exact same sleep() or breathe() method inside Dog, Cat, and Cow classes, you write it once in the abstract Animal class and let all children inherit it.
//! 2. We need to maintain common state (instance variables) or constructors across subclasses.
//! 3. We want to use access modifiers other than public (like protected or private helper methods) for shared internal logic.

//? We choose an Interface when:
//! 1. Unrelated Classes (Common Behavior): When completely different classes need to perform the same actions even though they belong to different family trees.
/// Example: Both a Bird and an Airplane can Fly, even though a bird is an animal and an airplane is a machine.
//! 2. We want to achieve multiple inheritance of type (since a class can implement multiple interfaces).
//! 3. We are defining a capability or plugin behavior (e.g., "Runnable", "Serializable", "Comparable").


//todo What are the rules regarding variables/fields inside an Abstract Class versus an Interface ?
//? Inside an Abstract Class:
//! - Can have ANY type of variables: instance variables, static variables, final variables, non-final variables.
//! - Can have any access modifier: public, private, protected, or default (package-private).
//! - Can maintain mutable object state (values can change for each object instance).

//? Inside an Interface:
//! - All fields are implicitly public, static, and final (constants).
//! - You cannot declare regular instance variables or non-final fields because interfaces cannot maintain object state.
//! - Any variable declaration like `int x = 10;` is automatically treated as `public static final int x = 10; by the compiler.


//todo What are Marker Interfaces and Functional Interfaces (SAM) ?
//? 1. Marker Interface:
//! - An interface with zero methods and fields (empty interface).
//! - Used to "mark" or give a special permission/trait to a class so the JVM or framework knows how to handle it.
//! - Examples: `Serializable`, `Cloneable`, `Remote`.

//? 2. Functional Interface (SAM - Single Abstract Method):
//! - An interface that contains exactly one abstract method (though it can have multiple default or static methods).
//! - Annotated with `@FunctionalInterface`.
//! - Forms the foundation for Lambda Expressions and Method References in Java 8+.
//! - Example: `Runnable` (has only `run()`), `Comparator` (has only `compare()`).