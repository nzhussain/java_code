import java.util.Scanner;
public class pascals_triangle {
    public static void main(String args[]){
        Scanner Obj = new Scanner(System.in);
        System.out.print("Enter the Input(n):");
        int n = Obj.nextInt();
        /* <<<---pascals_triangle--->>> */
        //case 1: when int r=0; and int c=0;
        for(int r=0;r<n;r++){
            for(int s=1;s<=(n-r);s++){
                System.out.print(" ");
            }
            int value=1;
            for(int c=0;c<=r;c++){
                 if(c==0||r==c){
                    value=1;
                 }else{
                    value=value*(r-c+1)/c;//then use this formula for pascal's triangle
                 }
                 System.out.printf("%2d",value);
            }
            System.out.println();
        }
        //case 2: when int r=1; and int c=1;
        for(int r=1;r<=n;r++){
            for(int s=1;s<=(n-r);s++){
                System.out.print(" ");
            }
            int value=1;
            for(int c=1;c<=r;c++){
                 if(c==1||r==c){
                    value=1;
                 }else{
                    value=value*(r-c+1)/(c-1);//then use this formula for pascal's triangle
                 }
                 System.out.printf("%2d",value);
            }
            System.out.println();
        }
    }
}
