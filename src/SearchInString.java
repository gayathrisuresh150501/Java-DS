public class SearchInString {
    public static void main(String[] args) {
        String str = "Wonderful!";
        char target = 'e';

        System.out.println(returnIndex(str, target));
        System.out.println(doesExist(str, target));
    }

    public static int returnIndex(String str, char target) {
        if (str.isEmpty()) {
            return -1;
        }

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                return i;
            }
        }

        return -1;
    }

    public static boolean doesExist(String str, char target) {
        if (str.isEmpty()) {
            return false;
        }

        for (char ch : str.toCharArray()) {
            if (ch == target) {
                return true;
            }
        }

        return false;
    }
}
