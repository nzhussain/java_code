import java.util.Scanner;
public class Zero_One_triangle {
    public static void main(String args[]){
          Scanner Obj = new Scanner(System.in);
          System.out.println("Enter the input(n):");
          int n = Obj.nextInt();
          /* <<<---01 Triangle--->>> */
          //Outer Loop
          for(int r=1;r<=n;r++){

            //Inner Loop
            for(int c=1;c<=r;c++){
                if((r+c)%2==0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
          }
    }
}
