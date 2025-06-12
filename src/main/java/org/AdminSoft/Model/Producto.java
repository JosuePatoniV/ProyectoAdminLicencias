package org.AdminSoft.Model;

import java.util.Set;

public class Producto {
    private int idProducto;
    private String nombreProducto;
    private Set<Licencia> licencias;
    public Producto(int idProducto,String nombreProducto){
        this.idProducto=idProducto;
        this.nombreProducto=nombreProducto;
    }
    public Producto(int idProducto,String nombreProducto,Set<Licencia> licencias){
        this.idProducto=idProducto;
        this.nombreProducto=nombreProducto;
        this.licencias=licencias;
    }
    //metodos get
    public int getIdProducto() {
        return idProducto;
    }
    public String getNombreProducto() {
        return nombreProducto;
    }
    public Set<Licencia> getLicencias() {
        return licencias;
    }
    //metodos Set
    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }
    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }
    public void setLicencias(Set<Licencia> licencias) {
        this.licencias = licencias;
    }
}
