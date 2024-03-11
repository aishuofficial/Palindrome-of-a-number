public class Pali {
    public static void main(String[] args) {


        int n = 128;
        int r, s = 0;
        int t = n;

        while (n > 0) {
            r = n % 10;
            n = n / 10;
            s = s*10+r;

        }
        if (t == s) {
            System.out.println("number is a palindrom");
        } else {
            System.out.println("number is not a palindrome");
        }

    }
}



