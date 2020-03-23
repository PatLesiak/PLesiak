public class FibonacciNum {
    public static void main(String[] args) {
        int n = 5, t1 = 0, t2 = 1;

        for (int i = 2; i <=n; i++)
        {
            int sum = t1+ t2;
            t1 = t2;
            t2 = sum;
        }
        System.out.print(t1);
    }

}
