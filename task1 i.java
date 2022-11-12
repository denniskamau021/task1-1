//program that ask useer to enter sir name and age then print number of characters 
package sirnametask;
//importing scanner
import java.util.Scanner;

public class Sirnametask {
//declaring variable
  static  String sirname;
   static int age;

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        
        //ask user to enter sirname
        System.out.println("\n enter sirname");
        sirname = sc.next();    
        
        
        
         //ask user to enter their age
        System.out.println("\n enter your age");
        sirname = sc.next(); 
        
        if((age % 2)==0){
            System.out.println("age is even" );
        }
          else
            {
                System.out.println("age is odd");
            }
                   
               
            
        
    }
    
}
