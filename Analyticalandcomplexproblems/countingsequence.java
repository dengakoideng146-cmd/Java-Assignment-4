package assignmentFiles.Basiclooping;
import java.util.Scanner;
public class countingsequence {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter int N:");
        int N=input.nextInt();
        for(int i=1; i<=N; i++) {
            System.out.print(i+"");
        }
        input.close();
    }
        
}
