import java.util.Scanner;
public class number_Pyramid {
    public static void main(String args[]){
        Scanner Obj = new Scanner(System.in);
        System.out.println("Enter the Input(n):");
        int n = Obj.nextInt();
        /* <<<---Number Pyramid--->>> */
        //Outer Loop
        for(int r=1;r<=n;r++){
            //Inner Loop for space
            for(int s=1;s<=(n-r);s++){
                System.out.print(" ");
            }
            //Inner Loop for Number
            for(int c=1;c<=r;c++){
                System.out.print(r+" ");
            }
            System.out.println();
        }
    }
}
