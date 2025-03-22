import java.util.Scanner;

public class MuyMal {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int i = 1;
        int multiplos3 = 0;
        int multiplos5 = 0;
        int noMultiplos = 0;

        System.out.println("Ingrese un número límite:");
        int limite = input.nextInt();
            while (i <= limite) {
            if (i % 3 == 0) {
                multiplos3 = multiplos3 + i;
                System.out.println(i + " es múltiplo de 3");
            } if (i % 5 == 0) {
                multiplos5 = multiplos5 + i;
                System.out.println(i + " es múltiplo de 5");
            } else {
                noMultiplos = noMultiplos + i;
                System.out.println(i + " no es múltiplo de 3 ni 5");
            } i = i + 1;
        }

        System.out.println("Suma de múltiplos de 3: " + multiplos3);
        System.out.println("Suma de múltiplos de 5: " + multiplos5);
        System.out.println("Suma del resto: " + noMultiplos);
    }
}
