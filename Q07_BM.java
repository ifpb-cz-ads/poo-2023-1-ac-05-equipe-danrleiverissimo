public class Q07_BM {
    public static void main(String[] args) {
        int x = 180;
        int y = x;
        System.out.print(y);
        while (y != 1) { // executa o loop enquanto y for diferente de 1
            if (y % 2 == 0) { // se y é par, divide por 2
                y = y / 2;
            } else { // se y é ímpar, multiplica por 3 e adiciona 1
                y = 3 * y + 1;
            }
            System.out.print(" -> " + y);
        }
    }
}
