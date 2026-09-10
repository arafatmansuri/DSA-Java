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
    public boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while(i < j) {
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(j);
            if(!isAlphaNum(ch1)) {
                i++;
                continue;
            } else if(!isAlphaNum(ch2)) {
                j--;
                continue;
            }
            if(toLowerCase(ch1) != toLowerCase(ch2)) {
                return false;
            }
            i++; j--;
        }
        return true;
    }

    private char toLowerCase(char ch){
        if(ch >= 'A' && ch <= 'Z'){
            ch = (char)(ch + 32);
        }
        return ch;
    }

    private boolean isAlphaNum(char ch){
        return ('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z') || ('0' <= ch && ch <= '9');
    }
}
