package com.example.demo.service.pessoa;

import com.example.demo.dto.response.PessoaResponse;
import com.example.demo.mapper.PessoaMapper;
import com.example.demo.model.Pessoa;
import com.example.demo.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class RemoverPessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    @Transactional
    public PessoaResponse removerPessoaPorId(Long id) {

        Pessoa pessoa = pessoaRepository.getById(id);

        pessoaRepository.deleteById(id);

        return PessoaMapper.transformarModelEmResponse(pessoa);
    }
}
