package com.example.demo.service;

import com.example.demo.domain.Pessoa;
import com.example.demo.dto.response.PessoaResponse;
import com.example.demo.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import static com.example.demo.mapper.PessoaMapper.toDto;


@Service
public class RemoverPessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    @Transactional
    public PessoaResponse remover(Long id) {

        Pessoa pessoa = pessoaRepository.getReferenceById(id);

        pessoaRepository.deleteById(id);

        return toDto(pessoa);
    }
}
