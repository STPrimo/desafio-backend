package com.tiago.desafio.Entity.Endereco;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CepResultDTO{
    private String cep;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String localidade;
    private String uf;
    private String ibge;
    private String gia;
    private String ddd;
    private String siafi; 
    private boolean erro;
    private EstadoInfo estado_info;
    private CidadeInfo cidade_info;
}


