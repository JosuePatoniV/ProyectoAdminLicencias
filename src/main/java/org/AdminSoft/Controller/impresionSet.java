package org.AdminSoft.Controller;

import java.util.Set;

import static org.AdminSoft.Model.otros.imprimir.p;

public class impresionSet {
    public static void imprimir(Set<?> conjunto){
        if(conjunto.isEmpty()){
            p("Aun no hay datos registrados");
        }
        for(Object obj:conjunto){
            System.out.println(obj);
        }

    }
}
