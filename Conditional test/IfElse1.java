import java.util.*;

public class IfElse1 {
    public static void main(String args[]){
        float a;
        System.out.println("Enter the AGE:");
        Scanner obj = new Scanner(System.in);
        a=obj.nextFloat();
        
        if(a>17.99){
            System.out.println("Able to vote");
        }
        else{
            System.out.println("Note able to vote");
        }
    }
}
