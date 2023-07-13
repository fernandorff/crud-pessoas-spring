package com.example.demo.service;

import com.example.demo.domain.Pessoa;
import com.example.demo.dto.request.PessoaRequest;
import com.example.demo.dto.response.PessoaResponse;
import com.example.demo.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import static com.example.demo.mapper.PessoaMapper.toDto;

@Service
public class AlterarPessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    @Transactional
    public PessoaResponse alterar(Long id, PessoaRequest request) {

        Pessoa pessoa = pessoaRepository.getReferenceById(id);

        pessoa.alterar(request);

        pessoaRepository.save(pessoa);

        return toDto(pessoa);
    }
}
