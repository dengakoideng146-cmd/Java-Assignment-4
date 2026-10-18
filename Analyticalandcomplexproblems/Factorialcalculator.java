package assignmentFiles.Basiclooping.intermediatelooping;
import java.util.Scanner;
public class Factorialcalculator {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter int N:");
        int n=input.nextInt();
        long factorial=1;
        for(int i=1; i<=n; i++) {
            factorial*=i;
        }
            System.out.print(n+"!="+factorial);
            input.close();
    }
    
        } 
              

