package com.nelioalves.cursomc.dto;

import com.nelioalves.cursomc.domain.Categoria;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

public class CategoriaDTO implements Serializable {
    private static final long serivalVersionUID = 1L;

    private Integer id;

    @NotEmpty(message="Preenchimento obrigatório")
    @Length(min=5, max=80, message="O Tamanho deve ser entre 5 e 80 caracteres")
    private String nome;

    public CategoriaDTO() {

    }

    public CategoriaDTO(Categoria obj) {
        this.id = obj.getId();
        this.nome = obj.getNome();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
