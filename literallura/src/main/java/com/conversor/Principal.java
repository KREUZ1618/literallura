package com.conversor;
import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        Busquedas busqueda = new Busquedas();

        
   while(true) {     
        System.out.println("Literallura");
        System.out.println("-------------------------\n");
        System.out.println("1 - Buscar libro por título");
        System.out.println("2 - listar libros registrados");
        System.out.println("3 - listar autores registrados");
        System.out.println("4 - listar autores vivos en un determinado año");
        System.out.println("5 - listar libros por idioma");
        System.out.println("6 - salir");
        
        
        var opcion = Integer.valueOf(lectura.nextLine());
       
       
        switch (opcion) {
        case 1:
        	busqueda.buscarPorTitulo();
            break;
        case 2:
         
            break;
        case 3:
        
            break;
        case 4:
       	    
           break;
        case 5:
       	  
           break;
        case 6:
       	
           break;
        case 7:
       	  
           break;    
       
        default:
            
    }
        
        try{
            
            
            
            
            
            
            
        } catch (NumberFormatException exc){
        	exc.printStackTrace();
            System.out.println("Divisa no encontrada "+exc.getMessage());
        } 
        
        
   }     
        
        
        
        
    
    }
}
