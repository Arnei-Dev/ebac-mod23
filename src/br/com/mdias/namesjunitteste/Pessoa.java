package br.com.mdias.namesjunitteste;

import java.util.List;
import java.util.Objects;

public class Pessoa {
    private Long id;
    private String nome;
    private String sexo;
    private Integer idade;

    public Pessoa(){}
    private Pessoa(Long id, String nome, String sexo, Integer idade){
         this.id = id;
         this.nome = nome;
         this.sexo = sexo;
         this.idade = idade;
    }
    //Método para chamada
    public List<Pessoa> listPessoas(){
        Pessoa pessoa1 = new Pessoa(1L, "Bruna", "Femenino", 28);
        Pessoa pessoa2 = new Pessoa(2L, "Alex", "Masculino", 16);
        Pessoa pessoa3 = new Pessoa(3L, "Marco", "Masculino", 23);
        Pessoa pessoa4 = new Pessoa(4L, "Breno", "Masculino", 55);
        Pessoa pessoa5 = new Pessoa(5L, "Joana", "Femenino", 21);
        Pessoa pessoa6 = new Pessoa(6L, "Iris", "Femenino", 22);
        Pessoa pessoa7 = new Pessoa(7L, "Jenny", "Femenino", 28);
        return List.of(pessoa1,pessoa2,pessoa3,pessoa4,pessoa5,pessoa6,pessoa7);
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }

    public Integer getIdade() {
        return idade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(id, pessoa.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", sexo='" + sexo + '\'' +
                ", idade=" + idade +
                '}';
    }
}
