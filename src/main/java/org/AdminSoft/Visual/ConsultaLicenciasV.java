package org.AdminSoft.Visual;

import java.util.Scanner;

import static org.AdminSoft.Controller.ConsultaLicencias.consulta;
import static org.AdminSoft.Controller.impresionSet.imprimir;
import static org.AdminSoft.Model.otros.imprimir.p;

public class ConsultaLicenciasV {
    public static void consultalicencia(){
        Scanner scanner=new Scanner(System.in);
        boolean salir=false;
        int opcion=0;
        while(salir!=true) {
            p("-----------------------------------------------------");
            p("Consulta de licencias)");
            p("-----------------------------------------------------");
            p("POR FAVOR INGRESE UNA OPCION");
            p("1.Todas las licencias");
            p("2.Licencias activas");
            p("3.Licencias inactivas");
            p("44.salir");
            try {
                opcion = scanner.nextInt();
            }catch (Exception e){
                p("Opcion invalida");
                scanner.nextLine();
            }
            switch (opcion){
                case 1:
                    imprimir(consulta());
                    break;
            }
        }
    }
}
