package org.hackerrank;

public class MyMath {
    public static boolean checker(PerformOperation p, int num) {
        return p.check(num);
    }
    protected PerformOperation isOdd(){
        PerformOperation po = n -> n%2 != 0;
        return  po;
    }
    protected PerformOperation isPrime(){
        PerformOperation po = num -> java.util.stream.IntStream.range(2, (num / 2) + 1)
                .noneMatch(i -> num % i == 0);
        return  po;
    }
    protected PerformOperation isPalindrome(){
        PerformOperation po = (x) ->{
            if (x < 0) return false;
            int original = x, reversed = 0;
            while (x != 0) {
                reversed = reversed * 10 + x % 10;
                x /= 10;
            }

            return original == reversed;
        };
        return  po;
    }
}
