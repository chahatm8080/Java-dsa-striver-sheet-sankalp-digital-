import java.util.*;

// class Anagram {

//     private String getFrequencyString(String str) {

//         int[] freq = new int[26];

//         // Count frequency
//         for (char c : str.toCharArray()) {
//             freq[c - 'a']++;
//         }

//         // Create frequency string
//         StringBuilder frequencyString = new StringBuilder();
//         char ch = 'a';

//         for (int i : freq) {
//             frequencyString.append(ch);
//             frequencyString.append(i);
//             ch++;
//         }

//         return frequencyString.toString();
//     }

//     public List<List<String>> groupAnagrams(String[] strs) {

//         if (strs == null || strs.length == 0)
//             return new ArrayList<>();

//         Map<String, List<String>> mpp = new HashMap<>();

//         for (String str : strs) {

//             String frequency = getFrequencyString(str);

//             if (mpp.containsKey(frequency)) {
//                 mpp.get(frequency).add(str);
//             } else {
//                 List<String> strList = new ArrayList<>();
//                 strList.add(str);
//                 mpp.put(frequency, strList);
//             }
//         }

//         return new ArrayList<>(mpp.values());
//     }
// }

class Anagram {

    private String getFrequencyString(String str) {
        int[] freq = new int[26];
        for (char c : str.toCharArray()) {
            freq[c - 'a']++;
        }
        StringBuilder frequencyString = new StringBuilder();
        char ch = 'a';
        for (int i : freq) {
            frequencyString.append(ch);
            frequencyString.append(i);
        }
        return frequencyString.toString();
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0 || strs == null)
            return new ArrayList<>();
        Map<String, List<String>> mpp = new HashMap<>();
        for (String str : strs) {
            String Frequency = getFrequencyString(str);
            if (mpp.containsKey(Frequency)) {
                mpp.get(Frequency).add(str);
            } else {
                List<String> st = new ArrayList<>();
                st.add(str);
                mpp.put(Frequency, st);
            }
        }
        return new ArrayList<>(mpp.values());
    }
}

public class group_anagram_neet {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the total string: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] strs = new String[n];
        System.out.println("Enter the list of string");
        for (int i = 0; i < n; i++) {
            strs[i] = sc.next();
        }

        Anagram an = new Anagram();

        List<List<String>> ans = an.groupAnagrams(strs);
        for (List<String> ls : ans) {
            System.out.println(ls + " ");
        }

        sc.close();
    }
}
// import java.util.*;

// public class group_anagram_neet {

// public static List<List<String>> groupAnagrams(String[] strs) {

// List<List<String>> result = new ArrayList<>();
// boolean[] visited = new boolean[strs.length];

// for (int i = 0; i < strs.length; i++) {

// if (visited[i]) {
// continue;
// }

// List<String> group = new ArrayList<>();
// group.add(strs[i]);
// visited[i] = true;

// for (int j = i + 1; j < strs.length; j++) {

// if (visited[j]) {
// continue;
// }

// char[] arr1 = strs[i].toCharArray();
// char[] arr2 = strs[j].toCharArray();

// Arrays.sort(arr1);
// Arrays.sort(arr2);

// if (Arrays.equals(arr1, arr2)) {
// group.add(strs[j]);
// visited[j] = true;
// }
// }

// result.add(group);
// }

// return result;
// }

// public static void main(String[] args) {

// Scanner sc = new Scanner(System.in);

// System.out.print("Enter number of strings: ");
// int n = sc.nextInt();

// String[] strs = new String[n];

// System.out.println("Enter the strings:");

// for (int i = 0; i < n; i++) {
// strs[i] = sc.next();
// }

// List<List<String>> ans = groupAnagrams(strs);

// System.out.println("\nGrouped Anagrams:");

// for (List<String> group : ans) {
// System.out.println(group);
// }

// sc.close();
// }
// }