public class StringCompressor {
    public static String compressString(String s) {
        if (s == null || s.isEmpty()) {
            return "";
        }

        StringBuilder compressed = new StringBuilder();
        int count = 1;
        char currentChar = s.charAt(0);

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == currentChar) {
                count++;
            } else {
                compressed.append(currentChar);
                if (count > 1) {
                    compressed.append(count);
                }
                currentChar = s.charAt(i);
                count = 1;
            }
        }

        compressed.append(currentChar);
        if (count > 1) {
            compressed.append(count);
        }

        return compressed.toString();
    }

    public static void main(String[] args) {
        String input1 = "aabbbbeeeeffggg";
        String output1 = compressString(input1);
        System.out.println(output1);  // Output: a2b4e4f2g3

        String input2 = "abbccccc";
        String output2 = compressString(input2);
        System.out.println(output2);  // Output: ab2c5
    }
}
