package assignmentFiles.Basiclooping.intermediatelooping.nestedloops;
import java.util.Scanner;
public class Rectanglestarpattern {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter number of rows'R': ");
        int R=input.nextInt();
        System.out.print("Enter number colunms'C':");
        int C=input.nextInt();
        for(int i=1; i<=R; i++) {
            for(int x=1; x<=C; x++) {
                System.out.print("*");
            }
            System.out.println();
        }
        input.close();

        }
        }
