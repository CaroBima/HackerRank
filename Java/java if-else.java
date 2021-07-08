import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner ene = new Scanner(System.in);
        int n = ene.nextInt();
        
        int modulo = n%2; 
        if (modulo!=0){
            System.out.println("Weird");
        } else {
            if (n>=2 && n<=5){
                System.out.println("Not Weird");
            }else{
                if(n>=6 && n<=20){
                    System.out.println("Weird");
                }else{
                    System.out.println("Not Weird");
                }
            }
            
        }
    }
}
