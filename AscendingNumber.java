import java.util.Scanner;
  public class AscendingNumber{
    public static void main (String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Input 6 #: ");
      int num1 = sc.nextInt();
      int num2 = sc.nextInt();
      int num3 = sc.nextInt();
      int num4 = sc.nextInt();
      int num5 = sc.nextInt();
      int num6 = sc.nextInt();  
        
      if(num1 >= 0 && num1 <=9 && num2 >= 0 && num2 <=9 && num3 >= 0 && num3 <=9 && num4 >= 0 && num4 <=9 && num5 >= 0 && num5 <=9 && num6 >= 0 && num6 <=9){
      for(int i=11;i<=99;i++){
      if(i/10 == num1 || i/10 == num2 || i/10 == num3 || i/10 == num4 || i/10 == num5 || i/10 == num6){
      continue;
      }
      System.out.println(i);
      }
    }
     else {
     System.out.print("Invalid Input");
     }
   }
 }