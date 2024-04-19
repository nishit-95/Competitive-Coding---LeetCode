public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] S) {
        if (S == null || S.length == 0) {
            return "";
        }
        for (int i = 0; i < S[0].length(); i++) {
            char c = S[0].charAt(i);
            for (int j = 1; j < S.length; j++) {
                if (i == S[j].length() || S[j].charAt(i) != c) {
                    return S[0].substring(0, i);
                }
            }
        }
        return S[0];
    }

    public static void main(String[] args) {
        LongestCommonPrefix solution = new LongestCommonPrefix();
        
        String[] strings1 = {"flower", "flow", "flight"};
        String[] strings2 = {"dog", "racecar", "car"};
        String[] strings3 = {"apple", "applebee", "app"};
        
        System.out.println("Longest common prefix for strings1: " + solution.longestCommonPrefix(strings1));
        System.out.println("Longest common prefix for strings2: " + solution.longestCommonPrefix(strings2));
        System.out.println("Longest common prefix for strings3: " + solution.longestCommonPrefix(strings3));
    }
}

