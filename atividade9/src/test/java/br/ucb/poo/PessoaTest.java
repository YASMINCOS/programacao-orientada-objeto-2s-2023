package br.ucb.poo;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PessoaTest {
    
    Pessoa pessoa;

    @BeforeEach
    public void setup(){
        this.pessoa = new Pessoa();
    }

    @Test
    public void dizerOlaTest(){
        assertEquals("Ola, maven!", pessoa.dizerOla()); 
    }
}
