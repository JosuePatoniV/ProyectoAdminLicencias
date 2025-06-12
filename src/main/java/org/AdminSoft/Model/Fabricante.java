package org.AdminSoft.Model;

import java.util.Set;

public class Fabricante {
    private String nombreFabricante;
    private Set<Producto> productos;

    public Fabricante(String nombreFabricante){
        this.nombreFabricante=nombreFabricante;
    }
    public Fabricante(String nombreFabricante,Set<Producto> productos){
        this.nombreFabricante=nombreFabricante;
        this.productos=productos;
    }

    //Metodos get
    public String getNombreFabricante() {
        return nombreFabricante;
    }
    public Set<Producto> getProductos() {
        return productos;
    }
    //metodos Set
    public void setNombreFabricante(String nombreFabricante) {
        this.nombreFabricante = nombreFabricante;
    }
    public void setProductos(Set<Producto> productos) {
        this.productos = productos;
    }
}
