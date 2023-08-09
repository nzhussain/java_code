// <<<--Logical Operator;
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;
public class LogicalOp {
    public static void main(String args[]){
        System.out.println("Enter the numbers :");
        Scanner obj = new Scanner(System.in);
        double a = obj.nextDouble();
        double b = obj.nextDouble();

        //<<-Logical AND(&&);
        System.out.println("<<--Logical AND(&&)-->>");
        System.out.println("true/false :"+((a>b)&&(a<b))); //false
        System.out.println("true/false :"+((a>b)&&(a>b))); //true
        System.out.println("true/false :"+((5!=4)&&(3!=4))); //true
        System.out.println("true/false :"+((a==b)&&(a==b))); //false
        System.out.println("true/false :"+((4<=7)&&(9>=2))); //true
        System.out.println("true/false :"+((10.4!=5)&&(3<4))); //true

       //<<-Logical OR(||);
       System.out.println("<<--Logical OR(||)-->>");
       System.out.println("true/false :"+((a>b)||(a<b))); //true
       System.out.println("true/false :"+((a>b)||(a>b))); //true
       System.out.println("true/false :"+((5!=4)||(3!=4))); //true
       System.out.println("true/false :"+((a==b)||(a==b))); //false
       System.out.println("true/false :"+((4<=3)||(9>=10.8))); //false
       System.out.println("true/false :"+((10.4!=5)||(3<4))); //true

       //<<-Logical NOT(!);
       System.out.println("<<--Logical NOT(!)>>");
       System.out.println("true/false :"+!(a>b)); //false
       System.out.println("true/false :"+!(a<b)); //true
       System.out.println("true/false :"+!(5!=4)); //false
       System.out.println("true/false :"+!(a==b)); //true
       System.out.println("true/false :"+!(4!=3)); //false
       System.out.println("true/false :"+!(10.4<5)); //true
    }
}
