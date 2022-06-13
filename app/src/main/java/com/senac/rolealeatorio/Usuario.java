package com.senac.rolealeatorio;

import java.util.Date;

public class Usuario {
    String nome;
    String sobrenome;
    String email;
    Date dataNacismento;
    String senha;
    String  CPF;

    @Override
    public String toString() {
        return "Usuario{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                ", CPF='" + CPF + '\'' +
                '}';
    }
}
