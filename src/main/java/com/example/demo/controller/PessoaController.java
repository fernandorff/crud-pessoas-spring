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
    private ObterPessoaPorIdService obterPessoaPorIdService;

    @Autowired
    private AlterarPessoaService alterarPessoaService;

    @Autowired
    private RemoverPessoaService removerPessoaService;

    @PostMapping("pessoas")
    @ResponseStatus(HttpStatus.CREATED)
    public PessoaResponse incluir(@RequestBody PessoaRequest request) {
        return incluirPessoaService.incluir(request);
    }

    @GetMapping("pessoas")
    @ResponseStatus(HttpStatus.OK)
    public List<PessoaResponse> listar() {
        return listarPessoasService.listar();
    }

    @GetMapping("pessoas/{id}")
    @ResponseStatus(HttpStatus.OK)
    public PessoaResponse obterPorId(@PathVariable(value = "id") Long id) {
        return obterPessoaPorIdService.obter(id);
    }

    @PutMapping("pessoas/{id}")
    @ResponseStatus(HttpStatus.OK)
    public PessoaResponse alterar(@PathVariable(value = "id") Long id, @RequestBody PessoaRequest request) {
        return alterarPessoaService.alterar(id, request);
    }

    @DeleteMapping("pessoas/{id}")
    @ResponseStatus(HttpStatus.OK)
    public PessoaResponse remover(@PathVariable(value = "id") Long id) {
        return removerPessoaService.remover(id);
    }

}
