import java.util.Scanner;

public class FIBONACCI {
    public static void main(String[] args) {
        int n1=0,n2=1,n3;
        int Range;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter The Range");
        Range =sc.nextInt();
        for(int i=2;i<Range;++i)
        {
            n3=n1+n2;
            System.out.print(""+n3);
            n1=n2;
            n2=n3;
            
        }
    }
    
}