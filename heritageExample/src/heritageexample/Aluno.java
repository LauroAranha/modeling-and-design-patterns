/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heritageexample;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class Aluno extends Pessoa {

    String curso;
    String faculdade;

    void minhaInformacao() {
        System.err.println("Meu nome é " + nome + " e sou um aluno");
    }

    void estouEstudando() {
        System.out.println("Estudo " + curso + ", na faculdade " + faculdade);
    }
}
