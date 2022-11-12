//program that ask user to enter their marks and it computes their average marks
package average;
//importing scanner
import java.util.Scanner;

public class Average {
//declaring variables
    static int HCI,networking,maths,cabling,java;
    static float average;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //ask user to enter marks of Hci
        System.out.println("enter marks of HCI");
        HCI=input.nextInt();
        //ask user to enter marks of networking
        System.out.println("enter marks of networking");
        networking=input.nextInt();
        //ask user to enter marks of maths
        System.out.println("enter marks of maths");
        maths=input.nextInt();
        //ask user to enter marks of cabling
        System.out.println("enter marks of cabling");
        cabling=input.nextInt();
        //ask user to enter marks of java
        System.out.println("enter marks of java");
        java=input.nextInt();
        average=(HCI+networking+maths+cabling+java)/5;
        System.out.println("average of marks is"+average);
    }
    
}
