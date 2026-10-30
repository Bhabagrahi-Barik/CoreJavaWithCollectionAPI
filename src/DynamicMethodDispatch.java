class H{
    public void show(){
        System.out.println("H show");
    }

    public void config(){
        System.out.println("H config");
    }
}

class H1 extends H{
    public void display(){
        System.out.println("H1 display");
    }

    @Override
    public void config(){
        System.out.println("H1 config");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        H h = new H1(); //? UpCasting/ Dynamic method dispatch are related or same we can say.
        h.show();
        h.config(); //! Here the overridden method must be called instead the parent.

        H1 h1 = (H1) h; //? DownCasting to access child's method except overridden method.
        h1.display();
    }
}

//? Dynamic method dispatch is the process where which method to call is decided by the jvm at runtime by seeing the actual object.

//todo ================= METHOD OVERRIDING VS DYNAMIC METHOD DISPATCH ================

//* We can say that method overriding is the key to achieve dynamic method dispatch.
//? In case of method overriding which method to call decided by jvm seeing the actual object. Ex:- If Animal is parent, Dog and Cat is its two child then which overridden method to call (means Cat's overridden method or Dog's overridden method) is decided at runtime by JVM after the object creation.
//* Ex:-           Dog d = new Dog(); d.eat(); here eat is the overridden method.

//? In case of Dynamic Method Dispatch which method to call is decided by jvm at runtime by seeing the actual object. Again in Dynamic Method Dispatch a child object is stored inside the parent reference. And through the parent reference we only can call the parent methods. Because at compile-time compiler check that this is a parent reference and I can call parent method. But after object creation at runtime if jvm not found any overridden method in child class then it allows us to only call the parent method. But if any overridden method is present there in child class then the overridden method is called as actual object is child type.
//* Ex:-          Animal a = new Dog(); here only i can call the parent method, if there is any overridden method then that overridden method is called as the actual object is child type .

//? But except the overridden method if we want to call the rest child methods then we need to perform downCasting.

