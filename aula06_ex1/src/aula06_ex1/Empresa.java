package aula06_ex1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Empresa {
    private Pessoa[] listaFuncionarios;
    private PessoaView viewP;
    private int numeroFuncionario = 0;
    
    public class InserirListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            String nome = viewP.getNome();
            int idade = viewP.getIdade();
            double salario = viewP.getSalario();
            String cargo = viewP.getCargo();
            Funcionario f = new Funcionario(salario, cargo, nome, idade);
            listaFuncionarios[numeroFuncionario] = f;
            numeroFuncionario++;
        }
        
    }
    
    public class SalvarListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            for(int j=0;j<numeroFuncionario;j++){
                listaFuncionarios [j].salvar();
            }
        }
        
    }
    
    public Empresa() {
        listaFuncionarios = new Funcionario[100];    
        viewP = new PessoaView();
        viewP.setListenerInserir(new InserirListener());
        viewP.setListenerSalvar(new SalvarListener());
    }
    
    public void iniciarEmpresa(){
        viewP.setVisible(true);
    }
    
    
}


