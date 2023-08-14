import java.util.Scanner;

public class Switch1 {
    public static void main(String args[]){
       int button;
        System.out.println("click the button");
        Scanner obj = new Scanner(System.in);
        button=obj.nextInt();

        switch(button){
            case 1: System.out.println("room light");
            break;
            case 2: System.out.println("Washroom light");
            break;
            case 3: System.out.println("Bedroom light");
            break;
            default:System.out.println("invalid button");
        }
    }
}
// public class Switch1 {
//     public static void main(String[] args) {
//         Scanner obj = new Scanner (System.in);
//         int n = obj.nextInt();
//         for(int i=1;i<=10;i++){
//             System.out.println(n+" "+"x"+" "+i+" "+"="+" "+n*i);
//         }
//     }
// }