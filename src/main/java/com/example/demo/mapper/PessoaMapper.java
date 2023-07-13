package com.example.demo.mapper;

import com.example.demo.domain.Pessoa;
import com.example.demo.dto.request.PessoaRequest;
import com.example.demo.dto.response.PessoaResponse;

public class PessoaMapper {

    public static Pessoa toEntity(PessoaRequest request) {
        Pessoa entity = new Pessoa();
        entity.setNome(request.getNome());
        entity.setCpf(request.getCpf());
        entity.setSalario(request.getSalario());
        return entity;
    }

    public static PessoaResponse toDto(Pessoa entity) {
        PessoaResponse response = new PessoaResponse();
        response.setId(entity.getId());
        response.setNome(entity.getNome());
        response.setCpf(entity.getCpf());
        response.setSalario(entity.getSalario());
        return response;
    }
}
