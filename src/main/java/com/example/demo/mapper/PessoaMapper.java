package com.example.demo.mapper;

import com.example.demo.dto.request.PessoaRequest;
import com.example.demo.dto.response.PessoaResponse;
import com.example.demo.model.Pessoa;

public class PessoaMapper {

    public static Pessoa transformarRequestEmModel(PessoaRequest request) {
        Pessoa model = new Pessoa();
        model.setNome(request.getNome());
        model.setCpf(request.getCpf());
        model.setSalario(request.getSalario());
        return model;
    }

    public static PessoaResponse transformarModelEmResponse(Pessoa entity) {
        PessoaResponse response = new PessoaResponse();
        response.setId(entity.getId());
        response.setNome(entity.getNome());
        response.setCpf(entity.getCpf());
        response.setSalario(entity.getSalario());
        return response;
    }
}
