package edu.cibertec.capitulo04matricula.dao.repository;

import edu.cibertec.capitulo04matricula.dao.entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Integer> {
    public UsuarioEntity findByUsuarioAndClave(String usuario, String clave);
}
