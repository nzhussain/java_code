import java.util.Scanner;
public class blackWhiteGrid {
    public static void main(String args[]){
        Scanner Obj = new Scanner(System.in);
        System.out.print("Enter the Input(n):");
        int n = Obj.nextInt();
        //Outer Loop for rows
        for(int r=1;r<=n;r++){
            //Inner Loop for Numbers a/c to their arrangement
            for(int c=1;c<=n;c++){
                if(r==1||r==n||c==1||c==n){
                    System.out.print("4");
                }else if(r==2||c==2||r==(n-1)||c==(n-1)){
                    System.out.print("3");
                }else if(r==3||c==3||r==(n-2)||c==(n-2)){
                    System.out.print("2");
                }else if(r==4||c==4||r==(n-3)||c==(n-3)){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
