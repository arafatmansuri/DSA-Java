package problems;

public class ValidPalindrome {
    public boolean bruteForce(String str){
        String cleanedString = str.replaceAll("\\s+", "").replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        char[] chars = cleanedString.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = chars.length -1; i>=0;i--) {
            stringBuilder.append(chars[i]);
        }
        return cleanedString.contentEquals(stringBuilder);
    }
    public boolean twoPointer(String s){
        char[] chars = s.replaceAll("\\s+", "").replaceAll("[^a-zA-Z0-9]","").toLowerCase().toCharArray();
        int i = 0;
        int j = chars.length - 1;
        while (j>=i){
            if (chars[i] != chars[j])
                return false;
            i++;
            j--;
        }
        return true;
    }
}
