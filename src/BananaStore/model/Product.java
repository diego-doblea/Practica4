package model;

/**
 * Clase abstracta que representa un producto en la tienda Banana Store.
 * Contiene atributos comunes a todos los productos.
 */
public abstract class Product {
    protected String marca;
    protected String modelo;
    protected double precio;
    
    /**
     * Constructor de la clase Product.
     * 
     * @param marca  La marca del producto.
     * @param modelo El modelo del producto.
     * @param precio El precio del producto.
     */
    public Product(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }
    
    /**
     * Método abstracto para mostrar los detalles del producto.
     */
    public abstract void showDetails();
}
