package com.apisample.apisample.controllers;

import com.apisample.apisample.services.UsuarioService;
import com.apisample.apisample.models.UsuarioModel;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
public class UsuarioController{
    @Autowired
    private UsuarioService usuarioService;


    @GetMapping()
    public ArrayList<UsuarioModel> getUsuarios(){
        return this.usuarioService.getUsuarios();
    }

    @PostMapping()
    public UsuarioModel saveUsuario(@RequestBody UsuarioModel usuario){
        return this.usuarioService.saveUsuario(usuario);
    }
}