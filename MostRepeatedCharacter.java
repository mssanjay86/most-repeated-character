public class App {

    public static void main(String[] args) throws Exception {
        String str = "Java";
        char[] charArr = str.toCharArray();
        int count = 1;
        char ch = charArr[0];
        int max = 0;
        for (int i = 0; i < charArr.length; i++) {
            for (int j = i + 1; j < charArr.length; j++) {
                if (charArr[i] == charArr[j] && charArr[j] != '$') {
                    count++;
                    charArr[j] = '$';
                    if (count > max) {
                        max = count;
                        ch = charArr[i];
                    }
                }
            }
        }
        System.out.println("Maximum repeated character is :" + ch);
    }
}
