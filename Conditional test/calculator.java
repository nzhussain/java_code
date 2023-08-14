import java.util.Scanner;
public class calculator {
    public static void main(String args[]){
         Scanner obj=new Scanner(System.in);
       
        int input;
        String operator;
        
        do{
            System.out.println("enter input for continue(1) & for stop(0):");
            input=obj.nextInt();
            operator=obj.nextLine();// it provide support of 2nd of operator=obj.nextLine();
                                    //  so that it take of it as input or do the a empty string.
            System.out.println("Enter the operator:");
            operator=obj.nextLine();

            // operator=obj.next(); --> also use then we not use of two times of "operator=obj.nextLine();"
                                    //due to this directly take the input and empty the string 

            System.out.println("Enter the value of a:");
            double a = obj.nextDouble();
            System.out.println("Enter the value of b:");
            double b = obj.nextDouble();

            switch(operator){
            case "+":System.out.println("addition is :"+(a+b));
            break;
            case "-":System.out.println("subtraction is :"+(a-b));
            break;
            case "*":System.out.println("multiplication is :"+(a*b));
            break;
            case "/":System.out.println("divition is :"+(a/b));
            break;
            case "%":System.out.println("modulation is :"+(a%b));
            break;
            default:System.out.println("invalid");   
            }
        }while(input==1);
   

        // System.out.println("Enter the number");
        //  Scanner obj=new Scanner(System.in);
        // String operator=obj.nextLine();
        // System.out.println("Enter the value of a:");
        // double a = obj.nextDouble();
        // System.out.println("Enter the value of b:");
        // double b = obj.nextDouble();

        // switch(operator){
        //     case "+":System.out.println("addition is :"+(a+b));
        //     break;
        //     case "-":System.out.println("subtraction is :"+(a-b));
        //     break;
        //     case "*":System.out.println("multiplication is :"+(a*b));
        //     break;
        //     case "/":System.out.println("divition is :"+(a/b));
        //     break;
        //     case "%":System.out.println("modulation is :"+(a%b));
        //     break;
        //     default:System.out.println("invalid");
        // }
    }
    
}
