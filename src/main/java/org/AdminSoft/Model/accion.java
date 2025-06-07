package org.AdminSoft.Model;

import java.time.LocalDateTime;

public class accion {
    private int id;
    private LocalDateTime dateAcction=LocalDateTime.now();
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

}
