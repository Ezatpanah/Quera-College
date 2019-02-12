import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
int n ,x, sum = 0 ;

        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        

if((n%2)==0){
        x=((n+2)/2)*((n+2)/2);
        System.out.println(x);
        
}
else{
      x=((n+3)/2)*((n+1)/2);
      System.out.println(x);
}
        
    

}
}
