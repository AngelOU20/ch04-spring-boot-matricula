package edu.cibertec.capitulo04matricula.service.impl;

import edu.cibertec.capitulo04matricula.dao.entity.UsuarioEntity;
import edu.cibertec.capitulo04matricula.dao.repository.UsuarioRepository;
import edu.cibertec.capitulo04matricula.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public UsuarioEntity validarLogin(UsuarioEntity usuario) {
        UsuarioEntity rpt =
                usuarioRepository.findByUsuarioAndClave(usuario.getUsuario(),
                        usuario.getClave());

        return rpt;

    }
}
