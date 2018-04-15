/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula06_ex1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alunoti
 */
public class Funcionario extends Pessoa {
    private double salario;
    private String cargo;
    

    public Funcionario(double salario, String cargo, String nomePessoa, int idade) {
        super(nomePessoa, idade);
        this.salario = salario;
        this.cargo = cargo;
    }
    public void salvar(){
        
        FileWriter fw;
        try {
            fw = new FileWriter(nomeArq, true);       
            fw.write("Nome: "+ this.nomePessoa + 
                " Idade: " + this.idade +
                "\r\n");
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(Funcionario.class.getName()).log(Level.SEVERE, null, ex);
        }

        
    } 
}  

