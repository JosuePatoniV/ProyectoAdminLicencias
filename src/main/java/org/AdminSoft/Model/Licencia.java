package org.AdminSoft.Model;

public class Licencia {
    private int idLicencia;
    private int idProducto;
    private String codigoLicencia;
    private String estado;
    //Metodo constructor
    public Licencia(int idLicencia,String codigoLicencia,String estado,int idProducto){
        this.idLicencia=idLicencia;
        this.codigoLicencia=codigoLicencia;
        this.estado=estado;
        this.idProducto=idProducto;
    }
    //metodos get
    public int getIdLicencia() {
        return idLicencia;
    }
    public String getCodigoLicencia() {
        return codigoLicencia;
    }
    public String getEstado() {
        return estado;
    }
    public int getIdProducto() {return idProducto;}
    //metodos set

    public void setIdLicencia(int idLicencia) {
        this.idLicencia = idLicencia;
    }
    public void setCodigoLicencia(String codigoLicencia) {
        this.codigoLicencia = codigoLicencia;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Licencia: " +
                "ID=" + idLicencia +
                "\nEstado: " + estado  +
                "\nCodigo: " + codigoLicencia +
                "\nProductoID= " + idProducto+
                "\n------------";
    }

}
