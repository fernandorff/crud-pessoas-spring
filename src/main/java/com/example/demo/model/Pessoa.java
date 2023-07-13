package com.example.demo.model;

import com.example.demo.dto.request.PessoaRequest;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(of = "id")
@EqualsAndHashCode(of = "id")
@Entity
@Table(name = "pessoa")
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nome;

    private String cpf;

    private double salario;

    public void alterarEssaPessoa(PessoaRequest request) {
        this.nome = request.getNome();
        this.cpf = request.getCpf();
        this.salario = request.getSalario();
    }
}
