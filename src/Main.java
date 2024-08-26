import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temperatura = 0;
        int option = 0;
        int money = 10000;

        System.out.println("Por favor, ingrese la temperatura de hoy ");
        temperatura = sc.nextInt();

        if (temperatura <= 10) {
            System.out.println("El clima esta frio");
        }
        if (temperatura > 10 && temperatura <= 20) {
            System.out.println("El clima esta nublado");
        }
        if (temperatura > 20 && temperatura < 30) {
            System.out.println("El clima esta caluroso");
        }
        if (temperatura >= 30) {
            System.out.println("El clima esta tropical ");
        }

        while (option != 3) {
            System.out.println("Su saldo Inicial hoy: " + money);
            System.out.println("Seleccion la opcion: ");
            System.out.println("1.- Depositar: ");
            System.out.println("2.- Retirar: ");
            System.out.println("3.- Salir: ");
            option = sc.nextInt();

            switch(option) {
                case 1:
                    System.out.println("Cuanto va a depositar: ");
                    money = money + sc.nextInt();
                    break;
                case 2:
                    System.out.println("Cuanto va a retirar: ");
                    int retiro = sc.nextInt();

                    if (retiro <= money){
                        money = money - retiro;
                    } else {
                        System.out.println("El saldo no es suficiente: ");
                    }
                    break;

                case 3:
                    System.out.println("Usted a decidido salir, vuelva pronto: ");
                    break;
            }
        }
    }
}