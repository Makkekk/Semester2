package Opgave05;

import java.sql.SQLOutput;

public class Opgave05Main {
    //termningsregel: b hvis b <= A går op i a
    public static void main(String[] args) {
        System.out.println(sfd(10, 3)); // 1
        System.out.println(sfd(10, 5)); // 0
        System.out.println(sfd(10, 10)); // 0
        System.out.println(sfd(10, 11)); // 10
        System.out.println(sfd(10, -1)); // IllegalArgumentException
        System.out.println(sfd(10, 0)); // IllegalArgumentException
    }

    public static int sfd(int a, int b) {
        if (b <= 0) {
            throw new IllegalArgumentException("b skal være større end 0");
        }
        if (a < b) {
            return a;
        } else {
            return sfd(a - b, b);
        }
    }
}