import java.util.Scanner;

public class FIBONACCI {
    public static void main(String[] args) {
        int A=0,B=1,n3,n1,n2;

        int Range;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter The Range");
        Range =sc.nextInt();
        for(int j=2;j<Range;j++)
        {
            n3=n1+n2;
            System.out.print(""+n3);
            A=B;
            B=n3;
            
        }
    }
    
}