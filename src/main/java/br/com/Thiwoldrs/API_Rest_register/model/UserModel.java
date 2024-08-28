package br.com.Thiwoldrs.API_Rest_register.model;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "users")
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "idade")
    private Byte idade;

    @Column(name = "cpf" , unique = true)
    private String cpf;


    @Column(name = "brasileiro_nativo")
    private boolean brasileiro_nativo;


    public UUID getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Byte getIdade() {
        return idade;
    }

    public void setIdade(Byte idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public boolean isBrasileiro_nativo() {
        return brasileiro_nativo;
    }

    public void setBrasileiro_nativo(boolean brasileiro_nativo) {
        this.brasileiro_nativo = brasileiro_nativo;
    }





}
