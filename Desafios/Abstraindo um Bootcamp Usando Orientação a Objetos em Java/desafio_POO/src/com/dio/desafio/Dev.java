package com.dio.desafio;

import java.util.*;


public class Dev {
    public void InscreverBootcamp(Bootcamp bootcamp){
        this.conteudoInscritos.addAll(bootcamp.getConteudo());
        bootcamp.getDevsInscritos().add(this);

    }

    public void progredir(){

        Optional<Conteudo> conteudo = this.conteudoInscritos.stream().findFirst();

        if (conteudo.isPresent()){
            this.conteudoConcluido.add(conteudo.get());
            this.conteudoInscritos.remove((conteudo.get()));
        }else {
            System.err.println("Você nao esta matriculado em nenhum conteudo! ");
        }
    }


    public double CalcularTotalXp(){
        return this.conteudoConcluido.stream().mapToDouble(Conteudo:: calcularXp).sum();
    }
    private String nome;
    private int Idade;
    private Set<Conteudo> conteudoInscritos= new LinkedHashSet<>();
    private  Set<Conteudo> conteudoConcluido = new LinkedHashSet<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int idade) {
        Idade = idade;
    }

    public Set<Conteudo> getConteudoInscritos() {
        return conteudoInscritos;
    }

    public void setConteudoInscritos(Set<Conteudo> conteudoInscritos) {
        this.conteudoInscritos = conteudoInscritos;
    }

    public Set<Conteudo> getConteudoConcluido() {
        return conteudoConcluido;
    }

    public void setConteudoConcluido(Set<Conteudo> conteudoConcluido) {
        this.conteudoConcluido = conteudoConcluido;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudoInscritos, dev.conteudoInscritos) && Objects.equals(conteudoConcluido, dev.conteudoConcluido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudoInscritos, conteudoConcluido);
    }
}

