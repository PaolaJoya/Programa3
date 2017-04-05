/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto3;

/**
 *
 * @author Paola Joya-David Castro
 */
public class Electrodomesticos {
/**
 * Declaracion atributos por defecto
 */
    public  float precio_base;
    int peso;
    private Colores color;
    private Consumo consumo;
    public  float precio_final;
    
    public Electrodomesticos() {
        this.precio_base = 100;
        this.peso = 5;
        this.color = Colores.blanco;
        this.consumo = Consumo.F;   
    }
    /**
     * Creacion del metodo
     * @param precio_base
     * @param peso
     * @param color
     * @param consumo 
     */

    public Electrodomesticos(float precio_base, int peso, Colores color, Consumo consumo) {
        this.precio_base = 100;
        this.peso = peso;
        this.color = color;
        this.consumo = consumo;
            
    }
    
       /**
        * Evalua el precio de acuerdo al peso
        */
    public void datos(){
        if (peso<=19){
            precio_final=precio_base+10;
        }else{
            if(peso<=49){
                 precio_final=precio_base+50;
            }else{
            if(peso<=79){
                 precio_final=precio_base+80;
            }else{
            if(peso>80){
                 precio_final=precio_base+100;
            
        }
            }
            }
        }    
        if(consumo==Consumo.A){
            precio_final=precio_final+100;
        }else{
            if(consumo==Consumo.B){
            precio_final=precio_final+80;
            }else{
            if(consumo==Consumo.C){
            precio_final=precio_final+60;
            }else{
            if(consumo==Consumo.D){
            precio_final=precio_final+50;
            }else{
            if(consumo==Consumo.E){
            precio_final=precio_final+30;
            }else{
            if(consumo==Consumo.F){
            precio_final=precio_final+10;
            }
        }
            }
            }
            }
        }
         System.out.print(" Precio: "+ this.precio_base +" Peso: "+this.peso+" Color: " +this.color +" Consumo:"+ this.consumo);
    }

    public float getPrecio_base() {
          return precio_base;
    }

    public int getPeso() {
             return peso;
    }

    public Colores getColores() {
        return color;
    }

    public Consumo getConsumo() {
        return consumo;
    }
    public float getPrecio_final() {
        return precio_final;
    }

    public void setPrecio_base(float precio_base) {
        this.precio_base = precio_base;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setColor(Colores color) {
        this.color = color;
    }

    public void setConsumo(Consumo consumo) {
        this.consumo = consumo;
    }

    public void setPrecio_final(float precio_final) {
        this.precio_final = precio_final;
    }
  

}