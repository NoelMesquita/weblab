package com.emanuelcmesquita.dev.domain;
//FIXME Incluir anotações do JPA , sem isso o projeto falha.
public class Produto {

    private Long id;
    private String nome;
    private String descricao;
    private Double preco;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescriao() {
        return descricao;
    }

    public void setDescriao(String descriao) {
        this.descricao = descriao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }




}
