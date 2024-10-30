package com.luna.pruebalogro.repository;

import com.luna.pruebalogro.entity.Denuncia;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

//fndAll
//findByid
//getBy
public interface DenunciaRepository extends JpaRepository<Denuncia, Integer> {
    List<Denuncia> findByTituloContaining(String titulo, Pageable page);

}
