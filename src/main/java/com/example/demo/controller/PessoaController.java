package com.example.demo.controller;

import com.example.demo.dto.request.PessoaRequest;
import com.example.demo.dto.response.PessoaResponse;
import com.example.demo.service.pessoa.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class PessoaController {

    @Autowired
    private IncluirPessoaService incluirPessoaService;

    @Autowired
    private ListarPessoasService listarPessoasService;

    @Autowired
    private ObterPessoaService obterPessoaService;

    @Autowired
    private AlterarPessoaService alterarPessoaService;

    @Autowired
    private RemoverPessoaService removerPessoaService;

    @PostMapping("pessoas")
    @ResponseStatus(HttpStatus.CREATED)
    public PessoaResponse endpointIncluirPessoa(@RequestBody PessoaRequest request) {
        return incluirPessoaService.incluirPessoa(request);
    }

    @GetMapping("pessoas")
    @ResponseStatus(HttpStatus.OK)
    public List<PessoaResponse> endpointListarPessoas() {
        return listarPessoasService.listarPessoas();
    }

    @GetMapping("pessoas/{id}")
    @ResponseStatus(HttpStatus.OK)
    public PessoaResponse endpointObterPessoaPorId(@PathVariable(value = "id") Long id) {
        return obterPessoaService.obterPessoaPorId(id);
    }

    @GetMapping("pessoas/nome/{nome}")
    @ResponseStatus(HttpStatus.OK)
    public List<PessoaResponse> endpointListarPessoaPorNome(@PathVariable(value = "nome") String nome) {
        return listarPessoasService.listarPessoasPorNome(nome);
    }

    @PutMapping("pessoas/{id}")
    @ResponseStatus(HttpStatus.OK)
    public PessoaResponse endpointAlterarPessoa(@PathVariable(value = "id") Long id, @RequestBody PessoaRequest request) {
        return alterarPessoaService.alterarPessoaPorId(id, request);
    }

    @DeleteMapping("pessoas/{id}")
    @ResponseStatus(HttpStatus.OK)
    public PessoaResponse endpointRemoverPessoa(@PathVariable(value = "id") Long id) {
        return removerPessoaService.removerPessoaPorId(id);
    }

}
