package com.foro.entity;
import java.sql.Date;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "topicos")
@Getter @Setter @ToString @AllArgsConstructor @NoArgsConstructor
public class Libro  {
    
	
	@Id
    @Column(name="ID_LIBRO")
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="TITULO")
    private String titulo;

    @Column(name="AUTOR")
    private String autor;

    @Column(name="IDIOMA")
    private String idioma;
    
    @Column(name="FECHA_NACIMIENTO") 
    private Date fechaNacimiento;
    
    @Column(name="FECHA_FALLECIMIENTO")
    private String fechaFallecimiento;
    

}
