
import model.Cliente;
import model.Producto;

import javax.xml.namespace.QName;
import java.util.Scanner;

public class Main {

    private final Scanner scanner;

    public Main() {
        scanner = new Scanner(System.in);
        System.out.println(cliente);
        System.out.println(producto);
    }
    Cliente cliente = new Cliente("Deivid","Farfan","Cll128B#91b_72");

    Producto producto = new Producto("panela","3500","3","paquete de libra","002");



    private void addProduct() { System.out.println("1 : addProduct"); }
    private void removeProduct() { System.out.println("2 : removeProduct"); }
    private void updateProduct() { System.out.println("3 : updateProduct"); }
    private void quantityProduct() { System.out.println("4 : quantityProduct"); }
    private void changeproduct() { System.out.println("5 : changeproduct"); }

    private void handleUserChoice(int choice) {
        switch (choice) {
            case 1 -> addProduct();
            case 2 -> removeProduct();
            case 3 -> updateProduct();
            case 4 -> quantityProduct();
            case 5 -> changeproduct();
            case 6 -> System.out.println("Saliendo...");
            default -> System.out.println("Opción invalida. Por favor intenta de nuevo.");
        }
    }

    private void displayMenu() {
        System.out.println("------------");
        System.out.println("1 : addProduct");
        System.out.println("2 : removeProduct");
        System.out.println("3 : updateProduct");
        System.out.println("4 : quantityProduct");
        System.out.println("5 : changeproduct");
        System.out.println("6 : saliendo....");

    }
    public void runMenu() {
        int choice;
        do {
            displayMenu();
            choice = scanner.nextInt();
            scanner.nextLine();
            handleUserChoice(choice);
        } while (choice != 6);

    }
    public static void main(String[] args) {
        Main manager = new Main();
        manager.runMenu();
    }
}
