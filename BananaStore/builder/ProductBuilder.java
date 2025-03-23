package BananaStore.builder;

import BananaStore.model.Product;

/**
 * Interfaz para la construcción de productos.
 * Define los métodos para establecer los atributos comunes de un producto.
 */
public interface ProductBuilder {
    
    /**
     * Establece la marca del producto.
     * @param brand La marca del producto.
     */
    void setBrand(String brand);
    
    /**
     * Establece el modelo del producto.
     * @param model El modelo del producto.
     */
    void setModel(String model);
    
    /**
     * Establece el precio del producto.
     * @param price El precio del producto.
     */
    void setPrice(double price);
    
    /**
     * Construye y devuelve el producto final.
     * @return Un objeto Product ya construido.
     */
    Product build();
}
