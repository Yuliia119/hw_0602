public class Factorial {
    public static long factorialRec (int n) {
        if (n == 0) {
            System.out.println("Завершили метод 0");
            return 0;
        }
        System.out.println("Завершили метод " + n);
        return n*factorialRec(n-1);
    }

}
