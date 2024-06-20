package so;

public class Client1 {
    public static void main(String[] args) {
        int as = 0;
        int u = 145;
        int tm = u;

        while (u > 0) {
            int h = u % 10;
            as = as + fu(h);
            u = u / 10;
        }

        if (tm == as) {
            System.out.println("It's a special number");
        } else {
            System.out.println("It's not a special number");
        }
    }

    public static int fu(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
