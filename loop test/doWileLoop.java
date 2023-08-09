import java.util.Scanner;

public class doWileLoop {
    public static void main(String Zn[]){
        System.out.println("Enter the name:");
        Scanner obj=new Scanner(System.in);
        String a=obj.nextLine();
        int x=0;
        do{
            System.out.println(a);
            x++;
        }while(x<=4);

        // <<<--condition wronge-->>
        // int a = obj.nextInt();
        // int x=0;
        // do{
        //     System.out.println(a);
        // }while(x>=a);

    }
}
