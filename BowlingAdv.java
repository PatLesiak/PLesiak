public class BowlingAdv {
    public static void main(String[] args) {
        int N = 5;


        for (int i = N ; i >= 0 ; i--) {
            for (int j = 0 ; j < i ; j++) {
                System.out.print(" ");
            }

            for (int j = i  ; j < N - (i) ; j++) {
                System.out.print(". ");
            }

            System.out.print("\n");
        }
    }
}
