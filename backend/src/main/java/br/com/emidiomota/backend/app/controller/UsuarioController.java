package br.com.emidiomota.backend.app.controller;

import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.emidiomota.backend.app.dao.entidade.UsuarioEntidade;
import br.com.emidiomota.backend.facade.UsuarioFacade;

@RestController
@RequestMapping("/v1/usuario")
@CrossOrigin
public class UsuarioController {

    private UsuarioFacade usuarioFacade;

    public UsuarioController(UsuarioFacade usuarioFacade) {
        this.usuarioFacade = usuarioFacade;
    }

    @GetMapping("/{id}")
    public ResponseEntity<UsuarioEntidade> buscaUsuarioPorId(
            @PathVariable UUID id) {
        return ResponseEntity.status(HttpStatus.OK)
                .body(this.usuarioFacade.getId(id));
    }

    @PostMapping("")
    public ResponseEntity<Object> cadastraUsuario(
            @RequestBody UsuarioEntidade model) {
        return ResponseEntity.status(HttpStatus.OK).body(
                this.usuarioFacade.cadastraUsuario(model));
    }
    // CRIAR OS DTOS 
    // TESTAR A APLICAÇÃO


}
