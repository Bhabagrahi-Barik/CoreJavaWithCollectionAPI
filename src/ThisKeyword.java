class This1{

    int age = 80;
    int distance;

//    public static void run(int distance){
//        this.distance = distance; //? Here see we got a red line by compiler because, we can't use "this" inside a static context. Because "this" is a non-static reference variable that points to the current object on which the method is called . And we know that static members are shared by all objects of a class, so due to this even if the object is present along with some other objects in memory, but java doesn't find out which object to point to or we can say which object to use .
//    }

    public This1(int amount){
        System.out.println("This amount is "+amount);
    }

    public void display(){
        System.out.println(this.age);
        display2(); //behind the scene this.display2();
    }

    public void display2(){
        System.out.println("It is display2.");
    }

    public This1(){
        this(20);
    }
}

public class ThisKeyword {

    public static void main(String[] args) {
        This1 obj = new This1();
        obj.display();
    }
}
//? We can't use this inside a static context.
//? We can return "this", when we want to return object as "this" is a non-static reference variable.
//? We know that we can directly call a non-static method from another non-static method if both are in the same class, but behind the scene "this" is used there(like this.display() inside that method), as this is a non-static reference variable and points to the object on which the method is called.
//? We use this to distinguish between local and instance variable.

//? this() invokes the no-argument (non-parameterized) constructor of the same class.
//? this(arguments) invokes a parameterized constructor of the same class that matches the specific data types passed in.