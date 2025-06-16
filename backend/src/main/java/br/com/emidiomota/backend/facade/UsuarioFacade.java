package br.com.emidiomota.backend.facade;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import br.com.emidiomota.backend.app.dao.entidade.UsuarioEntidade;
import br.com.emidiomota.backend.app.dao.repositorio.UsuarioRepository;

@Service
public class UsuarioFacade {

    private final UsuarioRepository service;

    public UsuarioFacade(UsuarioRepository service) {
        this.service = service;
    }

    public List<UsuarioEntidade> getAll() {
        return service.findAll();
    }

    public UsuarioEntidade getId(UUID id) {
        return service.findById(id)
                      .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));
    }

    public UsuarioEntidade cadastraEntidadeUsuario(UsuarioEntidade model) {
        if (model.getNome() == null || model.getNome().trim().isEmpty()) {
            throw new IllegalArgumentException("Nome não informado");
        }

        if (model.getEmail() == null || model.getEmail().trim().isEmpty()) {
            throw new IllegalArgumentException("Email não informado");
        }

        if (model.getSenha() == null || model.getSenha().trim().isEmpty()) {
            throw new IllegalArgumentException("Senha não informada");
        }

        return service.save(model);
    }

      public Object cadastraUsuario(UsuarioEntidade model) {
        
        throw new UnsupportedOperationException("Unimplemented method 'cadastra'");
    }

  
}