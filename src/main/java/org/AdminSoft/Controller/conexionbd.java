package org.AdminSoft.Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static org.AdminSoft.Model.otros.imprimir.p;

public class conexionbd {
    public static Connection conectar() throws SQLException{
        String url="jdbc:mysql://localhost:3306/adminsoft";
        String user="root";
        String password="gjufePS42mb&ej^E$hu%P4";
        return DriverManager.getConnection(url,user,password);
    }
}
