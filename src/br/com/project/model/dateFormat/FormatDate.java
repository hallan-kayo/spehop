/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.project.model.dateFormat;

import br.com.project.view.RegisterWindow;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hallan
 */
public class FormatDate {
    
    /*
    *formatar a String obtida do JTextFIeld para o tipo Date
    */
    public Date formatForDate(String data) throws ParseException{
        //definindo a forma da Data Recebida
        DateFormat formatUS = new SimpleDateFormat("dd-MM-yyyy");
        return formatUS.parse(data);
    }
    
    /*
    *formatar data do modelo brasileiro para o modelo americano
    */
    public String formatForAmericanModel(Date data){
        //definido modelo americano
        DateFormat formatBR = new SimpleDateFormat("yyyy-MM-dd");
        return formatBR.format(data);
        
    }
    
}
