package Main;

import Model.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Bem vindo ao sistema acadêmico." + "\n" );

        Aluno aluno1 = new Aluno("Joãozinho", "Masculino", 18, "3° ano", 992559);
        Contato contatoAluno1 = new Contato(831246648,"joaozindorock@gmail.com" );
        aluno1.setContato(contatoAluno1);
        System.out.println(aluno1);
        aluno1.getContato();
        aluno1.matriculado();

        Professor professor = new Professor("Carlos", "Masculino", 30, "Ciência da Computação", 15,  new QuadroGiz());

        Contato contatoProfessor = new Contato(839816448, "professor1@gmail.com");
        professor.setContato(contatoProfessor);

        System.out.println(professor);
        professor.getContato();
        professor.contratado();


    }
}