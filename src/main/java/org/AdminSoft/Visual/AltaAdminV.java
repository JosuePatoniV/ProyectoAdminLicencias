package org.AdminSoft.Visual;

import org.AdminSoft.Model.Administrador;

import java.util.Scanner;

import static org.AdminSoft.Model.otros.imprimir.p;

public class AltaAdminV {
    public static void altadminV(){
        Scanner scanner=new Scanner(System.in);
        p("-----------------------------------------------------");
        p("Alta de Administrador");
        p("-----------------------------------------------------");
        p("Por favor ingrese los siguientes datos");
        p("Nombre: ");
        String nombre=scanner.nextLine();
        p("Apellido Paterno: ");
        String paterno=scanner.nextLine();
        if(nombre==" "||paterno==" "){
            p("formato invalido");
        }
        p("Apellido Materno(opcional): ");
        String materno=scanner.nextLine();



    }
}
