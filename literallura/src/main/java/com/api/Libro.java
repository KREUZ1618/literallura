package com.api;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "libros")
@Getter @Setter @ToString @AllArgsConstructor @NoArgsConstructor
public class Libro  {
    
	
	@Id
    @Column(name="ID_LIBRO")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="TITULO")
    private String titulo;

    @Column(name="AUTOR")
    private String autor;

    @Column(name="IDIOMA")
    private String idioma;
    
    @Column(name="FECHA_NACIMIENTO") 
    private int fechaNacimiento;
    
    @Column(name="FECHA_FALLECIMIENTO")
    private int fechaFallecimiento;
    

}
