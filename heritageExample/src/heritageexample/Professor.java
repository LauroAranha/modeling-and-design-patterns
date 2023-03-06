/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heritageexample;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class Professor extends Pessoa {

    String formacao;
    int anosDeServico;

    void minhasInformacoes() {
        System.out.println("Meu nome é " + nome + " e sou um professor há " + anosDeServico);
    }

    void estouLecionando() {
        System.out.println("Eu leciono como " + formacao);
    }

}
