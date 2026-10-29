class Parent{
    public Parent(){
        this("Ramesh");
        System.out.println("This is Parent constructor");
    }

    public Parent(String name){
        System.out.println("My name is "+name);
    }
}
class Child extends Parent{
    public Child(){
        super();
        System.out.println("This is Child constructor");
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        Child obj = new Child();
    }
}
//? Inside every constructor by default super() is present. super() inside a constructor is used to call the parent class non-parameterized constructor.

//? while super(arguments) is used to call the parent class parameterized constructor.

//? We can use the "super" keyword to call the parent class members.

//? this() and super() can't use simultaneously, because this() or super() both must be the first line inside a constructor.

//? Again as this(a non-static reference variable) that points to the current object through which the method is called, when we place it inside a static context(that use only classname to work without object), can't identify why the "this" is placed here. Again also the static context not guarantees that the object is created or placed in memory or not, even if placed in memory, but it not come in the use of accessing static context. Due to this reason "this" is restricted inside a static context in java.

//? Again also the "super" is restricted inside a static context because super is a nonstatic reference variable that points to the parent object, and again a object is not required to access a static member so their relation is not possible, so due to this reason the "super" is also restricted from present inside a static context.