package com.conversor;


import com.conversor.Results.Book;
import com.google.gson.Gson;

import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;



public class Busquedas {
	
	
    public void buscarPorTitulo(){
    	
    	Scanner lectura = new Scanner(System.in);
    	System.out.println("Introduza el nombre del autor");
    	
    	var nombre = lectura.nextLine();
    	
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
                element.getAuthors().get(0);
            }
    
           
        } catch (Exception exc) {
        	exc.printStackTrace();
            throw new RuntimeException("Error al buscar el autor");
        }
    }
    
    
public void buscarPorAutor(){
    	
    	Scanner lectura = new Scanner(System.in);
    	System.out.println("Introduza el nombre del autor");
    	
    	var nombre = lectura.nextLine();
    	
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

        
    
           
        } catch (Exception exc) {
        	exc.printStackTrace();
            throw new RuntimeException("Error al buscar el autor");
        }
    }
}