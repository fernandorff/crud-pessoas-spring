package com.example.demo.service.pessoa;

import com.example.demo.model.Pessoa;
import com.example.demo.dto.response.PessoaResponse;
import com.example.demo.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.example.demo.mapper.PessoaMapper.toDto;

@Service
public class ObterPessoaPorIdService {

    @Autowired
    private PessoaRepository pessoaRepository;

    public PessoaResponse obter(Long id) {

        Pessoa pessoa = pessoaRepository.getReferenceById(id);

        return toDto(pessoa);
    }
}
