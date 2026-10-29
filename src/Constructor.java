public class Constructor {
    public Constructor() {
        this("Ram");
    }
    public Constructor(String name) {
        System.out.println("The name is: "+name);
    }

    public static void main(String[] args) {
        Constructor obj = new Constructor();
    }
}
//?Constructor is a special type of method contains set of instructions to perform a specific task. The constructor have no return type even void also, same name with the class name, we can call the constructor when creating object of the class with new keyword.

//? We use constructor to initialize the instance variables of the class.

//? When we not create a constructor explicitly then java provides the default constructor(non-parameterized constructor), but if we create a constructor then java not provide the constructor automatically, in this situation if we want a constructor then we have to create it explicitly.
