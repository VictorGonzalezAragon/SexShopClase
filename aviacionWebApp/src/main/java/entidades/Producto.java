/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Víctor
 */
@Entity
public class Producto implements Serializable {
    
     //Atributos(mismo nombre que bbdd)
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id_producto;  
    
    
    private String nombre_producto;
    private double  precio_producto;
    private int stockDisponible_producto;
    private String descripcion_producto;
    private int uds_vendidas;
    private int id_categoria;

    public Producto() {
    }

    public Producto(int id_producto, String nombre_producto, double precio_producto, int stockDisponible_producto, String descripcion_producto, int uds_vendidas, int id_categoria) {
        this.id_producto = id_producto;
        this.nombre_producto = nombre_producto;
        this.precio_producto = precio_producto;
        this.stockDisponible_producto = stockDisponible_producto;
        this.descripcion_producto = descripcion_producto;
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

    public String getDescripcion_producto() {
        return descripcion_producto;
    }

    public void setDescripcion_producto(String descripcion_producto) {
        this.descripcion_producto = descripcion_producto;
    }

    public int getUds_vendidas() {
        return uds_vendidas;
    }

    public void setUds_vendidas(int uds_vendidas) {
        this.uds_vendidas = uds_vendidas;
    }

    public int getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }
    
    
    
    
    
    
    
    
    
    
    
}
