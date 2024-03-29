class Facrotial {
    static long computeI(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    static long computeR(int n) {
        if (n == 1) return n;
        return computeR(n - 1) * n;
    }
}

class FacrotialDemo {
    public static void main(String[] args) {
        System.out.println("Вычисление факториала в цикле:");
        for (int i = 6; i > 0; i++) {

            System.out.println(i + "! =" + " " + Facrotial.computeR(i));
        }
        System.out.println("Вычисление факториала рекурсией:");
        for (int r = 1; r <= 6; r++) {
            System.out.println(r+ "! = " + Facrotial.computeR(r));
        }
    }
}
//3.17 листинг всё сломалось пизда нужна помощь