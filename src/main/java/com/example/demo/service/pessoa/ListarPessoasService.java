package com.example.demo.service.pessoa;

import com.example.demo.dto.response.PessoaResponse;
import com.example.demo.mapper.PessoaMapper;
import com.example.demo.model.Pessoa;
import com.example.demo.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ListarPessoasService {

    @Autowired
    private PessoaRepository pessoaRepository;

    public List<PessoaResponse> listarPessoas() {

        List<PessoaResponse> pessoasList = new ArrayList<>();
        for (Pessoa pessoa : pessoaRepository.findAll()) {
            PessoaResponse response = PessoaMapper.transformarModelEmResponse(pessoa);
            pessoasList.add(response);
        }
        return pessoasList;
    }

    public List<PessoaResponse> listarPessoasPorNome(String nome) {

        List<PessoaResponse> pessoasList = new ArrayList<>();
        for (Pessoa pessoa : pessoaRepository.findAllByNome(nome)) {
            PessoaResponse response = PessoaMapper.transformarModelEmResponse(pessoa);
            pessoasList.add(response);
        }
        return pessoasList;
    }
}
