public class DoWhile {
    public static void main(String args[]) {
        char ch = 'A';
        while(ch <= 90)  {
            System.out.print(ch + " ");
            ch++;
        }
        do {
            System.out.print(ch + " ");
            ch++;
        } while(ch <= 'Z');
    }
}