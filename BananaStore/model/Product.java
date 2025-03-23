package BananaStore.model;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/**
 * Clase abstracta que representa un producto genérico en Banana Store.
 * Contiene los atributos comunes a todos los productos: marca, modelo y precio.
 */
public abstract class Product {
    protected String brand;
    protected String model;
    protected double price;

    /**
     * Constructor de la clase Product.
     * @param brand La marca del producto.
     * @param model El modelo del producto.
     * @param price El precio del producto.
     */
    public Product(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Getters y setters...

    /**
     * Método auxiliar para formatear el precio en formato anglosajón:
     *  - Coma (,) para separar miles
     *  - Punto (.) para decimales
     * @return El precio formateado como cadena (ej. 18,999.00).
     */
    protected String getFormattedPrice() {
        // Obtiene símbolos de formato para el locale US
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
        // Define el patrón de formateo
        DecimalFormat df = new DecimalFormat("#,###.00", symbols);
        return df.format(price);
    }

    /**
     * Método abstracto que devuelve una descripción completa del producto.
     * @return Una cadena con la descripción del producto.
     */
    public abstract String getDescription();
}
