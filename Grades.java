import java.util.*;
  
public class Grades{
  public static void main (String args[]){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter Grade");
    int Grade = sc.nextInt();
         if(Grade >91 && Grade <=100){
            System.out.println("A");
         }else if(Grade >86 && Grade <=92){
            System.out.println("B+");
         }else if(Grade >82 && Grade <=87){
            System.out.println("B");
         }else if(Grade >79 && Grade <=83){
            System.out.println("C+");
         }else if(Grade >74 && Grade <=79){
            System.out.println("C");
         }else if(Grade >69 && Grade <=75){
            System.out.println("D");
         }else if(Grade <=70){
            System.out.println("F");
         } 
         
         } else {
         System.out.println("Error");
         }
     }
}  