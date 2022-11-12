//program to display all the multiples of 2, 3 and 7 within the range 71 to 150.
package multiple;


public class Multiple {

   
    public static void main(String[] args) {
        System.out.println(" divided by 2");
        for(int i=71;i<=150; i++){
            if (i%2==0)
                System.out.print(i+",");
        }
        
        System.out.println("\n divided by 3");
        for(int i=71;i<=150; i++){
            if (i%3==0)
                System.out.print(i+",");
        }
        System.out.println("\n divided by 7");
        for(int i=71;i<=150; i++){
            if (i%7==0)
                System.out.print(i+",");
    }
    
}}
