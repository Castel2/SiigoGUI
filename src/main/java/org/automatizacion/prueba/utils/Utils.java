package org.automatizacion.prueba.utils;

import org.yecht.Data;

import java.util.Arrays;

import static org.automatizacion.prueba.utils.GeneralConstants.CHARACTER;

public class Utils {

    public static int extracPrice(String price){
        String aux = "";
        price = price.replace(".","");
        String[] split = price.split(" ");
        for (int i = 0; i < split.length ; i++){
            if(split[i].equals(CHARACTER)){
                aux = split[i+1];
                break;
            }
        }
        return Integer.parseInt(aux);
    }

}
