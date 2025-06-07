package org.AdminSoft.Model;

public class Administrador {
    private int idAdministrador;
    private String nombre;
    private String apellido1;
    private String apellido2;
    //Metodos construcotres
    public Administrador(int idAdministrador,String nombre,String apellido1){
        this.idAdministrador=idAdministrador;
        this.nombre=nombre;
        this.apellido1=apellido1;
    }
    public Administrador(int idAdministrador,String nombre,String apellido1,String apellido2){
        this.idAdministrador=idAdministrador;
        this.nombre=nombre;
        this.apellido1=apellido1;
        this.apellido2=apellido2;
    }
    //metodos get
    public int getIdAdministrador() {
        return idAdministrador;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellido1() {
        return apellido1;
    }
    public String getApellido2() {
        return apellido2;
    }
    //metodos set
    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }
    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
