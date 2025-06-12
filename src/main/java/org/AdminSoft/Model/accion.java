package org.AdminSoft.Model;

import java.time.LocalDateTime;

public class accion {
    private int id;
    private LocalDateTime dateAcction;
    private LocalDateTime date2;
    private int idLicencia;
    private int idAdministrador;
    private int costo;
    //constructor para compra y expiracion
    public accion(int id,LocalDateTime dateAcction,LocalDateTime date2,int idLicencia,int idAdministrador,int costo){
        this.id=id;
        this.dateAcction=dateAcction;
        this.date2=date2;
        this.idLicencia=idLicencia;
        this.idAdministrador=idAdministrador;
        this.costo=costo;
    }
    //constructor para cancelacion
    public accion(int id,LocalDateTime dateAcction,int idLicencia,int idAdministrador){
        this.id=id;
        this.dateAcction=dateAcction;
        this.idLicencia=idLicencia;
        this.idAdministrador=idAdministrador;
    }
    //Metodo get
    public int getId() {
        return id;
    }
    public LocalDateTime getDateAcction(){
        return dateAcction;
    }
    public LocalDateTime getDate2(){
        return date2;
    }
    public int getIdLicencia() {
        return idLicencia;
    }
    public int getIdAdministrador() {
        return idAdministrador;
    }
    public int getCosto() {
        return costo;
    }
    //metodos set
    public void setId(int id) {
        this.id = id;
    }
    public void setIdLicencia(int idLicencia) {
        this.idLicencia = idLicencia;
    }
    public void setDateAcction(LocalDateTime dateAcction) {
        this.dateAcction = dateAcction;
    }
    public void setDate2(LocalDateTime date2) {
        this.date2 = date2;
    }
    public void setCosto(int costo) {
        this.costo = costo;
    }
    public void setIdAdministrador(int idAdministrador) {
        this.idAdministrador = idAdministrador;
    }
}
