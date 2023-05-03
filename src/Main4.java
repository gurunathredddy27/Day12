public class Main4 {
    public static void main(String[] args) {
        String numWords = "Welcome to bridgelab";

        int[] letterCounts = new int[100];

        for (int i = 0; i < numWords.length(); i++) {
            char c = numWords.charAt(i);
            if (Character.isLetter(c)) {
                int index = Character.toLowerCase(c) - 'a';
                letterCounts[index]++;
            }

        }
        for (int i = 0; i < 100; i++) {
            char c = (char) ('a' + i);
            int count = letterCounts[i];
            if (count > 0) {
                System.out.println(c + ": " + count);
            }
        }


    }
}
