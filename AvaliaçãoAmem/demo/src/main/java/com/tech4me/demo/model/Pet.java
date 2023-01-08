package com.tech4me.demo.model;

import java.util.List;

import org.springframework.data.annotation.Id;

public class Pet {
    

 private String id;
 private String raca;
 private String nome;
 private int anoNascimento;
 private boolean vacinado;
 private List<String> procedimentos;
 
 @Id
 public String getId() {
    return id;
}
public void setId(String id) {
    this.id = id;
}
public String getRaca() {
    return raca;
}
public void setRaca(String raca) {
    this.raca = raca;
}
public String getNome() {
    return nome;
}
public void setNome(String nome) {
    this.nome = nome;
}
public int getAnoNascimento() {
    return anoNascimento;
}
public void setAnoNascimento(int anoNascimento) {
    this.anoNascimento = anoNascimento;
}
public boolean isVacinado() {
    return vacinado;
}
public void setVacinado(boolean vacinado) {
    this.vacinado = vacinado;
}
public List<String> getProcedimentos() {
    return procedimentos;
}
public void setProcedimentos(List<String> procedimentos) {
    this.procedimentos = procedimentos;
} 
}













