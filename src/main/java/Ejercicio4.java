public class Ejercicio4 {

    public static void imprimirNumeros(int n) {
        for (var i = 0; i < n; i++) {
            System.out.print(i + 1 + " ");
        }
        System.out.print("\n");
    }

    public static void imprimirPares(int n) {
        for (var i = 0; i < n; i++) {
            if ((i + 1) % 2 == 0) {
                System.out.print(i + 1 + " ");
            }
        }
        System.out.print("\n");
    }

    public static void imprimirImpares(int n) {
        for (var i = 0; i < n; i++) {
            if ((i + 1) % 2 != 0) {
                System.out.print(i + 1 + " ");
            }
        }
        System.out.print("\n");
    }
}
