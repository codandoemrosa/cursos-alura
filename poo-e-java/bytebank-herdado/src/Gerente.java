public class Gerente extends Funcionario { //caracteristicas somente do gerente + herança do funcionário com adcionais
    private int senha;

    public void setSenha(int senha){
    }

    public boolean autentica(int senha){
        if (this.senha == senha){
            return true;
        } else {
            return false;
        }
    }

    /*
      public double getBonificacao(){
        return this.salario();
    }
     */

}
