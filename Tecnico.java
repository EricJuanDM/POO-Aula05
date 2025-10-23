public class Tecnico extends Funcionario{
    private String areaTecnica;


    public Tecnico(String nome, double salario, int id, double bonus) {
        super(nome, salario);
        this.areaTecnica = areaTecnica;
    }


    public String getAreaTecnica() {
        return areaTecnica;
    }

    public void setAreaTecnica(String areaTecnica) {
        this.areaTecnica = areaTecnica;
    }

    @Override
    public void exibaDados(){
        System.err.println("O Funcionario ' " + getNome() + " ' Atua na area tecnica de " + areaTecnica + " Ganha por mês " + getSalario() + " E pro ano " + getSalario() * 12);
    }

}