/* 1,2,4,6,2,3,4,6,7,2,1,4,5,7,8,1,3,6,5,1,7,4,2,1,0,
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CaballoNew;

/**
 *
 * @author anita
 */
public class Main {
     public static void main(String[] args) {
        
         int n = 3;
         int tablero[][] = new int[n][n];
         
         for(int i=0; i<n; i++)
         {
             for(int j=0; j<n; j++)
             {
                 tablero[i][j]=0;
             }
         }
         
         
         
         Codigo caballo = new Codigo(n, tablero);
         caballo.inicio();
       
         
    }
}
