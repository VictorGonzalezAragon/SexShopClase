/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Víctor
 */
public class Producto {
    private int id_producto;
    private String nombre_producto;
    private double precio_producto;
    private int stockDisponible_producto;
    private String descripcion_productos;
    private int uds_vendidas;
    private Categoria id_categoria;

    public Producto() {
    }

    public Producto(int id_producto, String nombre_producto, double precio_producto, int stockDisponible_producto, String descripcion_productos, int uds_vendidas, Categoria id_categoria) {
        this.id_producto = id_producto;
        this.nombre_producto = nombre_producto;
        this.precio_producto = precio_producto;
        this.stockDisponible_producto = stockDisponible_producto;
        this.descripcion_productos = descripcion_productos;
        this.uds_vendidas = uds_vendidas;
        this.id_categoria = id_categoria;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public double getPrecio_producto() {
        return precio_producto;
    }

    public void setPrecio_producto(double precio_producto) {
        this.precio_producto = precio_producto;
    }

    public int getStockDisponible_producto() {
        return stockDisponible_producto;
    }

    public void setStockDisponible_producto(int stockDisponible_producto) {
        this.stockDisponible_producto = stockDisponible_producto;
    }

    public String getDescripcion_productos() {
        return descripcion_productos;
    }

    public void setDescripcion_productos(String descripcion_productos) {
        this.descripcion_productos = descripcion_productos;
    }

    public int getUds_vendidas() {
        return uds_vendidas;
    }

    public void setUds_vendidas(int uds_vendidas) {
        this.uds_vendidas = uds_vendidas;
    }

    public Categoria getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(Categoria id_categoria) {
        this.id_categoria = id_categoria;
    }
    
    
    
}
