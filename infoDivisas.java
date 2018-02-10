/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BASE;

/**
 *
 * @author VestigiumSenex
 */
public class infoDivisas {
    private String name;
    private Double dllequivalent;    
    
    
    public infoDivisas(){
        
    }
            
    public infoDivisas(String name, Double dllequivalent){
        this.name = name;
        this.dllequivalent = dllequivalent;
    }
    
    public String getname(){
        return this.name;
    }
    
    public Double getdllval(){
        return this.dllequivalent;
    }
    
    public void Setname(String name){
        this.name = name;
    }
    
    public void Setequivalent(Double dllequivalent){
        this.dllequivalent = dllequivalent;
    }
    
    
}
