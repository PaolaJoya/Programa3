/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto3;

/**
 *
 * @author Paola Joya-David Castro
 *
 */
public class Televisor extends Electrodomesticos{
    private int  resolucion;
    private boolean  sintonizadorTDT;

    /**
     * Creacion constructor
     */
    public Televisor() {
        super();
        this.resolucion = 20;
        this.sintonizadorTDT = true;
    }
    public Televisor(int peso,float precioBase) {
        super();
        this.peso=peso;
        this.precio_base=precioBase;
        this.resolucion = 20;
        this.sintonizadorTDT = false;
    }
    /**
     * Metodo televisor
     * @param resolucion
     * @param sincronizador_TDT
     * @param precio_base
     * @param peso
     * @param color
     * @param consumo
     * @param precio_final 
     */
    
    public Televisor(int resolucion, boolean sincronizador_TDT, float precio_base, int peso, Colores color, Consumo consumo, float precio_final) {
        super(precio_base, peso, color, consumo);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sincronizador_TDT;
    }
    /**
     * Genera el precio final de acuerdo a la resolucion
     */
      @Override
     public void datos(){
        super.datos();
        if (resolucion>40){
            precio_final=(float) (precio_final+0.30);
        }else{
            precio_final=precio_final;}
         if(sintonizadorTDT==true){
             precio_final=precio_final+50;}
        else{
            precio_final=precio_final;
        }
        if((resolucion>40)&&(sintonizadorTDT==true)){
             precio_final=(float) (precio_final+0.30)+50;
        }
            System.out.println(" Resolucion:"+this.resolucion+" Sincronizador TDT: "+this.sintonizadorTDT);
            System.out.println(" Precio final :"+precio_final);
     }

    public double getResolucion() {
        return resolucion;
    }

    public boolean getSincronizador_TDT() {
        return sintonizadorTDT;
    }

}
