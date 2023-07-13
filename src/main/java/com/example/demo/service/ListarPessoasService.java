package com.example.demo.service;

import com.example.demo.dto.response.PessoaResponse;
import com.example.demo.mapper.PessoaMapper;
import com.example.demo.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ListarPessoasService {

    @Autowired
    private PessoaRepository pessoaRepository;

    public List<PessoaResponse> listar() {

        return pessoaRepository.findAll().stream()
                .map(PessoaMapper::toDto)
                .collect(Collectors.toList());
    }
}
