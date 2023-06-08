
package com.ejercicios.sesion7_8_9.repository;

import com.ejercicios.sesion7_8_9.entities.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LaptopRepository extends JpaRepository<Laptop, Long>{
    
}
