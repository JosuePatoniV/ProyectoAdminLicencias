package org.AdminSoft.Visual;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import static org.AdminSoft.Model.otros.imprimir.p;

public class compraLicenciaV {
    public static void compra(){
        boolean estado=false;
        Scanner scanner=new Scanner(System.in);
        int opcion=0;

        while (estado!=true) {
            p("-----------------------------------------------------");
            p("Registro de compra");
            p("-----------------------------------------------------");
            p("Ingresa la informacion en el formato indicado");
            p("-----------------------------------------------------");
            p("Fecha vencimiento DD/MM/YYYY HH:MM (si no sabes la Hora usa 11:11)");
            LocalDateTime date1=LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
            String texto=scanner.nextLine();
            LocalDateTime date2=LocalDateTime.parse(texto);
            p("44.Salir");

            try {
                opcion = scanner.nextInt();
            }catch (Exception e){
                p("Opcion invalida");
                scanner.nextLine();
            }
            switch (opcion){
                case 44:
                    p("Seguro que deseas salir(0/1)");
                    int sali= scanner.nextInt();
                    if(sali==1){
                        p("La compra no fue registrada...");
                        p("------------------------------");
                        estado=true;}
                    if(sali==0){estado=false; }
                    break;

            }

        }
    }
}
