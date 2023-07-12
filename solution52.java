public class solution52 {

        public int arrangeCoins(int n) {
            int level = 0, coin = 1;
            while (n >= coin) {
                n -= coin;
                coin++;
                level++;
            }
            return level;
        }

    public static void main(String[] args) {
        solution52 s52=new solution52();
        System.out.println( s52.arrangeCoins(5));
    }
    }

