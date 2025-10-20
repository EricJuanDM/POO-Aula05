public class Assistente extends Funcionario{
    private int numeroMatricula;

    public Assistente(String nome, Double salario, int numeroMatricula) {
        super(nome, salario);
        this.numeroMatricula = numeroMatricula;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    @Override
    public void exibaDados(){
        System.err.println("O Funcionario ' " + getNome() + " ' Tem a matricula " + numeroMatricula + " Ganha por mês " + getSalario() + " E pro ano " + getSalario() * 12);
    }



    

    
}
