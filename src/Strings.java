import java.sql.SQLOutput;
import java.util.Locale;

public class Strings {
    public static void main(String[] args) {

//        String s = "Akash";
//        String s1 = "Akash";
//        System.out.println(s1 == s);

//        String s = new String("Akash");
//        String s1 = new String ("Akash");
//        System.out.println(s1 == s);

//        String s = "Akash";
//        String s1 = new String("Akash");
//        System.out.println(s1 == s);


//? ==================== String methods ===========================================

        String s = "Hello World Hello World";
        String s1 = "Akash";
        String s2 = "   Aviram";
        String s3 = " Daniel ";
        String s4 = "daniel";

        System.out.println(s.length());
        System.out.println(s1.concat(s2));
        System.out.println(s.charAt(0));
        System.out.println(s.indexOf("Hello"));
        System.out.println(s.lastIndexOf("Hello"));
        System.out.println(s.substring(1, 5));

        System.out.println(s.isEmpty());
        System.out.println(s.isBlank());
        System.out.println(s.contains("Hello"));
        System.out.println(s.startsWith("Hello"));
        System.out.println(s.endsWith("Hello"));
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode() == s2.hashCode());
        System.out.println(s3.equalsIgnoreCase(s4));

        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(s.replaceAll("H", "Ke"));
        System.out.println(s1.replace('k', 'p'));
        System.out.println(s3.trim());


        System.out.println(String.join(" ","Akash", "Barik"));

//?        System.out.println(s.split(" ")); //? The code does not give the expected output because Java arrays do not override the default toString() method.When you run System.out.println(s.split(" "));, you are printing the array object itself rather than its contents. This results in a technical memory address reference (hashcode) look like this:[Ljava.lang.String;@25154fbd

//        String[] k = s.split(" ");
//        for(String m:k){
//            System.out.print(m+ " ");
//        }


        String p = s1.intern(); //? The intern() method check for the String literal in scp, if specific string is present then it take the reference of it and provide the ref to those where intern() is used on that exact string(s1.intern()) , but if not present then create in the scp and return this new reference.
        System.out.println(s1 == p);


        char[] c = s1.toCharArray();
        for(char cc : c) {
            System.out.print(cc+ " " );
        }
        System.out.println("");


        byte[] b = s1.getBytes();
        for(byte bb : b) {
            System.out.print(bb+ " " );
        }
        System.out.println("");


        System.out.println(String.format("Hii this is %s" , s1));

        System.out.println(s1.toString());//? The toString() method of the String class simply returns the string itself.
    }
}
//? These are above methods of String are length(), concat(), indexOf(), lastIndexOf(), subString(), trim(), replace(), replaceAll(), strip(), toUpperCase(), toLowerCase(), toCharArray(), getBytes(), split(), join(), intern(), format(), charAt(), isEmpty(), isBlank(), startsWith(), endsWith(), compareTo(), equals(), hashCode(), toString(), contains(), equalsIgnoreCase() etc are String methods .

//? ==========StringBuffer Vs StringBuilder=================================
//* StringBuffer released on jdk

//Todo StringBuffer comes in jdk 1.0 and StringBuilder in jdk 1.5.
//Todo StringBuffer Methods are synchronised(means only 1 thread can execute the method) but not of StringBuilders.
// Todo StringBuffer is thread safe but not StringBuilders.
//Todo StringBuffer is slow than StringBuilder.