// Print 1 to N; recursion easy problems
// date: 29.11.2021

class Main {
    public static void main(String[] args) {
        int n = 7;
        print(n);
    }

    public static void print(int n) {
        if(n == 1) {
            System.out.print("1 ");
            return;
        }

        print(n-1);
        System.out.print(n+" ");
        return;
    }
}