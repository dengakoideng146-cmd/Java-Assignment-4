package assignmentFiles.Basiclooping.intermediatelooping;
import java.util.Scanner;
public class Evennumbersum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter int N:");
        int N=input.nextInt();
        int sum=0;
        for(int i=1; i<=N; i++) {
            if(i%2==0) {
                sum+=i;
            }
        }
        System.out.println("Sum of even numbers = "+sum);
        input.close();
    }
        
}
