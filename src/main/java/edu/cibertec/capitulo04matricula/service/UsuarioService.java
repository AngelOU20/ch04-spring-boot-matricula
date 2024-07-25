package edu.cibertec.capitulo04matricula.service;

import edu.cibertec.capitulo04matricula.dao.entity.UsuarioEntity;

public interface UsuarioService {
    public UsuarioEntity validarLogin(UsuarioEntity usuario);
}
