
package projetobanco;

import javax.swing.JOptionPane;




public class ProjetoBanco {

    
    public static void main(String[] args) {
        
        Banco dados = new Banco();
        
       dados.setAgencia(Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da sua agencia: ")));
       dados.setNumConta(Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da sua conta: ")));
       dados.setSenha(JOptionPane.showInputDialog("Digite o numero da sua senha: "));
       
       dados.logar(dados.getAgencia(), dados.getNumConta(), dados.getSenha());
                  
    }
    
}
