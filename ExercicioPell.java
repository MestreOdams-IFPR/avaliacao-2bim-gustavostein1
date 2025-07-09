public class ExercicioPell {

    public static void main(String[] args) {

    }

    public static int Pell(int t) {

        if (t == 0) {
            return 0;

        } else if (t == 1) {
            return 1;

        } else {
            return 2 * Pell(t - 1) + Pell(t - 2);
        }
    }
}
