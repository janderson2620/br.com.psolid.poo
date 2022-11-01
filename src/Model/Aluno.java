package Model;

import Interfaces.IMatriculado;

//soLid L
public class Aluno extends Pessoa implements IMatriculado {


    private String serie;
    private int matricula;
    private Contato contato;


    public Aluno(String nome, String genero, int idade, String serie, int matricula) {
        super(nome, genero, idade);
        this.nome = nome;
        this.genero = genero;
        this.idade = idade;
        this.serie = serie;
        this.matricula = matricula;

    }

    @Override
    public void matriculado() {
        System.out.println("O aluno está matriculado" + "\n");
    }

    @Override
    public void desmatriculado() {
        System.out.println("O aluno não está matriculado" + "\n");
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public  void setContato(Contato contato) {
        this.contato = contato;
    }
    public void getContato(){
        System.out.println("Contato do aluno: " + this.contato);

    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", idade=" + idade +
                ", serie='" + serie + '\'' +
                ", matricula=" + matricula +
                '}';
    }
}
