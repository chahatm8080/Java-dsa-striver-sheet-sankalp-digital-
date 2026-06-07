import java.util.*;

class Anagram {

    private String getFrequencyString(String str) {

        int[] freq = new int[26];

        // Count frequency
        for (char c : str.toCharArray()) {
            freq[c - 'a']++;
        }

        // Create frequency string
        StringBuilder frequencyString = new StringBuilder();
        char ch = 'a';

        for (int i : freq) {
            frequencyString.append(ch);
            frequencyString.append(i);
            ch++;
        }

        return frequencyString.toString();
    }

    public List<List<String>> groupAnagrams(String[] strs) {

        if (strs == null || strs.length == 0)
            return new ArrayList<>();

        Map<String, List<String>> mpp = new HashMap<>();

        for (String str : strs) {

            String frequency = getFrequencyString(str);

            if (mpp.containsKey(frequency)) {
                mpp.get(frequency).add(str);
            } else {
                List<String> strList = new ArrayList<>();
                strList.add(str);
                mpp.put(frequency, strList);
            }
        }

        return new ArrayList<>(mpp.values());
    }
}

public class group_anagram_neet {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        String[] strs = new String[n];

        for (int i = 0; i < n; i++) {
            strs[i] = sc.nextLine();
        }

        Anagram an = new Anagram();

        List<List<String>> ans = an.groupAnagrams(strs);

        System.out.println(ans);

        sc.close();
    }
}