class Arrange {

    /*
     * Complete the 'arrange' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING sentence as parameter.
     */

    public static String arrange(String sentence) {
        // Write your code here
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            String key = words[i].replace(".", "").toLowerCase();
            int j = i - 1;

            while (j >= 0 && words[j].length() > key.length()) {
                words[j + 1] = words[j].replace(".", "").toLowerCase();
                j--;
            }

            words[j + 1] = key;
        }

        StringBuilder strBuilder = new StringBuilder();
        strBuilder.append(words[0].substring(0, 1).toUpperCase()).append(words[0].substring(1)).append(" ");

        for (int i = 1; i < words.length - 1; i++) {
            String word = words[i];
            strBuilder.append(word).append(" ");
        }

        strBuilder.append(words[words.length - 1]).append(".");

        return strBuilder.toString();
    }
}