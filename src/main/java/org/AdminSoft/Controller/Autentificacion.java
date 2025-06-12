package org.AdminSoft.Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static org.AdminSoft.Controller.conexionbd.conectar;
import static org.AdminSoft.Model.otros.imprimir.p;

public class Autentificacion {
    public static boolean ingreso(String usuario, String password){
        String sql="Select *From tadministrador where nombre =? AND apellido1=?";
        try {
            Connection connection = conectar();
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setString(1,usuario);
            preparedStatement.setString(2,password);
            ResultSet resultSet=preparedStatement.executeQuery();
            if(resultSet.next()){
                p("Bienvenido "+usuario );
                return true;

            }
            connection.close();
            preparedStatement.close();
            resultSet.close();
        }catch (SQLException e){
            p("Error al conectar con la base de datos");
            e.printStackTrace();
        }

        p("No se encontraron las credenciales");
        return false;
    }
}
