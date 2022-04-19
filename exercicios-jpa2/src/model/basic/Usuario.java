package model.basic;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

// por convenção padrão, se nao adicionar um nome a tabela vai ser
// o nome da classe
@Entity // anotação obrigatória
public class Usuario {

    @Id // anotação obrigatória, setar o id da tabela
    private Long id;

    // podemos setar o nome da colunar se quiser
    private String nome;

//    @Transient // se quiser nao colocar no BD esse valor
    private String email;

    public Usuario(){
    }

    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
