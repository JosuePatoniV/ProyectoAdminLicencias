package org.AdminSoft.Model;

import java.time.LocalDateTime;

public class Renovacion extends accion{
    //Metodo constructor
    public Renovacion(int id, LocalDateTime dateAcction, LocalDateTime date2, int idLicencia, int idAdministrador, int costo){
        super(id, dateAcction, date2, idLicencia, idAdministrador, costo);
    }
}
