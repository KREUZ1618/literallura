package com.api;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import jakarta.persistence.*;
import lombok.*;


@Repository
public interface RepositorioLibros extends JpaRepository<Libro, Long> {



}
