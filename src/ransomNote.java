public class ransomNote {
    static boolean canConstruct(String ransomNote, String magazine) {
        int [] chars = new int [26];
        for (int r = 0; r < magazine.length(); r++) {
            chars[magazine.charAt(r) - 'a'] ++;
        }
        for (int m = 0; m < ransomNote.length(); m++) {
            if (--chars[ransomNote.charAt(m) - 'a'] < 0)
                return false;
        }
        return true;
    }
}
