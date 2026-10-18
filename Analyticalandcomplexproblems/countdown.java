package assignmentFiles.Basiclooping;
import java.util.Scanner;
public class countdown {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter int N:");
        int N = input.nextInt();
        for(int i=N; i>=1; i--) {
            System.out.print(i+"");
        }
        System.out.println();
        System.out.print("start!");
        input.close();
    }
        
}
