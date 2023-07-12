import java.util.Arrays;

public class solution51 {

        public int[][] construct2DArray(int[] original, int m, int n) {
            if (original.length != m * n)
                return new int[][] {};

            int[][] ans = new int[m][n];

            for (int i = 0; i < original.length; ++i)
                ans[i / n][i % n] = original[i];

            return ans;
        }

    public static void main(String[] args) {
        solution51 s51=new solution51();
        System.out.println(Arrays.deepToString(s51.construct2DArray(new int[]{1, 2, 3, 4}, 2, 2)));


    }
    }


