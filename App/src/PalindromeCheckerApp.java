import java.util.*;
public class PalindromeCheckerApp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter input:");
        String str = sc.nextLine();
        Deque<Character> deque = new ArrayDeque<>();
        for(char c : str.toCharArray()){
            deque.addLast(c);
        }
        boolean isPalindrome = true;
        while(deque.size() > 1){
            if(!deque.removeFirst().equals(deque.removeLast())){
                isPalindrome = false;
                break;
            }
        }
        System.out.println(isPalindrome ? "Palindrome" : "Not Palindrome");
    }
}