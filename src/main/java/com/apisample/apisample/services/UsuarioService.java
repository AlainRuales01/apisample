package com.apisample.apisample.services;

import com.apisample.apisample.repositories.UsuarioRepository;
import com.apisample.apisample.models.UsuarioModel;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    public ArrayList<UsuarioModel> getUsuarios(){
        return (ArrayList<UsuarioModel>) this.usuarioRepository.findAll();
    }

    public UsuarioModel saveUsuario(UsuarioModel usuario){
        return this.usuarioRepository.save(usuario);
    }
}
