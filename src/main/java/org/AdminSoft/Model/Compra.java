package org.AdminSoft.Model;

import java.time.LocalDateTime;

public class Compra extends accion{
    //constructor de compra
    public Compra(int id, LocalDateTime dateAcction, LocalDateTime date2, int idLicencia, int idAdministrador, int costo){
        super(id, dateAcction, date2, idLicencia, idAdministrador, costo);
    }
}
