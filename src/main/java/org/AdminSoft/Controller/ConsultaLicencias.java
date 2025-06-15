package org.AdminSoft.Controller;

import org.AdminSoft.Model.Licencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

import static org.AdminSoft.Controller.conexionbd.conectar;

public class ConsultaLicencias {

    public static Set<Licencia> consulta(){
        Set<Licencia> licencias=new HashSet<>();
        String sql="Select *From tlicencia";
        try{
            Connection connection = conectar();
            PreparedStatement preparedStatement= connection.prepareStatement(sql);
            ResultSet resultSet=preparedStatement.executeQuery();

            while(resultSet.next()){
                Licencia licencia=new Licencia(
                        resultSet.getInt("idlicencia"),
                        resultSet.getString("codigoLicencia"),
                        resultSet.getString("estado"),
                        resultSet.getInt("idProducto")
                );
                licencias.add(licencia);

            }
        }catch (SQLException e){e.printStackTrace();}

        return licencias.stream().sorted(Comparator.comparing(Licencia::getIdLicencia)).
                collect(Collectors.toCollection(LinkedHashSet::new));
    }

    public static Set<Licencia> consulta2(String op){
        Set<Licencia> licencias=new HashSet<>();
        String sql="Select *From tlicencia";

        try{
            Connection connection = conectar();
            PreparedStatement preparedStatement= connection.prepareStatement(sql);
            ResultSet resultSet=preparedStatement.executeQuery();

            while(resultSet.next()){
                Licencia licencia=new Licencia(
                        resultSet.getInt("idlicencia"),
                        resultSet.getString("codigoLicencia"),
                        resultSet.getString("estado"),
                        resultSet.getInt("idProducto")
                );
                licencias.add(licencia);

            }
        }catch (SQLException e){e.printStackTrace();}

        return licencias.stream()
                .filter(licencia -> op.equalsIgnoreCase(licencia.getEstado()))
                .sorted(Comparator.comparing(Licencia::getIdLicencia)).
                collect(Collectors.toCollection(LinkedHashSet::new));
    }



}
