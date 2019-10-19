import javax.swing.*;

public class Initials {
    public static void main(String args[]){
    String first = "";
    String middle = "";
    String last = "";
 
    first =JOptionPane.showInputDialog("Enter your first name:");
    char a = first.charAt(0);
    middle =JOptionPane.showInputDialog("Enter your middle name:");
    char w = middle.charAt(0);
    last =JOptionPane.showInputDialog("Enter your last name:'");
    char e = last.charAt(0);
    JOptionPane.showMessageDialog(null,a + "." + w + "." + e);

    }
 }