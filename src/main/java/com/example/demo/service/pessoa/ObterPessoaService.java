package com.example.demo.service.pessoa;

import com.example.demo.dto.response.PessoaResponse;
import com.example.demo.mapper.PessoaMapper;
import com.example.demo.model.Pessoa;
import com.example.demo.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ObterPessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    public PessoaResponse obterPessoaPorId(Long id) {

        Pessoa pessoa = pessoaRepository.getById(id);

        return PessoaMapper.transformarModelEmResponse(pessoa);
    }
}
