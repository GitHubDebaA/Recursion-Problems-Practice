// Factorial of N; Recursion Easy Problem
// date: 29.11.2021

class Main {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(Factorial(n));
    }

    public static int Factorial(int n) {
        if(n == 1) return 1;
        return Factorial(n-1) * n;
    }
}