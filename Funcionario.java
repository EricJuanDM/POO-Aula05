public class Funcionario{
    private String Nome;
    private Double Salario;

    public Funcionario(String nome, Double salario) {
        this.Nome = nome;
        this.Salario = salario;
    }

    public double addAumento(double valor){
        return this.Salario = Salario + valor;
    }

    public double ganhoAnual(double ganhoAnual){
        return ganhoAnual = Salario *12;
    }
    
    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public Double getSalario() {
        return Salario;
    }

    public void setSalario(Double salario) {
        Salario = salario;
    }

    public void exibaDados(){
        System.err.println("O Funcionario '" + Nome + "' Ganha por mês " + Salario + " E pro ano " + Salario * 12);
    }

    public double ganhoAnual() {
        
        throw new UnsupportedOperationException("Unimplemented method 'ganhoAnual'");
    }
}