package com.example.demo.service.pessoa;

import com.example.demo.dto.request.PessoaRequest;
import com.example.demo.dto.response.PessoaResponse;
import com.example.demo.mapper.PessoaMapper;
import com.example.demo.model.Pessoa;
import com.example.demo.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AlterarPessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    @Transactional
    public PessoaResponse alterarPessoaPorId(Long id, PessoaRequest request) {

        Pessoa pessoa = pessoaRepository.getById(id);

        pessoa.alterarEssaPessoa(request);

        pessoaRepository.save(pessoa);

        return PessoaMapper.transformarModelEmResponse(pessoa);
    }
}
