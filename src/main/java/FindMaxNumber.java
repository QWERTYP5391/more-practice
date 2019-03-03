public class FindMaxNumber {

    public static final String REGEX = ",";

    public static int findMaxNumber(String s, int k) {
        if (s == null || s.length() < 1) {
            return 0;
        }

        if(s.length() == 1 && k == 0){
            return Integer.parseInt(s);
        }

        if(s.length() == 2 && k == 1){
            String appendComma = new StringBuilder(s).insert(1, REGEX).toString();
            String[] split = appendComma.split(REGEX);

            return Math.max(Integer.parseInt(split[0]), Integer.parseInt(split[1]));
        }

        int max = 0;

        for (int i = 1; i < s.length() - 1; i++) {
            String appendComma = new StringBuilder(s).insert(i, REGEX).toString();
            String[] split = appendComma.split(REGEX);

            String s1 = split[0];
            String s2 = split[1];
            int b = Integer.parseInt(s1);
            int b1 = Integer.parseInt(s2);

            int k1 = k - 1;
            if (k1 == 0) {
                max = Math.max(Math.max(max, b), b1);
            } else {
                if (s2.length() > k1) {
                    max = Math.max(b, Math.max(max, findMaxNumber(s2, k1)));
                }

            }
        }

        return max;
    }


}
