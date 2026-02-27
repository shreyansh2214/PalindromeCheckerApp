import java.util.Scanner;
public class PalindromeCheckerApp {
    public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.print("enter input: ");
                String s1= sc.nextLine();
                String original= s1.toLowerCase();
                String rev= new StringBuilder(original).reverse().toString();
                if(original.equals(rev)){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
    }
}
