import java.util.Scanner;
public class Increament {
    public static void main(String args[]){
        System.out.println("Enter the numbers :");
        Scanner obj=new Scanner(System.in);
        float a= obj.nextFloat(); //5
        int b=obj.nextInt(); //8
        short c= obj.nextShort(); //3
        double d=obj.nextDouble(); //10

        System.out.println("for float a :");
        System.out.println(a++); //5.0--->6.0
        System.out.println(++a); //7.0

        System.out.println("for Int b :");
        System.out.println(b++); //8--->9
        System.out.println(++b); //10

        System.out.println("for short c :");
        System.out.println(c++); //3--->4
        System.out.println(++c); //5
        
        System.out.println("for double d :");
        System.out.println(d++); //10.0--->11.0
        System.out.println(++d); //12.0

    }
}  
