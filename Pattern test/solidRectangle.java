import java.util.*;
public class solidRectangle{
       public static void main(String args[]){
         System.out.println("Enter the numers:");
         Scanner obj = new Scanner(System.in);
         int n = obj.nextInt();
         for(int row=1;row<=n;row++){
            for(int coloum=1;coloum<=n;coloum++){
              System.out.print("*");
            }
            System.out.println();
         }
       }
}