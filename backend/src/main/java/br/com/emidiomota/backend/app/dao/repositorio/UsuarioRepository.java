package br.com.emidiomota.backend.app.dao.repositorio;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.emidiomota.backend.app.dao.entidade.UsuarioEntidade;

public interface UsuarioRepository extends JpaRepository<UsuarioEntidade, UUID> {

    // Aqui você pode adicionar métodos personalizados de consulta, se necessário.
    // Por exemplo:
    // Optional<Usuario> findByEmail(String email);

    
}