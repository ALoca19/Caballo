/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CaballoNew;

import java.util.ArrayList;

/**
 *
 * @author anita
 */
public class Codigo {
     
    public long tInicio;
    public long tFinal;
    public long tTotal;
    
    int n;
    int tablero[][];
    int soluciones=0, pasos=1, x=0,y=0;
    int saltos[], op=1, aux=0;
    ArrayList<Object> caminosSaltos = new ArrayList<Object>();
    

    public Codigo(int n, int[][] tablero) {
        this.tInicio = 0;
        this.tFinal = 0;
        this.tTotal = 0;
        
        this.n = n;
        this.tablero = tablero;
    }

    
    
    //GETTERS
    public long gettFinal() {
        return tFinal;
    }

    public long gettInicio() {
        return tInicio;
    }

    public long gettTotal() {
        return tTotal;
    }
    
    
    public  void  inicio (){
        
        tablero[y][x]=pasos;
        saltos= new int[n*n];
        opciones();
        
    }
    
    
    public  void  opciones (){
       
       //tablero[y][x]=pasos;
       //movimiento(op); 
        
        
        
        for(int X2=0; X2<n; X2++)
         {
             for(int J2=0; J2<n; J2++)
             {
                 pasos=1;
                 tablero[X2][J2]=pasos;
                 x=J2;
                 y=X2;
                 op=1;
                 aux=0;
                 movimiento(op);
                 limpiarTablero();
             }
         }
        
        if(soluciones==0)
        {
            System.out.println("Para un tablero de "+n+"x"+n+" no hay soluciones");
        }
        else
        {
           System.out.println("Soluciones Totales: "+soluciones); 
        }
        
           
            
        
    }
    
    
    
    public  void limpiarTablero (){
        
        for(int i=0; i<n; i++)
         {
             for(int j=0; j<n; j++)
             {
                 tablero[i][j]=0;
             }
         }
            
        
    }
    
    private void movimiento(int opcion) {
        
        do{
            switch(opcion)
        {
            case 1:
                if((y+1>=0 && y+1<n) && (x+2>=0 && x+2<n))
                {
                    if( tablero[y+1][x+2]==0  )
                    {
                        pasos++;
                        y+=1;
                        x+=2;
                        tablero[y][x]=pasos;
               
                        saltos[aux]=opcion;
                        aux++;
                        op=1;
                    }
                    else
                    {
                       op=2;
                    }
                }
                else
                {
                   op=2;
                }
                
                break;
                
            case 2:
                
                if( (y-1>=0 && y-1<n) && (x+2>=0 && x+2<n))
                {
                    if(tablero[y-1][x+2]==0)
                    {    
                        pasos++;
                        y-=1;
                        x+=2;
                        tablero[y][x]=pasos;
                    
                        saltos[aux]=opcion;
                        aux++;
                        op=1;
                        
                    }
                    
                    else
                    {
                       op=3;
                    }
                }
                else
                {
                   op=3; 
                }
                break;
                
            case 3:
                if((y+2>=0 && y+2<n) && (x+1>=0 && x+1<n))
                {
                    if(tablero[y+2][x+1]==0)
                    {
                        pasos++;
                        y+=2;
                        x+=1;
                        tablero[y][x]=pasos;
                     
                        saltos[aux]=opcion;
                        aux++;
                        op=1;
                    }
                    
                    else
                    {
                       op=4;
                    }

                }
                else
                {
                   op=4;
                }
                break;
                
            case 4:
                if((y+2>=0 && y+2<n) && (x-1>=0 && x-1<n))
                {
                    if(tablero[y+2][x-1]==0)
                    {
                       pasos++;
                       y+=2;
                       x-=1;
                       tablero[y][x]=pasos;
                   
                       saltos[aux]=opcion;
                        aux++;
                        op=1;
                    }
                    
                    else
                    {
                       op=5;
                    }

                }
                else
                {
                   op=5;
                }
                break;
                
            case 5:
                if((y+1>=0 && y+1<n) && (x-2>=0 && x-2<n))
                {
                    if(tablero[y+1][x-2]==0)
                    {
                     pasos++;
                        y+=1;
                        x-=2;
                        tablero[y][x]=pasos;
                      
                        saltos[aux]=opcion;
                        aux++;
                        op=1;
                    }
                    
                    else
                    {
                       op=6;
                    }

                }
                else
                {
                   op=6; 
                }
                break;
                
            case 6:
                if((y-1>=0 && y-1<n) && (x-2>=0 && x-2<n))
                {
                    if(tablero[y-1][x-2]==0)
                    {
                       pasos++;
                    y-=1;
                    x-=2;
                    tablero[y][x]=pasos;
                   
                    saltos[aux]=opcion;
                    aux++;
                    op=1;
                    }
                    
                    else
                    {
                       op=7;
                    }

                }
                else
                {
                   op=7; 
                }
                break;
                
            case 7:
                if((y-2>=0 && y-2<n) && (x-1>=0 && x-1<n))
                {
                    if(tablero[y-2][x-1]==0)
                    {
                       pasos++;
                    y-=2;
                    x-=1;
                    tablero[y][x]=pasos;
                   
                    saltos[aux]=opcion;
                        aux++;
                        op=1;
                    }
                    
                    else
                    {
                       op=8;
                    }

                }
                else
                {
                   op=8;
                }
                break;
                
            case 8:
                if((y-2>=0 && y-2<n) && (x+1>=0 && x+1<n))
                    {
                        if(tablero[y-2][x+1]==0)
                        {
                         pasos++;
                        y-=2;
                        x+=1;
                        tablero[y][x]=pasos;
                        
                        saltos[aux]=opcion;
                        aux++;
                        op=1;
                        }
                        
                        else
                        {
                           op=9;
                        }

                    }
                else
                {
                   op=9; 
                }
                 break;
            case 9:
                
                
                for(int i=0; i<saltos.length; i++)
                {
                    System.out.print(saltos[i]+",");
                }
                System.out.println("");
                
                System.out.println("");
                
                /*
                if(pasos==(n*n))
                {
                    
                imprimirTablero();
                /*
                for(int i=0; i<saltos.length; i++)
                {
                    System.out.print(saltos[i]+",");
                }
                System.out.println("");
                */
                //System.out.println("");
                //soluciones+=1;
                
                //}
                
                aux=aux-1;
                
                if(aux>-1)
                {
                    
                    imprimirTablero();
                    limpiarUltimaDato();
                    
                    int c=saltos[aux]+1;
                    saltos[aux]=0;
                    op=c;
                    
                }
                
                
                
                
                
                break;
                
         }
            
            
            
            
            
            opcion=op;
        }while(aux>-1);
        
       
        //imprimirTablero();
        limpiarTablero();
                
   
        
     
    
    }

    private void limpiarUltimaDato() {
      
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(tablero[i][j]==pasos)
                {
                    tablero[i][j]=0;
                }
            }
        }
        pasos-=1;
        
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(tablero[i][j]==pasos)
                {
                    x=j;
                    y=i;
                }
            }
        }
                
    }
    
    private void imprimirTablero() {
      
        for(int X2=0; X2<n; X2++)
         {
             for(int J2=0; J2<n; J2++)
             {
                 System.out.print("   "+tablero[X2][J2]+"   ");
             }
             System.out.println("");
         }
                
    }
    



    
    
    
    
}
