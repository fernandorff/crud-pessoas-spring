package com.example.demo.dto.response;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class PessoaResponse {

    private Long id;
    private String nome;
    private String cpf;
    private double salario;
}
