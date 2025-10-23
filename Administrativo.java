/**
 * b. Crie a classe... Administrativo.
 * Ela também herda de Assistente.
 */
public class Administrativo extends Assistente {

    /**
     * ...possuem um turno (dia ou noite) e um adicional noturno...
     */
    private String turno;
    private double adicionalNoturno;

    public Administrativo(String nome, Double salario, int numeroMatricula, String turno, double adicionalNoturno) {
        super(nome, salario, numeroMatricula);
        this.turno = turno;
        this.adicionalNoturno = adicionalNoturno;
    }

    public String getTurno() {
        return turno;
    }

    public double getAdicionalNoturno() {
        return adicionalNoturno;
    }
    @Override
    public double ganhoAnual() {
        double ganhoBase = super.ganhoAnual();

        if (this.turno.equalsIgnoreCase("noite")) {
            return ganhoBase + (this.adicionalNoturno * 12);
        } else {
            return ganhoBase;
        }
    }

    
    @Override
    public void exibaDados() {
        System.err.println("O Funcionario ' " + getNome() + " ' Tem a matricula " + getNumeroMatricula());
        System.err.println("Ganha por mês (base): " + getSalario());
        System.err.println("Turno: " + this.turno);
        if (this.turno.equalsIgnoreCase("noite")) {
            System.err.println("Adicional Noturno: " + this.adicionalNoturno);
        }
        System.err.println("E por ano (com adicional): " + this.ganhoAnual());
    }
}
