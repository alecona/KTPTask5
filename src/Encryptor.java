import java.util.Arrays;

public class Encryptor {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(encrypt("Hello")));
        int[] array = {72, 33, -73, 84, -12, -3, 13, -13, -68};
        System.out.println(decrypt(array));
    }

    /** Метод принимает массив и возвращает закодированное сообщение **/
    public static int[] encrypt(String string) {
        int[] fin = new int[string.length()];
        fin[0] = string.charAt(0);
        for (int i = 1; i < string.length(); i++){
            fin[i] = string.charAt(i) - string.charAt(i - 1);
        }
        return fin;
    }

    /** Метод принимает массив и возвращает декодированное сообщение **/
    public static StringBuilder decrypt(int[] array) {
        StringBuilder sb = new StringBuilder();
        sb.append((char) array[0]);
        for (int i = 1; i < array.length; i++){
            int a = sb.charAt(i - 1);
            sb.append((char) (a + array[i]));
        }
        return sb;
    }
}
