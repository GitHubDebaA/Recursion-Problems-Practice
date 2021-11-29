// Print N to 1; recursion practice
// date: 29.11.2021

public class Main {
    public static void main(String[] args) {
        int n = 7;
        print(n);
    }

    public static void print(int n) {
        if(n == 1) {
            System.out.print("1 ");
            return;
        }

        System.out.print(n+ " ");
        print(n-1);
    }
}
