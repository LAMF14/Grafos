import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de la matriz: ");
        int n = sc.nextInt();
        MatrizAd matriz = new MatrizAd(n);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int respuesta = 2;
                while (respuesta != 1 && respuesta != 0) {
                    System.out.println("existe arista entre " + i + " y " + j + "? (1 = SI/0 = NO)");
                    respuesta = sc.nextInt();
                    switch (respuesta) {
                        case 1 -> matriz.agregar(i, j);
                        case 0 -> matriz.remover(i, j);
                        default -> System.out.println("Respuesta no valida");
                    }
                }
            }
        }
        sc.close();
        matriz.imprimir();
    }
}