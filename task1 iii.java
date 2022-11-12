//program that helps students learn divisibility test
package divisibility.text;
//import scanner 
import java.util.Scanner;

public class DivisibilityText {
    //declaring variables
static int number;
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //ask user to enter any number
        System.out.println("enter any number");
        number =input.nextInt();
        if(number % 5==0){
            System.out.print(number+"is divisible by 5");
        }
        else 
            if(number % 2==0){
            System.out.print(number+"is divisible by 2");
        }
         else 
            if(number % 3==0){
            System.out.print(number+"is divisible by 3");
        }
         else 
            if(number % 4==0){
            System.out.print(number+"is divisible by 4");
        }
       else 
            if(number % 6==0){
            System.out.print(number+"is divisible by 6");
        }
         else 
            if(number % 7==0){
            System.out.print(number+"is divisible by 7");
        }
              else 
            if(number % 8==0){
            System.out.print(number+"is divisible by 8");
        }   
             else 
            if(number % 9==0){
            System.out.print(number+"is divisible by 9");
        }
                 else 
            if(number % 1==0){
            System.out.print(number+"is divisible by 1");
        }
        
    }
    
}
