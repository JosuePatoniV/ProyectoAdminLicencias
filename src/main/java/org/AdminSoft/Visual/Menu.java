package org.AdminSoft.Visual;

import java.awt.event.TextEvent;
import java.util.Scanner;

import static org.AdminSoft.Model.otros.imprimir.p;
import static org.AdminSoft.Visual.ConsultaLicenciasV.consultalicencia;
import static org.AdminSoft.Visual.compraLicenciaV.compra;

public class Menu {
    public static void menu(){
        int opcion=0;
        boolean salir=false;
        Scanner scanner=new Scanner(System.in);
        p("-----------------------------------------------------");
        p("Menu de Gestion");
        p("-----------------------------------------------------");
        p("Opciones(Presiona el numero)");
        while(salir!=true) {
            p("1.Consulta Licencias");
            p("2.Consulta Administradores");
            p("3.Registrar compra");
            p("44.Salir");
            try {
                opcion = scanner.nextInt();
            }catch (Exception a){
                p("Opcion invalida intente de nuevo");
                scanner.nextLine();
            }
            switch (opcion){
                case 1:
                    consultalicencia();
                    break;

                case 2:

                    break;

                case 3:
                    compra();
                    break;
                case 44:
                    p("Seguro que deseas salir(0/1)");
                    int sali= scanner.nextInt();
                    if(sali==1){salir=true;}
                    if(sali==0){salir=false; }
                    break;
                default:
                    p("Opcion invalida(Asegurese de presionar el numero indicado)");
            }

        }
    }
}
