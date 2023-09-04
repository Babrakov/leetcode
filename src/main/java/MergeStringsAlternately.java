public class MergeStringsAlternately {
    public static void main(String[] args) {
        System.out.println(mergeAlternately("ab","pqrs"));
    }

    public static String mergeAlternately(String word1, String word2) {
        System.out.println(word1);
        System.out.println(word2);
        char[] word1Array = word1.toCharArray();
        char[] word2Array = word2.toCharArray();

        String result = "";
        int size;

        String rest = "";
        if (word1.length() > word2.length()) {
            size = word2.length();
            rest = word1.substring(size);
        } else {
            size = word1.length();
            rest = word2.substring(size);
        }


        for (int i = 0; i < size; i++) {
            result += String.valueOf(word1Array[i]) + String.valueOf(word2Array[i]);
        }
        result += rest;
        return result;
    }
}
