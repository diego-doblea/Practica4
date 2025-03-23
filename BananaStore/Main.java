package BananaStore;

import java.util.Scanner;
import BananaStore.builder.*;
import BananaStore.model.Product;

/**
 * Clase principal que orquesta la interacción con el usuario para registrar productos en Banana Store.
 * Utiliza el patrón Builder para construir objetos de tipo Laptop, Celular o Tablet.
 */
public class Main {
    /**
     * Método principal que inicia la aplicación.
     * @param args Argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductDirector director = new ProductDirector();
        Product product = null;

        // Menú de selección con opción de salir
        System.out.println("---------------------------------------------------");
        System.out.println("Selecciona una opción:");
        System.out.println("0. Salir");
        System.out.println("1. Registrar Laptop");
        System.out.println("2. Registrar Celular");
        System.out.println("3. Registrar Tablet");
        System.out.println("---------------------------------------------------");

        int option = scanner.nextInt();
        scanner.nextLine(); // Consumir salto de línea

        if (option == 0) {
            System.out.println("Saliendo del programa...");
            scanner.close();
            return;
        }

        // Solicitar atributos comunes
        System.out.println("---------------------------------------------------");
        System.out.print("Ingresa la marca del producto: ");
        String brand = scanner.nextLine();
        System.out.println("---------------------------------------------------");
        System.out.print("Ingresa el modelo del producto: ");
        String model = scanner.nextLine();
        System.out.println("---------------------------------------------------");
        System.out.print("Ingresa el precio del producto (No poner comas, ni puntos): ");
        double price = scanner.nextDouble();
        scanner.nextLine(); // Consumir salto de línea
        System.out.println("---------------------------------------------------");

        // Sección para la creación del producto según la opción seleccionada
        switch (option) {
            case 1: // Laptop
                System.out.println("Selecciona el tamaño de pantalla (en pulgadas):");
                System.out.println("1. 13.3\"");
                System.out.println("2. 15.6\"");
                System.out.println("3. 17.0\"");
                System.out.println("---------------------------------------------------");
                int laptopScreenOption = scanner.nextInt();
                double laptopScreenSize;
                switch(laptopScreenOption) {
                    case 1: laptopScreenSize = 13.3; break;
                    case 2: laptopScreenSize = 15.6; break;
                    case 3: laptopScreenSize = 17.0; break;
                    default: laptopScreenSize = 15.6; // Valor por defecto
                }
                scanner.nextLine(); // Consumir salto de línea
                System.out.println("---------------------------------------------------");
                System.out.print("Ingresa el procesador: ");
                String processor = scanner.nextLine();
                System.out.println("---------------------------------------------------");
                System.out.print("Ingresa la memoria RAM (en GB): ");
                int ram = scanner.nextInt();
                System.out.println("---------------------------------------------------");
                System.out.print("Ingresa el almacenamiento (en GB): ");
                int storage = scanner.nextInt();
                scanner.nextLine(); // Consumir salto de línea
                product = director.constructLaptop(new LaptopBuilder(), brand, model, price, laptopScreenSize, processor, ram, storage);
                break;
            case 2: // Celular
                System.out.println("Selecciona el tamaño de pantalla (en pulgadas):");
                System.out.println("1. 6.1\"");
                System.out.println("2. 6.5\"");
                System.out.println("3. 6.8\"");
                System.out.println("---------------------------------------------------");
                int celularScreenOption = scanner.nextInt();
                double celularScreenSize;
                switch(celularScreenOption) {
                    case 1: celularScreenSize = 6.1; break;
                    case 2: celularScreenSize = 6.5; break;
                    case 3: celularScreenSize = 6.8; break;
                    default: celularScreenSize = 6.1;
                }
                scanner.nextLine(); // Consumir salto de línea
                System.out.println("---------------------------------------------------");
                System.out.println("Selecciona la capacidad de batería:");
                System.out.println("1. 3500 mAh");
                System.out.println("2. 4500 mAh");
                System.out.println("3. 5000 mAh");
                System.out.println("---------------------------------------------------");
                int batteryOption = scanner.nextInt();
                int batteryCapacity;
                switch(batteryOption) {
                    case 1: batteryCapacity = 3500; break;
                    case 2: batteryCapacity = 4500; break;
                    case 3: batteryCapacity = 5000; break;
                    default: batteryCapacity = 3500;
                }
                scanner.nextLine(); // Consumir salto de línea
                System.out.println("---------------------------------------------------");
                System.out.println("Selecciona la cantidad de cámaras:");
                System.out.println("1. 2");
                System.out.println("2. 3");
                System.out.println("3. 4");
                System.out.println("---------------------------------------------------");
                int camerasOption = scanner.nextInt();
                int cameras;
                switch(camerasOption) {
                    case 1: cameras = 2; break;
                    case 2: cameras = 3; break;
                    case 3: cameras = 4; break;
                    default: cameras = 2;
                }
                scanner.nextLine(); // Consumir salto de línea
                product = director.constructCelular(new CelularBuilder(), brand, model, price, celularScreenSize, batteryCapacity, cameras);
                break;
            case 3: // Tablet
                System.out.println("Selecciona el tamaño de pantalla (en pulgadas):");
                System.out.println("1. 8.0\"");
                System.out.println("2. 10.1\"");
                System.out.println("3. 12.0\"");
                System.out.println("---------------------------------------------------");
                int tabletScreenOption = scanner.nextInt();
                double tabletScreenSize;
                switch(tabletScreenOption) {
                    case 1: tabletScreenSize = 8.0; break;
                    case 2: tabletScreenSize = 10.1; break;
                    case 3: tabletScreenSize = 12.0; break;
                    default: tabletScreenSize = 10.1;
                }
                scanner.nextLine(); // Consumir salto de línea
                System.out.println("---------------------------------------------------");
                System.out.print("¿La tablet es compatible con lápiz táctil? (S/N): ");
                String stylusInput = scanner.nextLine();
                boolean stylusCompatibility = stylusInput.equalsIgnoreCase("S");
                System.out.println("---------------------------------------------------");
                System.out.println("Selecciona la cantidad de cámaras:");
                System.out.println("1. 2");
                System.out.println("2. 3");
                System.out.println("3. 4");
                System.out.println("---------------------------------------------------");
                int tabletCamerasOption = scanner.nextInt();
                int tabletCameras;
                switch(tabletCamerasOption) {
                    case 1: tabletCameras = 2; break;
                    case 2: tabletCameras = 3; break;
                    case 3: tabletCameras = 4; break;
                    default: tabletCameras = 2;
                }
                scanner.nextLine(); // Consumir salto de línea
                product = director.constructTablet(new TabletBuilder(), brand, model, price, tabletScreenSize, stylusCompatibility, tabletCameras);
                break;
            default:
                System.out.println("Opción inválida.");
                break;
        }

        // Mostrar resumen del producto registrado
        if (product != null) {
            System.out.println("---------------------------------------------------");
            System.out.println("**Producto registrado correctamente:**");
            System.out.println(product.getDescription());
            System.out.println("---------------------------------------------------");
        }

        scanner.close();
    }
}
