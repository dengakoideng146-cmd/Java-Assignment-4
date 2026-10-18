package assignmentFiles.Basiclooping.intermediatelooping.nestedloops.Analyticalandcomplexproblems;
import java.util.Scanner;
public class Pascalnumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter N:");
        int n=input.nextInt();
        for(int i=0;i<n;i++){
            int number=1;
            for(int x=0;x<=i;x++){
                System.out.print(number+" ");
                number=number*(i-x)/(x+1);
            }
            System.out.println();
        }
        input.close();

        }

        // 
    }

