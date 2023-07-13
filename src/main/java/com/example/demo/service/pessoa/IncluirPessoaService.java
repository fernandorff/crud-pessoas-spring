package com.example.demo.service.pessoa;

import com.example.demo.model.Pessoa;
import com.example.demo.dto.request.PessoaRequest;
import com.example.demo.dto.response.PessoaResponse;
import com.example.demo.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import static com.example.demo.mapper.PessoaMapper.toDto;
import static com.example.demo.mapper.PessoaMapper.toEntity;

@Service
public class IncluirPessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    @Transactional
    public PessoaResponse incluir(PessoaRequest request) {

        Pessoa pessoa = toEntity(request);

        pessoaRepository.save(pessoa);

        return toDto(pessoa);
    }
}
