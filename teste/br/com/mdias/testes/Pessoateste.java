package br.com.mdias.testes;

import br.com.mdias.namesjunitteste.Pessoa;
import org.junit.Assert;
import org.junit.Test;
import java.util.List;


public class Pessoateste {

    @Test
    public void testelistaPessoas(){
        String pessoaSexo = "";
        List<Pessoa> pessoas = new Pessoa().listPessoas();
        for (Pessoa p : pessoas) {
            if (p.getSexo().equals("Femenino")){
               pessoaSexo = p.getSexo();
               System.out.println("Nome Pessoa do Sexo Femenino - "+p.getNome() + " ID: "+p.getId());
            }
        }
        Assert.assertEquals("Femenino", pessoaSexo);
    }
}
