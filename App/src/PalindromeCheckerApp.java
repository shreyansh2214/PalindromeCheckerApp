import java.util.*;
public class PalindromeCheckerApp {
    public static void main(String[] args){
        String word = "madam";
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();
        for(char c : word.toCharArray()){
            queue.add(c);
            stack.push(c);
        }
        boolean isPalindrome = true;
        while(!queue.isEmpty()){
            if(queue.remove() != stack.pop()){
                isPalindrome = false;
                break;
            }
        }
        if(isPalindrome)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}