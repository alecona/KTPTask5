public class HexDots {
    public static void main(String[] args){
        System.out.println(hexLattice(37));
    }

    /** Функция для вычисления длины средней линии шестиугольника **/
    private static int midlin(int nom)
    {
        int pou = 1;
        int mid = pou * 3 * (pou - 1) + 1;

        while (mid <= nom){
            if (mid != nom) {
                pou++;

                mid = pou * 3 * (pou - 1) + 1;
            }

            else return pou;
        }


        return -1;
    }

    /** Метод для построения шестиугольника из "o" **/
    public static StringBuilder hexLattice(int num)
    {
        StringBuilder sb = new StringBuilder();
        int ml = midlin(num);
        if (ml == -1) return sb.append("Invalid");
        for (int i = 0; i < ml; i++) {
            for (int j = 0; j < ml - i; j++) sb.append(" ");
            for (int k = 0; k < ml + i; k++ ) sb.append("o ");
            sb.append("\n");
        }
        for (int i = ml - 2; i >= 0; i--) {
            for (int k = 0; k < ml - i; k++) sb.append(" ");
            for (int j = 0; j < ml + i; j++) sb.append("o ");
            sb.append("\n");
        }
        return sb;
    }



}
