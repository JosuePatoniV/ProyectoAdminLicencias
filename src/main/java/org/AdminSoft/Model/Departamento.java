package org.AdminSoft.Model;

import java.util.Set;

public class Departamento {
    private int idDepartamento;
    private String nombre;
    private Set<EquipoComputo> coleccion;

    public Departamento(int idDepartamento,String nombre){
        this.idDepartamento=idDepartamento;
        this.nombre=nombre;
    }
    public Departamento(int idDepartamento,String nombre,Set<EquipoComputo> coleccion){
        this.idDepartamento=idDepartamento;
        this.nombre=nombre;
        this.coleccion=coleccion;
    }
    //Metodos get
    public int getIdDepartamento() {
        return idDepartamento;
    }
    public String getNombre() {
        return nombre;
    }
    public Set<EquipoComputo> getColeccion() {
        return coleccion;
    }
    //Metodos set

    public void setIdDepartamento(int idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setColeccion(Set<EquipoComputo> coleccion) {
        this.coleccion = coleccion;
    }
}
