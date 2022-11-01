package Model;

import Interfaces.IEnsinando;
import Interfaces.IQuadro;

//soLid L

public class Professor extends Pessoa implements IEnsinando, IQuadro {
    String formacao;
    int anosDeServicos;
    Contato contato;

    public final IQuadro quadro;


    public Professor(String nome, String genero, int idade, String formacao, int anosDeServicos, IQuadro quadro) {
        super(nome, genero, idade);
        this.formacao = formacao;
        this.anosDeServicos = anosDeServicos;
        this.quadro = quadro;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    public void getContato() {

        System.out.println("Contato do professor: " + this.contato);

    }

    public String trabalhaCom(IQuadro quadro) {
        this.quadro.trabalhaCom();
        return null;
    }




    @Override
    public String toString() {
        return "Professor{" +
                "Nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", idade=" + idade +
                ", formacao='" + formacao + '\'' +
                ", anosDeServicos=" + anosDeServicos +
                ", quadro=" + quadro +
                '}';
    }

    @Override
    public String trabalhaCom() {
        return null;
    }

    public void setQuadro() {
    }

    @Override
    public void contratado() {
        System.out.println("O professor está trabalhando.");
    }

    @Override
    public void demitido() {
        System.out.println("O professor não está trabalhando.");
    }
}