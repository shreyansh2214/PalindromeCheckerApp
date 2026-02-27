import java.util.*;
public class PalindromeCheckerApp {
    static class Node {
        char data;
        Node next;
        Node(char data) {
            this.data = data;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Node head = null, tail = null;
        for(char c : str.toCharArray()){
            Node newNode = new Node(c);
            if(head == null){
                head = tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }
        if(head == null || head.next == null){
            System.out.println("Palindrome");
            return;
        }
        Node slow = head, fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node prev = null, current = slow, next = null;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        Node first = head, second = prev;
        boolean isPalindrome = true;
        while(second != null){
            if(first.data != second.data){
                isPalindrome = false;
                break;
            }
            first = first.next;
            second = second.next;
        }
        System.out.println(isPalindrome ? "Palindrome" : "Not Palindrome");
    }
}