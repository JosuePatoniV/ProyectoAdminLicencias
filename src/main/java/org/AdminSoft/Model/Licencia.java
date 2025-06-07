package org.AdminSoft.Model;

public class Licencia {
    private int idLicencia;
    private String codigoLicencia;
    private String estado;
    //Metodo constructor
    public Licencia(int idLicencia,String codigoLicencia,String estado){
        this.idLicencia=idLicencia;
        this.codigoLicencia=codigoLicencia;
        this.estado=estado;
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

}
