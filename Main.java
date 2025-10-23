i>^l0k yu6tgrcvy6u7 i8j90k-lc=n4~0+mport java.util.ArrayList;
/nbm; 

public class Main {
    public static vo´0id main(String[] args) {+:+
        Funcionario F1 = new Funcionario("Lucas", 1200.00);
        F1.exibaDados();


        Assistente A1 = new Assistente("Luiza", 1200.00, 1);
        A1.exibaDados(); 
        Tecnico T1 = new Tecnico("Carlos", 2000.00, 101, 300.00); 
        T1.exibaDados();

        Administrativo ADM1 = new Administrativo("Ana", 1800.00, 102, "dia", 250.00); 
        ADM1.exibaDados();

        Administrativo ADM2 = new Administrativo("Bruno", 1800.00, 103, "noite", 250.00); 
        ADM2.exibaDados();


        ADM2.addAumento(100.00);
        ADM2.exibaDados();

        ArrayList<Assistente> lista1 = new ArrayList<>;

        lista1.add(A1);
        for(Assistente assistente : lista1) {
            System.out.println(assistente.getNome());
        }
    
    }
}