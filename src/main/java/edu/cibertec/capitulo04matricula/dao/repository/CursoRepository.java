package edu.cibertec.capitulo04matricula.dao.repository;

import edu.cibertec.capitulo04matricula.dao.entity.CursoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<CursoEntity, Integer> {
}
