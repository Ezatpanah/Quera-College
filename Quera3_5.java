import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int h = s.nextInt() , m = s.nextInt() ;
        if ( m==0 )
            m = 0 ;
        else
            m = 60 - m ;
        if ( h==0 )
            h = 0 ;
        else 
            h = 12 - h ;
        System.out.printf("%02d:%02d", h, m);    
    }
}
