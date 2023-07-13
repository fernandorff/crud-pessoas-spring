package com.example.demo.domain;

import com.example.demo.dto.request.PessoaRequest;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(of = "id")
@EqualsAndHashCode(of = "id")
@Entity
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nome;

    private String cpf;

    private double salario;

    public void alterar(PessoaRequest request) {
        this.nome = request.getNome();
        this.cpf = request.getCpf();
        this.salario = request.getSalario();
    }
}
