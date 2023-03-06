/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heritageexample;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class Funcionario extends Pessoa {

    String cargo;
    String instituicao;

    void minhasInformacoes() {
        System.out.println("Meu nome é " + nome + " e sou um trabalho na institução " + instituicao);
    }

    void estouExercendo() {
        System.out.println("Eu trabalho como " + cargo);
    }
}
