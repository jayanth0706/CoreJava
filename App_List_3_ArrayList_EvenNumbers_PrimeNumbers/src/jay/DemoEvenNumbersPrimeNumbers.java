package jay;

import java.util.*;
import java.util.function.*;

public class DemoEvenNumbersPrimeNumbers {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try (s;) {
            ArrayList<Integer> al = new ArrayList<>();
            System.out.println("Enter the number of elements:");
            int n = s.nextInt();
            System.out.println("Enter " + n + " elements-----");

            for (int i = 1; i <= n; i++) {
                al.add(s.nextInt());
            }

            System.out.println("List : " + al.toString());
            System.out.println("----Display Even numbers from the List-----");

            Predicate<Integer> pd = (x) -> x % 2 == 0; // Check if even

            al.forEach((k) -> {
                if (pd.test(k)) {
                    System.out.print(k + " ");
                }
            });

            System.out.println("\n------Display Prime numbers from the List-----");
           
            Predicate<Integer> pd1 = (y) -> { 
                int count = 0;
                for (int i = 1; i <= y; i++) {
                    if (y % i == 0) {
                        count++;
                    }
                }
                return count == 2; // Check if prime (only divisible by 1 and itself)
            };

            al.forEach((k) -> {
                if (pd1.test(k)) {
                    System.out.print(k + " ");
                }
            });
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}