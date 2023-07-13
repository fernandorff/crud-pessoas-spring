package com.example.demo.dto.response;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PessoaResponse {

    private Long id;
    private String nome;
    private String cpf;
    private double salario;
}
