package br.com.emidiomota.backend.app.shared.dto;

import lombok.Data;

@Data
public class UsuarioDTO {

    private String id;
    private String nome;
    private String email;
    private String senha;
}
