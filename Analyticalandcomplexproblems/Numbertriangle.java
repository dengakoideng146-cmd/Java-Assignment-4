package assignmentFiles.Basiclooping.intermediatelooping.nestedloops;
import java.util.Scanner;
public class Numbertriangle {
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        System.out.print("Enter N:");
        int n=input.nextInt();
        for(int i=1;i<=n;i++){
            for(int x=1;x<=i;x++){
                System.out.print(x);
            }
                    System.out.println();
                }
                input.close();
            }
        }



    
    
    
