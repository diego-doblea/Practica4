package factory;

import model.*;
import java.util.Map;
import java.util.HashMap;
import java.util.Optional;

/**
 * Clase Factory encargada de crear instancias de productos sin usar condicionales extensos.
 */
public class ProductFactory {
    
    /**
     * Interfaz funcional para crear un producto a partir de parámetros.
     */
    @FunctionalInterface
    public interface ProductCreator {
        Product create(Object... params);
    }
    
    /**
     * Mapa que asocia el tipo de producto (en minúsculas) con su correspondiente función de creación.
     */
    private static final Map<String, ProductCreator> creators = new HashMap<>();
    
    static {
        // Asociamos "laptop" con su función creadora
        creators.put("laptop", (params) -> new Laptop(
                (String) params[0],
                (String) params[1],
                (Double) params[2],
                (String) params[3],
                (String) params[4],
                (Integer) params[5],
                (Integer) params[6]
        ));
        
        // Asociamos "celular" con su función creadora
        creators.put("celular", (params) -> new Celular(
                (String) params[0],
                (String) params[1],
                (Double) params[2],
                (String) params[3],
                (String) params[4],
                (Integer) params[5]
        ));
        
        // Asociamos "tablet" con su función creadora
        creators.put("tablet", (params) -> new Tablet(
                (String) params[0],
                (String) params[1],
                (Double) params[2],
                (String) params[3],
                (Boolean) params[4],
                (Integer) params[5]
        ));
    }
    
    /**
     * Crea un producto según el tipo especificado usando un mapa de creadores.
     * 
     * @param type   El tipo de producto a crear ("laptop", "celular" o "tablet").
     * @param params Los parámetros necesarios para la creación del producto.
     * @return Una instancia de Product.
     * @throws IllegalArgumentException Si el tipo de producto no es soportado.
     */
    public static Product createProduct(String type, Object... params) {
        ProductCreator creator = creators.get(type.toLowerCase());
        return Optional.ofNullable(creator)
                .orElseThrow(() -> new IllegalArgumentException("Tipo de producto no soportado: " + type))
                .create(params);
    }
}
