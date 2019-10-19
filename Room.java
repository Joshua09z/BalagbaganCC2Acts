import java.io.*;
import java.text.DecimalFormat;

public class Room {
    public static void main (String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader ar = new BufferedReader(new InputStreamReader(System.in));
        DecimalFormat a = new DecimalFormat("0.00");
        
        System.out.println("Enter length:");
            String inputString = br.readLine();
            double length = Double.parseDouble(inputString);
        System.out.println("Enter width:");
            String inputwidth = ar.readLine();
            double width = Double.parseDouble(inputwidth);
            double su = length * width;
        System.out.println("The floor space is "+ a.format(su) +"sqaure units.");
        }
    }
