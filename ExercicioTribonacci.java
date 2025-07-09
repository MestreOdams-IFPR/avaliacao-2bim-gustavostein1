public class ExercicioTribonacci {

    public static void main(String[] args) {

    }

    public static int tribo(int n) {

        if (n < 2) {
            return 0;

        } else if (n == 2) {
            return 1;

        } else {
            return tribo(n - 1) + tribo(n - 2) + tribo(n - 3);
        }
    }
}