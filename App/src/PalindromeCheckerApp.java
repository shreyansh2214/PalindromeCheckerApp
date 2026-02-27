public class PalindromeCheckerApp {
    public static void main(String[] args){
        String str = "madam";
        char[] arr = str.toCharArray();
        int i = 0;
        int j = arr.length - 1;
        boolean isPalindrome = true;

        while(i < j){
            if(arr[i] != arr[j]){
                isPalindrome = false;
                break;
            }
            i++;
            j--;
        }
        System.out.println(isPalindrome);
    }
}