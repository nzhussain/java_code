import java.util.Scanner;
public class floyed_Triangle {
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the input(n):");
        int n = obj.nextInt(); //n=4
        int count=1;
        /* <<<---Floyed Triangle--->>> */
        //Outer Loop
        for(int r=1;r<=n;r++){ //r=1,2,3,4
            
             //Inner Loop
            for(int c=1;c<=r;c++){
                System.out.print(count); //1" ",2,3" ",4,5,6" ",7,8,9,10
                count++;//2,3,4,5,6,7,8,9,10
            }
            System.out.println();
        }
    }
}
