package com.example.demo.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PessoaRequest {

    private String nome;
    private String cpf;
    private double salario;
}
