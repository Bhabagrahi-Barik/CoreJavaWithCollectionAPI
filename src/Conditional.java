public class Conditional {
    public static void main(String[] args) {

        int age = 25;
        boolean citizenOfIndia = true;
        boolean voterCard = true;

        if(age>=18){
            if(citizenOfIndia){
                if(voterCard){
                    System.out.println("You can vote");
                }
                else{
                    System.out.println("You cannot vote as you don't have voter card");
                }
            }
            else{
                System.out.println("You cannot vote as you don't have citizenship of India");
            }
        }
        else{
            System.out.println("You are a teenager");
        }



//? =========== SWITCH STATEMENT ==============================================================

    String c = "MON";

    switch(c){
        case "SUN":
            System.out.println("SUNDAY");
                break;
        case "MON":
            System.out.println("MONDAY");
                break;
        case "TUE":
            System.out.println("TUESDAY");
                break;
        case "WED":
            System.out.println("WEDNESDAY");
                break;
        case "THU":
            System.out.println("THURSDAY");
                break;
        case "FRI":
            System.out.println("FRIDAY");
                break;
        case "SAT":
             System.out.println("SATURDAY");
                break;
        default:
            System.out.println("Enter valid thing.....");
    }

    }
}
//? In Java, switch case values can be byte, short, char, int (and their wrapper classes), String, and enum types.
//
//?Floating-point types (float, double), long, and boolean are not allowed.