import java.util.Scanner;
//La tienda GameWorld vende productos y ofrece servicios especiales a sus clientes. El programa debe
//permitir seleccionar entre varias opciones para calcular descuentos o beneficios.
//menu de opciones: comprar video juegos, comprar accesorio, solicitar membresia


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double valor = 0, valorFinal = 0, descuento = 0;
        String opcion = "";
        System.out.println("Bienvenido a nuestra tienda");
        System.out.println("Seleccione la opción que busca: \n1 - Comprar videojuegos\n2 - Comprar accesorios\n3 - Solicitar membresía");
        opcion = sc.nextLine();

        switch(opcion) {
            case "1":
                System.out.println("Ha seleccionado: Comprar videojuegos");
                System.out.print("Ingrese el valor del videojuego: ");
                valor = sc.nextDouble();
                sc.nextLine();
                System.out.print("¿Es cliente recurrente? (si/no): ");
                String clienteRecurrente = sc.nextLine();
                if (valor > 150000) {
                    descuento += 0.10;
                    System.out.println("¡Felicidades! Se aplicó un descuento del 10%.");
                }
                if (clienteRecurrente.equalsIgnoreCase("si")) {
                    descuento += 0.05;
                    System.out.println("Se aplicó un descuento adicional del 5% por ser cliente recurrente.");
                }
                valorFinal = valor - (valor * descuento);
                System.out.println("Valor original: $" + valor);
                System.out.println("Descuento total aplicado: " + (descuento * 100) + "%");
                System.out.println("Valor final a pagar: $" + valorFinal);
                break;

            case "2":
                System.out.println("Ha seleccionado: Comprar accesorios");
                System.out.print("Ingrese el tipo de accesorio: ");
                String tipoAccesorio = sc.nextLine();
                System.out.print("Ingrese el valor del accesorio: ");
                double valorAccesorio = sc.nextDouble();
                double descuentoAccesorio = 0;
                if (valorAccesorio > 200000) {
                    descuentoAccesorio = 0.08;
                } else if (valorAccesorio >= 50000) {
                    descuentoAccesorio = 0.05;
                }
                double valorFinalAccesorio = valorAccesorio - (valorAccesorio * descuentoAccesorio);
                System.out.println("Tipo de accesorio: " + tipoAccesorio);
                System.out.println("Valor original: $" + valorAccesorio);
                System.out.println("Descuento aplicado: " + (descuentoAccesorio * 100) + "%");
                System.out.println("Valor final a pagar: $" + valorFinalAccesorio);
                break;

            case "3":
                System.out.println("Ha seleccionado: Solicitar membresía");
                System.out.print("Ingrese su edad: ");
                int edad = sc.nextInt();

                if (edad < 18) {
                    System.out.println("No puede solicitar membresía por ser menor de edad.");
                } else if (edad < 50) {
                    System.out.println("Puede solicitar la membresía estándar.");
                } else {
                    System.out.println("Puede solicitar la membresía premium.");
                }
                break;
        }
    }
}