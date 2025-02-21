/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vectores;

import java.util.Scanner;
  
/**
 *
 * @author maria
 */
public class Vectores {    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner datos= new Scanner(System.in);
        
                
        //vectorDinamico(); 
        //vectorInverso();
        vectorDinamico02(); 
        
        System.out.println("Ingrese uan opción del siguiente menu /n"
                + "1.Vector Estatico con valores quemados/n  "
                + "2. Vector estatico con valores dinamicos /n"
                + "3. Vector a la inversa /n"
                + "4. Vcetor dinamico con valores dinamicos /n"
                + "5. Mtriz estatica con valores dinamicos /n"
                + "6. Matriz dinamica con valores dinamicos ");
      
        int opcion= datos.nextInt();
                switch (opcion){ 
                    
                    
                    case 1: 
                        VectorEstatico(); 
                        break; 
                        
                    case 2:
                        
                }
        
      int num[]= new int[5];
            
              num[0]=5; 
              num[1]=4 ;
              num[2]=3;
              num[3]=2 ;       
              num[4]=1 ;
              
              
        System.out.println("El numero almacenado en la posición 1 es: " + num[0]);
         System.out.println("El numero almacenado en la posición 2 es: " + num[1]);
          System.out.println("El numero almacenado en la posición 3 es: " + num[2]);
           System.out.println("El numero almacenado en la posición 4 es: " + num[3]);
            System.out.println("El numero almacenado en la posición 5 es: " + num[4]);
            
            // fin de vector estatico 
    }
   public static void vectorDinamico(){ 
       String nombres[]=new String[5];
        Scanner datos= new Scanner(System.in);     
               
       for (int i = 0; i < nombres.length; i++) {
           System.out.println("Ingrese un nombre a almacenar en la posición: ");
           nombres[i]= datos.next();
           
           
       }
       for (int i = 0; i < nombres.length; i++) {
           System.out.println("Recorriendo el ciclo para mostrar");
           System.out.println("El valor en la posición "+ i+1 + "es:" + nombres[i]);
           
           
           
       }
   } 
   
   public static void vectorInverso(){
       byte num[]= new byte[5];
       Scanner datos= new Scanner(System.in);
       // ciclo de guardar 
       
       for (int i = 0; i < num.length; i++) {
           System.out.println("Ingrese un número no mayor a 127");
           num[i]= datos.nextByte();
       }  
       // ciclo recorrer y mostrar 
           for (int j = (num.length -1); j >= 0; j--) {
               System.out.println("El valor guardado en la posición" + j + "es:" + num[j]);
               
               
           }
                   
           
       
   } 
   public static void vectorDinamico02() {
   
  //vamos a solicitar al ususario el tamaño del vector
       int tam;
       System.out.println("Ingrese el tamaño de vector ");
       Scanner datos= new Scanner(System.in);
       tam= datos.nextInt();
       
       float notas[]=new float[tam];
       //recorremos para llenar 
       for (int i = 0; i < notas.length; i++) {
           System.out.println("Ingrese un número con decimales");
           notas[i]= datos.nextFloat();
           
       }
       //recorremos para leer
       System.out.println("ciclo para mostrar");
       for (int i = 0; i < notas.length; i++) {
           System.out.println("El valor ingresado es la posición"+ (i+1) + "es:" + notas[i]);
           
           
       }
               
} // fin del vector dinamico 2
      
public static void MatrizEstatica(){
    int filas, columnas;
    int numeros[][]= new int[3][2];
    Scanner datos= new Scanner(System.in);
    
    for (int i = 0; i < numeros.length; i++) { // recorro las filas 
        for (int j = 0; j < numeros[1].length; j++) { //recorro las columnas 
            System.out.println("Fila" + (i+1) + "Columna" + (j+1));
            numeros[i] [j]= datos.nextInt(); 
            
            
            
        }
     
    }//fin de matriz estatica 
}
    public static void matrizDinmica(){ 
        
        Scanner datos= new Scanner(System.in);
                
          System.out.println("Ingrese la cantidad de filas que desea ");
          int filas= datos.nextInt();
          
          System.out.println("Ingrese la cantidad de columnas que desea");
          int columnas= datos.nextInt();
          
          int[][] matriz=new int [filas][columnas];
          System.out.println("Su matriz tiene" + filas + "filas y"+ columnas + "columnas ");
          System.out.println("Empezamos a guardar los"+(filas*columnas)+ "numeros.");
          //recorrer y guardar 
          for (int i = 0; i < matriz.length; i++) {
              for (int j = 0; j < matriz[1].length; j++) {
                  System.out.println("Ingrese el valor a guardar");
                  matriz[i][j]= datos.nextInt();
                  
              }
              }
          
            
        }

    private static void VectorEstatico() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

                  
                  
              
            
        
     

    
    
  

          

