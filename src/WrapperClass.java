public class WrapperClass {
    public static void main(String[] args) {

        Integer a = 1; //* Autoboxing -> behind the scene Ineger.valueOf() used
        System.out.println(a);

        int b = a; //* Auto unboxing -> behind the scene a.intValue() is used.
        System.out.println(b);

        String j = "123";
        int d = Integer.parseInt(j);
        System.out.println(d);

        String k = "true";
        System.out.println(Boolean.parseBoolean(k));
    }
}

//todo ================= WRAPPER CLASSES, BOXING & PARSING =================

//? Wrapper Class: A class whose object wraps or contains a primitive data type. It acts as the object representation of Java's primitive data types (e.g., Integer for int).

//? Autoboxing: The automatic conversion of a primitive type into its corresponding wrapper object by the compiler (internally using methods like Integer.valueOf()).

//? Auto-unboxing: The automatic conversion of a wrapper object back into its primitive data type (internally using methods like intValue(), doubleValue(), etc.).

//? Parsing: Methods like Integer.parseInt(), Short.parseShort(), etc., are used to convert a String representation of a number into a primitive data type.
//todo (Note: Character is the exception; it does not have a parseChar() method because you can extract characters from a string using .charAt(index) instead.)