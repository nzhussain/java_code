public class Calculation {
     public static void main(String args[]){
        System.out.println("Enter the numbers :");
        /* int a=10;
        int b=5;
        int sum = a+b;
        System.out.println("Sum :");
        System.out.println(sum);
        int mul=a*b;
        System.out.println("Multiplication :");
        System.out.println(mul);
        int sub=a-b;
        System.out.println("Subtraction :");
        System.out.println(sub);
        int div=a/b;
        System.out.println("Divition :");
        int rem=a%b;
        System.out.println("Remender :");
        System.out.println(rem); */

        //Qus--> a*b whole divide by a-b

        float a=5;
        float b=2;
        float ans=(a*b)/(a-b); // java calculate from left to right a line of code then first use BODMAS rule
        System.out.println(ans);

     }
}
