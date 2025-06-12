package org.AdminSoft.Model;

import java.time.LocalDateTime;

public class Cancelacion extends accion{
    public Cancelacion(int id, LocalDateTime dateAcction, int idLicencia, int idAdministrador){
        super(id, dateAcction, idLicencia, idAdministrador);
    }
}
