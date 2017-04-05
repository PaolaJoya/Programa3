/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Paola Joya-David Castro
 */

public class ELECTRODOMESTICO {

    /**
     * 
     * @param args
     * @throws IOException 
     */
    public static void main(String[] args) throws IOException{
        Electrodomesticos electrodomestico;
        Electrodomesticos electrodomesticos;
        int televisor=0;
        int lavadora=0;
        int lavadora1=0;
        int lavadora2=0;
         int televisor1=0;
         int televisor2=0;
         float precioTelevisor =0, precioTelevisor1=0, precioTelevisor2=0;
        float precioLavadora =0,precioLavadora1=0,precioLavadora2=0;
        for(int i=1;i<=10;i++){
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("------------BIENVENIDO------------");
            System.out.println("Ingrese el electrodomestico");
            System.out.println("1.Lavadora");
            System.out.println("2.Televisor");
            int caso=Integer.parseInt(in.readLine());
            switch(caso){
                case 1:
                    System.out.println("ingresar los datos por:");
                    System.out.println("1. Ingreso Por defecto");
                    System.out.println("2. Ingreso total por usuario");
                    System.out.println("3. Ingreso parcial ");
                    int sistema=Integer.parseInt(in.readLine());
                    switch(sistema){
                        case 1:
                            electrodomesticos=new Lavadora();
                            electrodomesticos.datos();
                            lavadora= lavadora+1;
                            precioLavadora=precioLavadora+electrodomesticos.precio_final;
                            break;
                        case 2:
                            System.out.println("Ingrese la carga");
                            double carga=Double.parseDouble(in.readLine());
                            System.out.println("Ingrese el peso");
                            int peso=Integer.parseInt(in.readLine());
                            System.out.println("Ingrese el precio");
                            int precio_base=Integer.parseInt(in.readLine());                                   
                            System.out.println("Seleccionar el color");
                            System.out.println("1. Azul");
                            System.out.println("2. Negro");
                            System.out.println("3. Gris");
                            System.out.println("4. Blanco");
                            System.out.println("5. Rojo");
                            int colorElec=Integer.parseInt(in.readLine());
                            Colores color;
                            color= Colores.blanco;
                            switch(colorElec){
                                case 1: color=Colores.azul;
                                    break;
                                case 2:color=Colores.negro;
                               break;
                           case 3:color=Colores.gris;
                               break;
                           case 4:color=Colores.blanco;
                               break;
                           case 5:color=Colores.rojo;
                               break;
                       }
                            System.out.println("Seleccione el consumo");
                            System.out.println("1. A");
                            System.out.println("2. B");
                            System.out.println("3. C");
                            System.out.println("4. D");
                            System.out.println("5. E");
                            System.out.println("6. F");
                            int consumoEner=Integer.parseInt(in.readLine());
                            Consumo consumo;
                            consumo=Consumo.A;
                            switch(consumoEner){
                                case 1: consumo=Consumo.A;
                                      break;
                                case 2:consumo=Consumo.B;
                                    break;
                                case 3:consumo=Consumo.C;
                                    break;
                                case 4:consumo=Consumo.D;
                                    break;
                                case 5:consumo=Consumo.E;
                                    break;
                                case 6:consumo=Consumo.F;
                                    break;
                            }
                            electrodomesticos=new Lavadora(carga,precio_base,peso,color ,consumo);
                            electrodomesticos.datos();
                            lavadora1 = lavadora1+1;
                            precioLavadora1=precioLavadora1+electrodomesticos.precio_final;
         //             carga peso color precio_base consumo;
                    break;
                        case 3:
                            System.out.println("Ingrese el peso");
                            int peso1=Integer.parseInt(in.readLine());
                            peso=peso1;
                            System.out.println("Ingrese el precio");
                            int precio_base1=Integer.parseInt(in.readLine());
                            precio_base=precio_base1;
                            electrodomesticos=new Lavadora(precio_base,peso);
                            lavadora2=lavadora2+1;
                            precioLavadora2=precioLavadora2+electrodomesticos.precio_final;
                            break;
                    }
                    break;
                    
                case 2:
                    System.out.println("Desea los datos por:");
                    System.out.println("1. Ingreso por defecto");
                    System.out.println("2. Ingreso total por usuario");
                    System.out.println("3. Ingreso parcial");
                    int defectol=Integer.parseInt(in.readLine());
                    switch(defectol){
                        case 1:
                            electrodomesticos=new Televisor();
                            electrodomesticos.datos();
                            televisor=televisor+1;
                            precioTelevisor=precioTelevisor+electrodomesticos.precio_final;
                            break;
                        case 2:
                            System.out.println("Ingrese la resolucion");
                            int resolucion=Integer.parseInt(in.readLine());
                            System.out.println("Ingrese el peso");
                            int pesol=Integer.parseInt(in.readLine());
                            int peso = pesol;
                            System.out.println("¿tiene sincronizador TDT?");
                            System.out.println("Si es falso Digite FALSE de lo contrario TRUE");
                            boolean sincronizador_TDT=Boolean.parseBoolean(in.readLine());                    
                            System.out.println("Seleccione el color");
                            System.out.println("1. Azul");
                            System.out.println("2. Negro");
                            System.out.println("3. Gris");
                            System.out.println("4. Blanco");
                            System.out.println("5. Rojo");
                            int opcioncol=Integer.parseInt(in.readLine());
                            Colores colors;
                            colors= Colores.blanco;
                            switch(opcioncol){
                                case 1: colors=Colores.azul;
                                    break;
                                case 2:colors=Colores.negro;
                                    break;
                                case 3:colors=Colores.gris;
                                    break;
                                case 4:colors=Colores.blanco;
                                    break;
                                case 5:colors=Colores.rojo;
                                    break;
                            }
                            System.out.println("Seleccione el consumo");
                            System.out.println("1. A");
                            System.out.println("2. B");
                            System.out.println("3. C");
                            System.out.println("4. D");
                            System.out.println("5. E");
                            System.out.println("6. F");
                            int opcionco=Integer.parseInt(in.readLine());
                            Consumo consumos;
                            consumos= Consumo.A;
                            switch(opcionco){
                                case 1: consumos=Consumo.A;
                                    break;
                                case 2:consumos=Consumo.B;
                                    break;
                                case 3:consumos=Consumo.C;
                                    break;
                                case 4:consumos=Consumo.D;
                                    break;
                                case 5:consumos=Consumo.E;
                                    break;
                                case 6:consumos=Consumo.F;
                                    break;
                            }
                            electrodomesticos= new Televisor(resolucion,sincronizador_TDT,100,peso,colors,consumos,(float)32);
                            electrodomesticos.datos();
                            televisor1=televisor+1;
                            precioTelevisor1=precioTelevisor1+electrodomesticos.precio_final;
                            break;
                        case 3:
                            System.out.println("Ingrese el peso");
                            int peso1=Integer.parseInt(in.readLine());
                            peso=peso1;
                            System.out.println("Ingrese el precio");
                            int precio_base1=Integer.parseInt(in.readLine());
                            int precio_base = precio_base1;
                            electrodomesticos=new Televisor(precio_base,peso);
                            televisor2=televisor2+1;
                            precioTelevisor2=precioTelevisor2+electrodomesticos.precio_final;
                            break;
                    }
                 break;
        }        
        System.out.println("¿Ingresar otro electrodomestico?");
        System.out.println("seleccione 1.Si  2.No");
        int seleccion=Integer.parseInt(in.readLine());
                    
        if(seleccion==1){
        i++;   
        }else{
            i=10;
            int lavadoras=lavadora+lavadora1+lavadora2;
            int televisores=televisor+televisor1+televisor2;
            float precioTelevisores;
                precioTelevisores = precioTelevisor+precioTelevisor1+precioTelevisor2;
            float precioLavadoras;
                precioLavadoras=precioLavadora+precioLavadora1+precioLavadora2;
            System.out.println("El numero de lavadoras es: " +lavadoras);
            System.out.println("Precio total de las  lavadoras: " +precioLavadora);
            System.out.println("El numero de televisores es: " +televisores);
            System.out.println("Precio total de los televisores: " +precioTelevisores);
        } 
        }
        
    }
    }
    
