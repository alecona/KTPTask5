public class Complete {

    public static void main(String[] args) {
        System.out.println(canComplete("butl", "beautiful"));
        System.out.println(canComplete("butlz", "beautiful"));
    }

    /** Метод, который определяет, может ли слово быть завершено **/
    public static boolean canComplete(String part, String string) {
        int num = 0;
        for (int i = 0; i < string.length(); i++){
            if (string.charAt(i) == part.charAt(num)) num++;
        }
        return num == part.length();
    }
}
