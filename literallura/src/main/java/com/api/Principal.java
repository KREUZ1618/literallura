package com.api;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Scanner;

import com.api.Results.Book;
import com.google.gson.Gson;





public class Principal {
	
	 private RepositorioLibros repositorioLibros;




	public Principal(RepositorioLibros repositorioLibros) {
	        this.repositorioLibros = repositorioLibros;
	    }

	
	
	
    public void mostrarMenu() {
        Scanner lectura = new Scanner(System.in);
       
       
      
        
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

        	Scanner scan = new Scanner(System.in);
        	System.out.println("Introduza el nombre del libro");
        	
        	var nombre = scan.nextLine();
        	
            URI direccion = URI.create("https://gutendex.com/books/?search="+nombre);

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(direccion)
                    .build();

            try {
            	
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());
                
                
                Results results= new Gson().fromJson(response.body(), Results.class);  
                System.out.println(results.getCount());  
                System.out.println(response.body()); 

                results.getResults();
                
                for (Book element :  results.getResults()) {
                	
                	
                	
                	Libro libro= new Libro();
                	
                	libro.setAutor(element.getAuthors().get(0).getName());
                	libro.setTitulo(element.getTitle());
                	libro.setIdioma(element.getLanguages().get(0).toString());
                    libro.setFechaFallecimiento(element.getAuthors().get(0).getDeath_year());   	
                   	libro.setFechaNacimiento(element.getAuthors().get(0).getBirth_year());
                  
                    repositorioLibros.save(libro);
                    
                   
                }
        
               
            } catch (Exception exc) {
            	exc.printStackTrace();
                throw new RuntimeException("Error al buscar el autor");
            }
            break;
        case 2:
        	 List<Libro> list= repositorioLibros.findAll();
        	 
        	 for (Libro element :  list) {
        		 System.out.println(element.getAutor());
        		 System.out.println(element.getTitulo());
        		 System.out.println("-------------------------");
        	 }
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
        
      
        
        
   }     
        
        
        
        
    
    }
}
