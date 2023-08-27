import java.util.Scanner;
public class solid_Rombus {
    public static void main(String args[]){
        Scanner Obj = new Scanner(System.in);
        System.out.println("Enter the Input(n):");
        int n = Obj.nextInt();
        /* <<<---Solid Rombus--->>>> */
        //Outer Loop
        for(int r=1;r<=n;r++){
            //Inner Loop for space
            for(int s=1;s<=(n-r);s++){
                System.out.print(" ");
            }
            //Inner Loop for Star
            for(int c=1;c<=n;c++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
