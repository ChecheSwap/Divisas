/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BASE;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author VestigiumSenex
 */
public class dataB {
    
    private List<infoDivisas> central;
    private List<String> names;
    
    public dataB(){
        
        this.fill();
     
    }
    
    public void fill(){
        
        this.central = new ArrayList<infoDivisas>(){};
        
        this.central.add(new infoDivisas("Peso Mexicano(MXN)",18.70));
        this.central.add(new infoDivisas("Bitcoin (BTC)",0.00012));
        this.central.add(new infoDivisas("Euro (EUR)",.81));
        this.central.add(new infoDivisas("Dolar Americano (USD)",1.00));
        this.central.add(new infoDivisas("Dolar Canadiense (CAN)",1.25));        
        this.central.add(new infoDivisas("Bolivar Venezolano(VEF)",10.00));
        this.central.add(new infoDivisas("Dólar Australiano (AUD)",1.30));
        this.central.add(new infoDivisas("Franco Suizo (CHF)",.95));
        this.central.add(new infoDivisas("Sol peruano (PEN)",3.25));
        this.central.add(new infoDivisas("Paraguay Guarani (PYG)",5586.00));         
        this.central.add(new infoDivisas("Peso Argentino (ARS)",19.95));
        this.central.add(new infoDivisas("Peso Chileno (CLP)",595.00));
        this.central.add(new infoDivisas("Peso Colombiano (COP)",2900.00));
        this.central.add(new infoDivisas("Peso Cubano (CUC)",1.00));
        this.central.add(new infoDivisas("Peso Dominicano (DOP)",49.00));        
        this.central.add(new infoDivisas("Quetzal Guatemalteco (GTQ)",7.34));
        this.central.add(new infoDivisas("Real Brasileño (BRL)",3.25));
        this.central.add(new infoDivisas("Rupia India (INR)",64.2));
        this.central.add(new infoDivisas("Yenes Japoneses (JPY)",109.00));
        this.central.add(new infoDivisas("Yuan Chino (CNY)",6.5)); 
        
    }

    public List<infoDivisas> getObjects(){
        
        return this.central;
    }
    
    public List<String> getNames(){
        
        this.names = new ArrayList<String>(){};
        
        for(infoDivisas x : this.central){
            this.names.add(x.getname());
        }
        
        return this.names;
    }
}

