import java.util.Scanner;
public class Decreament {
    public static void main(String args[]){
        System.out.println("Enter the numbers :");
        Scanner obj = new Scanner(System.in);
        
        float a= obj.nextFloat(); //5.0
        int b = obj.nextInt();  //7
        short c = obj.nextShort(); //4
        double d = obj.nextDouble(); //12.0
        
        System.out.println("for float a :");
        System.out.println(a--); //5.0--->4.0
        System.out.println(--a); //3.0
        System.out.println("for Int b :");
        System.out.println(b--); //7--->6
        System.out.println(--b); //5
        System.out.println("for short c :");
        System.out.println(c--); //4--->3
        System.out.println(--c); //2
        System.out.println("for Double d :");
        System.out.println(d--); //12.0--->11.0      
        System.out.println(--d); //10.0

    }
}
