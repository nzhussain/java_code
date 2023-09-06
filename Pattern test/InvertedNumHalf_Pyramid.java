import java.util.Scanner;
public class InvertedNumHalf_Pyramid {
    public static void main(String args[]){
        Scanner Obj = new Scanner(System.in);
        System.out.print("Enter the Input(n):");
        int n = Obj.nextInt();
        /* <<<---Inverted numberic half Pyramid--->>> */
        //Outer Loop for rows
        for(int r=1;r<=n;r++){
            //Inner Loop for inverted number
            for(int c=n;c>=r;c--){
                System.out.print(r);
            }
            System.out.println();//line break
        }
    }
}
