package br.com.emidiomota.backend.app.dao.entidade;

import br.com.emidiomota.backend.app.shared.entidade.BaseEntidade;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "usuario")
public class UsuarioEntidade extends BaseEntidade {

    @Getter @Setter
    private String nome;

    @Getter @Setter
    private String email;

    @Getter @Setter
    private String senha;

   

  

  

}
