package org.AdminSoft.Model;

import java.util.List;
import java.util.Set;

public class EquipoComputo {
    private int idEquipo;
    private String direccionIp;
    private Set<Licencia> Licencias;

    public EquipoComputo(int idEquipo,String direccionIp){
        this.idEquipo=idEquipo;
        this.direccionIp=direccionIp;
    }
    public EquipoComputo(int idEquipo,String direccionIp,Set<Licencia> licencias){
        this.idEquipo=idEquipo;
        this.direccionIp=direccionIp;
        this.Licencias=licencias;
    }
    //Metodos get
    public int getIdEquipo() {
        return idEquipo;
    }

    public String getDireccionIp() {
        return direccionIp;
    }

    public Set<Licencia> getLicencias() {
        return Licencias;
    }
    //Metodos set

    public void setIdEquipo(int idEquipo) {
        this.idEquipo = idEquipo;
    }

    public void setDireccionIp(String direccionIp) {
        this.direccionIp = direccionIp;
    }

    public void setLicencias(Set<Licencia> licencias) {
        this.Licencias = licencias;
    }

}
