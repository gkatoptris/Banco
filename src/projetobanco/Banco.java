
package projetobanco;

import javax.swing.JOptionPane;


public class Banco {
  public int numConta;
  public int agencia;
  public String nome;
  private String senha;
  private double saldo;
  private boolean logado = false;

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isLogado() {
        return logado;
    }

    public void setLogado(boolean logado) {
        this.logado = logado;
    }
  
    public boolean logar(int agencia, int numConta, String senha){
            
            if (agencia== 1234 && numConta == 1 && "abc123".equals(senha)){
                this.logado=true;
                //System.out.println("VOCE ESTA LOGADO!");
                //System.out.println("Valor da variavel logado: "+ this.isLogado());
                atual(this.logado);
            }else{
                JOptionPane.showMessageDialog(null, "Dados incorretos!");
                this.logado = false;
            }
            return this.logado;
            
        }
    
    public void sacar(double valor, boolean logado){
        this.saldo= this.saldo - valor;
        String opcao;
        opcao= JOptionPane.showInputDialog("Deseja realizar outra operação?\n"
                + "S- sim\n"
                + "N- nao");
        
        switch(opcao){
            case "S":
                atual(this.logado);
                break; 
            case "N":
                JOptionPane.showMessageDialog(null, "OBRIGADA E VOLTE SEMPRE!");
                System.exit(0);
                break;
            default:
                JOptionPane.showMessageDialog(null, "OPCAO INVALIDA!!!!");
        }
        
        
    }
    
    public void depositar(double valor, boolean logado){
        this.saldo =this.saldo + valor;
        String opcao;
        
        opcao= JOptionPane.showInputDialog("DESEJA OUTRA OPERAÇÃO?\n"
                + "S- SIM\n"
                + "N- NAO");
        switch(opcao){
            case "S":
                atual(this.logado);
                break; 
            case "N":
                JOptionPane.showMessageDialog(null, "OBRIGADA E VOLTE SEMPRE!");
                System.exit(0);
                break;
            default:
                JOptionPane.showMessageDialog(null, "OPCAO INVALIDA!!!!");
        }
        
    }
    
    public void consultarSaldo(boolean logado){
        
        JOptionPane.showMessageDialog(null,"Saldo atual: "+ "R$ " + getSaldo());
        String opcao;
        opcao= JOptionPane.showInputDialog("Deseja realizar outra operação?\n"
                + "S- sim\n"
                + "N- nao");
        
        switch(opcao){
            case "S":
                atual(this.logado);
                break; 
            case "N":
                JOptionPane.showMessageDialog(null, "OBRIGADA E VOLTE SEMPRE!");
                System.exit(0);
                break;
            default:
                JOptionPane.showMessageDialog(null, "OPCAO INVALIDA!!!!");
        }
        
        
        
        
        
    }
    
    public void atual(boolean logado){
        if(logado==true){
            int opcao;
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite: \n"
                    + "1- Deposito\n"
                    + "2- Saque\n"
                    + "3- Consulta de Saldo\n"
                    + "4- Sair"));
            switch(opcao){
                case 1: 
                    depositar(Double.parseDouble(JOptionPane.showInputDialog("DIGITE O VALOR A SER DEPOSITADO")), this.logado);
                    break;
                case 2:
                    sacar(Double.parseDouble(JOptionPane.showInputDialog("DIGITE O VALOR A SER SACADO")), this.logado);
                    break;
                case 3:
                    consultarSaldo(this.logado);
                    break;
                case 4: 
                    JOptionPane.showMessageDialog(null, "OBRIGADA E VOLTE SEMPRE!!!");
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"OPÇÃO INVALIDA!!");
                    
            }
        }
    }
    
    
    
    
}
