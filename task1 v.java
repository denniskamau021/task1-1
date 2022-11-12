//a calculator to help user perform the basic operations (+, -, * and /).
package calculator;
//importing scanner
import java.util.Scanner;

public class Calculator {
static char operator;
static Double num1,num2,total;
    
    public static void main(String[] args) {
        //creating scanner class
        Scanner input = new Scanner(System.in);
        //ask user to enter operator
        System.out.println("enter an operator");
        operator=input.next().charAt(operator);
        //ask user to enter num 1
        System.out.println("enter num1");
        num1=input.nextDouble();
        //ask user to enter num 2
        System.out.println("enter num2");
        num2=input.nextDouble();
        switch (operator){
            //addition
            case'+':
                total=num1+num2;
                 System.out.println(num1+"+"+num2+"="+total);
                 break;
                  //subtraction
            case'-':
                total=num1-num2;
                 System.out.println(num1+"-"+num2+"="+total);
                 break;
                    //multiplication
            case'*':
                total=num1*num2;
                 System.out.println(num1+"*"+num2+"="+total);
                 break;
                 //division
                 case'/':
                total=num1/num2;
                 System.out.println(num1+"/"+num2+"="+total);
                 
        }
    }
    
}
