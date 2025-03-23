import factory.ProductFactory;
import model.Product;
import java.util.Scanner;

/**
 * Clase principal para la ejecución del sistema de registro de productos.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Menú de selección de tipo de producto
        System.out.println("---------------------------------------------------");
        System.out.println("Selecciona el tipo de producto que vas a registrar: ");
        System.out.println("1. Laptop");
        System.out.println("2. Celular");
        System.out.println("3. Tablet");
        System.out.println("4. Salir");
        System.out.println("---------------------------------------------------");
        System.out.print("Se selecciona: ");
        int tipoProducto = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea
        
        String type = "";
        switch(tipoProducto) {
            case 1:
                type = "laptop";
                break;
            case 2:
                type = "celular";
                break;
            case 3:
                type = "tablet";
                break;
            case 4:
                System.out.println("Saliendo del programa...");
                System.exit(0);
            default:
                System.out.println("Opción no válida.");
                System.exit(0);
        }
        
        // Solicitar atributos comunes
        System.out.println("---------------------------------------------------");
        System.out.print("Ingresa la marca del producto: ");
        String marca = scanner.nextLine();
        
        System.out.println("---------------------------------------------------");
        System.out.print("Ingresa el modelo del producto: ");
        String modelo = scanner.nextLine();
        
        System.out.println("---------------------------------------------------");
        System.out.print("Ingresa el precio del producto: ");
        double precio = scanner.nextDouble();
        scanner.nextLine(); // Consumir salto de línea
        
        Product producto = null;
        
        // Solicitar atributos específicos según el tipo de producto
        switch (type) {
            case "laptop":
                // Para Laptop: tamanoPantalla, procesador, memoriaRam, almacenamiento
                System.out.println("---------------------------------------------------");
                System.out.print("Ingresa el tamaño de pantalla (por ejemplo, 15.6\"): ");
                String tamanoPantallaLaptop = scanner.nextLine();
                
                System.out.println("---------------------------------------------------");
                System.out.print("Ingresa el procesador: ");
                String procesador = scanner.nextLine();
                
                System.out.println("---------------------------------------------------");
                System.out.print("Ingresa la memoria RAM (en GB): ");
                int memoriaRam = scanner.nextInt();
                
                System.out.println("---------------------------------------------------");
                System.out.print("Ingresa el almacenamiento (en GB): ");
                int almacenamiento = scanner.nextInt();
                
                producto = ProductFactory.createProduct(
                        "laptop",
                        marca,
                        modelo,
                        precio,
                        tamanoPantallaLaptop,
                        procesador,
                        memoriaRam,
                        almacenamiento
                );
                break;
                
            case "celular":
                // Para Celular: tamanoPantalla, capacidadBateria, cantidadCamaras
                System.out.println("---------------------------------------------------");
                System.out.print("Selecciona el tamaño de pantalla (en pulgadas):\n1. 6.1\"\n2. 6.5\"\n3. 6.8\"\nSe selecciona: ");
                int opcionPantalla = scanner.nextInt();
                String tamanoPantallaCelular = "";
                switch(opcionPantalla) {
                    case 1:
                        tamanoPantallaCelular = "6.1\"";
                        break;
                    case 2:
                        tamanoPantallaCelular = "6.5\"";
                        break;
                    case 3:
                        tamanoPantallaCelular = "6.8\"";
                        break;
                    default:
                        System.out.println("Opción no válida para tamaño de pantalla.");
                        System.exit(0);
                }
                
                System.out.println("---------------------------------------------------");
                System.out.print("Selecciona la capacidad de batería:\n1. 3500 mAh\n2. 4500 mAh\n3. 5000 mAh\nSe selecciona: ");
                int opcionBateria = scanner.nextInt();
                String capacidadBateria = "";
                switch(opcionBateria) {
                    case 1:
                        capacidadBateria = "3500 mAh";
                        break;
                    case 2:
                        capacidadBateria = "4500 mAh";
                        break;
                    case 3:
                        capacidadBateria = "5000 mAh";
                        break;
                    default:
                        System.out.println("Opción no válida para capacidad de batería.");
                        System.exit(0);
                }
                
                System.out.println("---------------------------------------------------");
                System.out.print("Selecciona la cantidad de cámaras:\n1. 2\n2. 3\n3. 4\nSe selecciona: ");
                int opcionCamaras = scanner.nextInt();
                int cantidadCamaras = 0;
                switch(opcionCamaras) {
                    case 1:
                        cantidadCamaras = 2;
                        break;
                    case 2:
                        cantidadCamaras = 3;
                        break;
                    case 3:
                        cantidadCamaras = 4;
                        break;
                    default:
                        System.out.println("Opción no válida para cantidad de cámaras.");
                        System.exit(0);
                }
                
                producto = ProductFactory.createProduct(
                        "celular",
                        marca,
                        modelo,
                        precio,
                        tamanoPantallaCelular,
                        capacidadBateria,
                        cantidadCamaras
                );
                break;
                
            case "tablet":
                // Para Tablet: tamanoPantalla, compatibilidadLapiz, cantidadCamaras
                System.out.println("---------------------------------------------------");
                System.out.print("Selecciona el tamaño de pantalla (en pulgadas):\n1. 8\"\n2. 10\"\n3. 12\"\nSe selecciona: ");
                int opcionPantallaTablet = scanner.nextInt();
                String tamanoPantallaTablet = "";
                switch(opcionPantallaTablet) {
                    case 1:
                        tamanoPantallaTablet = "8\"";
                        break;
                    case 2:
                        tamanoPantallaTablet = "10\"";
                        break;
                    case 3:
                        tamanoPantallaTablet = "12\"";
                        break;
                    default:
                        System.out.println("Opción no válida para tamaño de pantalla.");
                        System.exit(0);
                }
                
                System.out.println("---------------------------------------------------");
                System.out.print("¿La tablet es compatible con lápiz táctil? (true/false): ");
                boolean compatibilidadLapiz = scanner.nextBoolean();
                
                System.out.println("---------------------------------------------------");
                System.out.print("Selecciona la cantidad de cámaras:\n1. 1\n2. 2\n3. 3\nSe selecciona: ");
                int opcionCamarasTablet = scanner.nextInt();
                int cantidadCamarasTablet = 0;
                switch(opcionCamarasTablet) {
                    case 1:
                        cantidadCamarasTablet = 1;
                        break;
                    case 2:
                        cantidadCamarasTablet = 2;
                        break;
                    case 3:
                        cantidadCamarasTablet = 3;
                        break;
                    default:
                        System.out.println("Opción no válida para cantidad de cámaras.");
                        System.exit(0);
                }
                
                producto = ProductFactory.createProduct(
                        "tablet",
                        marca,
                        modelo,
                        precio,
                        tamanoPantallaTablet,
                        compatibilidadLapiz,
                        cantidadCamarasTablet
                );
                break;
                
            default:
                System.out.println("Tipo de producto no reconocido.");
                System.exit(0);
        }
        
        // Mostrar el resumen del producto registrado
        System.out.println("---------------------------------------------------");
        System.out.println("**Producto registrado correctamente:**");
        producto.showDetails();
        System.out.println("---------------------------------------------------");
        
        scanner.close();
    }
}
