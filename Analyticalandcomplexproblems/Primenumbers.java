package assignmentFiles.Basiclooping.intermediatelooping.nestedloops.Analyticalandcomplexproblems;
import java.util.Scanner;
public class Primenumbers {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter N:");
        int n=input.nextInt();
        for(int i=2;i<=n;i++){
            boolean prime=true;
            for(int x=2;x*x<=i;x++) {
                if(i%x==0) {
                    prime=false;
                    break;
                }
            }
            if(prime){
                System.out.print(i+" ");
            }
        }
        input.close();
        
        }

        
}
