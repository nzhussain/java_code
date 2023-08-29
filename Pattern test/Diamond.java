import java.util.Scanner;
public class Diamond {
    public static void main(String args[]){
         Scanner Obj = new Scanner(System.in);
         System.out.print("Enter the Input(n):");
         int n = Obj.nextInt();
         /* <<<---Diamond Pattern--->>> */
         //Outer Loop for Rows Uper
         for(int r=1;r<=n;r++){
            //Inner Loop for Uper scpace
            for(int s=1;s<=(n-r);s++){
                System.out.print(" ");
            }
            //Inner Loop for Uper stars(from one)
            for(int c=1;c<=r;c++){
                System.out.print("*");
            }
            //Inner Loop for Uper stars(form 2nd)
            for(int d=2;d<=r;d++){
                System.out.print("*");
            }
            System.out.println();//line break
         }
         //Outer Loop for rows Down 
         for(int r=n;r>=1;r--){
            //Inner Loop for space (down)
            for(int s2=1;s2<=(n-r);s2++){
                System.out.print(" ");
            }
            //Inner Loop for stars(down-lest)
            for(int c2=1;c2<=r;c2++){
                System.out.print("*");
            }
            //Inner Loop for stars(down-right)
            for(int d2=1;d2<=(r-1);d2++){
                System.out.print("*");
            }
            System.out.println();//line break
         }

    }
}
