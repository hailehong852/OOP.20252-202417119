import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                Choose the option:
                1. Solve the first-degree equation with one variable
                2. Solve the system of first-degree equations with two variables
                3. Solve the second-degree equation with one variable
                Please enter the number 1, 2 or 3
                """);
        int op = sc.nextInt();
        if (op == 1) {
            System.err.println("Scan the equation ax + b");
            System.out.println("Scan a: ");
            int a = sc.nextInt();
            System.out.println("Scan b: ");
            int b = sc.nextInt();
            if (a == 0 && b == 0) {
                System.out.println("The equation has infinitely many solutions.");
            } else if (b == 0) {
                System.out.println("The solution is x = 0");
            } else if (a == 0) {
                System.out.println("The equation has no solution");
            } else {
                System.out.println("The solution is x = " + ((double) (-b) / a));
            }
        } else if (op == 2) {
            System.out.println("""
                    Scan the equation a11x1 + a12x2 = b1
                                      a21x1 + a22x2 = b2""");
            System.out.println("Scan a11: ");
            int a11 = sc.nextInt();
            System.out.println("Scan a12: ");
            int a12 = sc.nextInt();
            System.out.println("Scan b1: ");
            int b1 = sc.nextInt();
            System.out.println("Scan a21: ");
            int a21 = sc.nextInt();
            System.out.println("Scan a22: ");
            int a22 = sc.nextInt();
            System.out.println("Scan b2: ");
            int b2 = sc.nextInt();
            int d = a11 * a22 - a21 * a12;
            int d1 = b1 * a22 - b2 * a12;
            int d2 = a11 * b2 - a21 * b1;
            if (d == 0) {
                if (d1 == 0 && d2 == 0) {
                    System.out.println("The system has infinitely many solutions.");
                } else {
                    System.out.println("The system has no solution.");
                }
            } else {
                System.out.println("x1 = " + (double) d1 / d + " and x2 = " + (double) d2 / d);
            }
        } else {
            System.err.println("Scan the equation ax^2 + bx + c = 0");
            System.out.println("Scan a: ");
            int a = sc.nextInt();
            System.out.println("Scan b: ");
            int b = sc.nextInt();
            System.out.println("Scan c: ");
            int c = sc.nextInt();
            if (a == 0) {
                if (c == 0 && b == 0) {
                    System.out.println("The equation has infinitely many solutions.");
                } else if (b == 0) {
                    System.out.println("The solution is x = 0");
                } else if (c == 0) {
                    System.out.println("The equation has no solution");
                } else {
                    System.out.println("The solution is x = " + ((double) (-c) / b));
                }
            } else {
                double delta = b * b - 4 * a * c;

                if (delta < 0) {
                    System.out.println("The equation has no real solution.");
                } else if (delta == 0) {
                    double x = -b / (2.0 * a);
                    System.out.println("The equation has a double root x = " + x);
                } else {
                    double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                    double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                    System.out.println("The solution of the equation x1 = " + x1 + " and x2 = " + x2);
                }
            }
        }
        sc.close();
    }
}