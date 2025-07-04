class IsNumFibonacciUsingGeneratedFibNumApproach1 {

    // Credits https://www.geeksforgeeks.org/dsa/check-number-fibonacci-number/
    // Approach 1

    // A utility method that returns true if x is perfect square
    static boolean isPerfectSquare(int x)
    {
        int s = (int) Math.sqrt(x);
        return (s*s == x);
    }

    // Returns true if n is a Fibonacci Number, else false
    static boolean isFibonacci(int n)
    {
        // n is Fibonacci if one of 5*n*n + 4 or 5*n*n - 4 or both
        // is a perfect square
        return isPerfectSquare(5*n*n + 4) ||
                isPerfectSquare(5*n*n - 4);
    }

    // Driver method
    public static void main(String[] args)
    {
        for (int i = 1; i <= 10; i++)
            System.out.println(isFibonacci(i) ? i + " is a Fibonacci Number" :
                    i + " is a not Fibonacci Number");
    }
}
