import model.Producto;
import model.Usuario;
import service.TiendaDeBarrio;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        TiendaDeBarrio tiendaDeBarrio = new TiendaDeBarrio();
 enum TiendaDeBarrio{
    enterUser,
    addProduct,
    removeProduct,
    updateProduct,
    quantityProduct,
    changeproduct,
}
        int option = displayMenu();
        while (option !=7){

         switch (option) {
            case 1 -> enterUser(tiendaDeBarrio);
            case 2 -> addProduct(tiendaDeBarrio);
            case 3 -> removeProduct(tiendaDeBarrio);
            case 4 -> updateProduct(tiendaDeBarrio);
            case 5 -> quantityProduct(tiendaDeBarrio);
            case 6 -> changeproduct(tiendaDeBarrio);
          }
         option = displayMenu();
        }
    }

    private static void  enterUser(TiendaDeBarrio tiendaDeBarrio) {
      Scanner scanner=new Scanner(System.in);
      System.out.println("Enter the User: ");
      String user = scanner.nextLine();
      System.out.println("Enter the Password: ");
      int password = scanner.nextInt();
      Usuario usuario = new Usuario(user, password);
      tiendaDeBarrio.addUsurious(usuario);
    }
    private static void addProduct(TiendaDeBarrio tiendaDeBarrio){
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter Name: ");
      String name = scanner.nextLine();
      System.out.println("Enter price: ");
      double price = scanner.nextDouble();
      System.out.println("enter amount: ");
      String amount = scanner.next();
      System.out.println("Enter description: ");
      String description = scanner.next();
      Producto producto = new Producto(name, price, amount, description);
      tiendaDeBarrio.addProducto(producto);
      System.out.println(producto.toString());


        }

    private static void removeProduct(TiendaDeBarrio tiendaDeBarrio){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Name: ");
        String name = scanner.nextLine();
        System.out.println("Enter price: ");
        double price = scanner.nextDouble();
        System.out.println("enter amount: ");
        String amount = scanner.nextLine();
        System.out.println("Enter description: ");
        String description = scanner.nextLine();
        Producto producto = new Producto(name, price, amount, description);
        tiendaDeBarrio.addProducto(producto);
    }
    private static void updateProduct(TiendaDeBarrio tiendaDeBarrio){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Name: ");
        String name = scanner.nextLine();
        System.out.println("Enter price: ");
        double price = scanner.nextDouble();
        System.out.println("enter amount: ");
        String amount = scanner.nextLine();
        System.out.println("Enter description: ");
        String description = scanner.next();
        Producto producto = new Producto(name, price, amount, description);
        tiendaDeBarrio.addProducto(producto);
    }
    private static void quantityProduct(TiendaDeBarrio tiendaDeBarrio){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount: ");
        String amount = scanner.nextLine();

    }
    private static void changeproduct(TiendaDeBarrio tiendaDeBarrio){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = scanner.nextLine();

    }
    private static int displayMenu() {
        System.out.println("---------BIENVENIDO A NUESTRO MENU.........");
        System.out.println("SELECCIONE LA OPCION CORRESPONDIENTE A SU SOLICITUD.");
        System.out.println("-------------------------------------------");
        System.out.println("---------! 1 : Enter User..................");
        System.out.println("---------! 2 : add Product.................");
        System.out.println("---------! 3 : remove Product..............");
        System.out.println("---------! 4 : update Product..............");
        System.out.println("---------! 5 : quantity Product............");
        System.out.println("---------! 6 : change product..............");
        System.out.println("---------! 7 : Finalizar Operacion.........");
        System.out.println("!!!!No Olvides Finalizar tu compra y salir de tu Usuario!!!!");
        System.out.println("____________________________________________________________");
        System.out.println("* Seleccione una de las opciones anteriores: ");
        Scanner scanner = new Scanner(System.in);
        int option =7;
        try {
            option = scanner.nextInt();
            if (option < 1 || option > 7) {
                System.out.println("¡¡ Opcion invalida intente de nuevo¡¡");
                displayMenu();
            }
        } catch (Exception e) {
            System.out.println("¡¡ Opcion invalida intente de nuevo¡¡");
            displayMenu();
        }
        return option;
    }
}
