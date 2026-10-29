class E{
    public final void show(){
        System.out.println("Hello World1");
    }
}

class E1 extends E{
//    public void show(){
//        System.out.println("Hello World2");
//    } //todo Can't override a final method .
}

final class F{

}

//class F1 extends F{
//
//} //todo Can't inherit from a final class.

public class FinalKeyword {
    final int a = 19;
    public static void main(String[] args) {
        FinalKeyword fk = new FinalKeyword();

        // fk.a = 20; //todo Can't change its value.
    }
}


//? To make a field constant we use public, static, final keywords.

//? In Java, we use final keyword to make constants. Again java tells us to provide a value to a final variable before using it so that I can guarantee immutability of the variable.

//? When we make a variable final, we cannot reassign or modify the variable itself once it is initialized.However, if the final variable holds a reference to an object, the reference becomes unchangeable, but the object itself remains mutable. This means we cannot make the variable point to a new object, but we can still modify the internal state or properties of that existing object.

//? Again if we only declare a final variable but not initialize it during declaration then we can initialize it inside/from the constructor.