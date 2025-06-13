package org.AdminSoft.Visual;
import org.AdminSoft.Controller.Autentificacion;

import java.sql.SQLException;
import java.util.Scanner;

import static org.AdminSoft.Controller.Autentificacion.ingreso;
import static org.AdminSoft.Controller.conexionbd.conectar;
import static org.AdminSoft.Model.otros.imprimir.p;
import static org.AdminSoft.Visual.Menu.menu;

public class Ingreso {
    public static void Ingreso() {
        Scanner scanner= new Scanner(System.in);
        boolean estado=false;

        while(!estado) {
            p("-----------------------------------------------------");
            p("Bienvenido al sistema de Administracion de licencias");
            p("-----------------------------------------------------");
            p("Por favor ingresa el usuario y contraseña");
            p("Usuario(Nombre): ");
            String usuario = scanner.nextLine();
            p("Contraseña(apellido paterno): ");
            String password = scanner.nextLine();
            estado=ingreso(usuario, password);
        }
    }

}
