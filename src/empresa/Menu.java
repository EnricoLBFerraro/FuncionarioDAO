
package empresa;
import java.util.Scanner;
import java.util.ArrayList;

public class Menu {
        public static void AdicionaFuncionario(){
            Scanner input = new Scanner(System.in);
            FuncionarioDao dao = new FuncionarioDao();
            System.out.println("Informe os dados de um novo Funcionario: ");
            System.out.println("Num mat:");
            int nummat = input.nextInt();
            System.out.println("Nome:");
            String nome = input.next();
            System.out.println("Salario: ");
            Double salario = input.nextDouble();
            System.out.println("Sexo: ");
            String sexo = input.next();
            System.out.println("Ndepto: ");
            int ndepto = input.nextInt();
            System.out.println("Nsuper: ");
            int nsuper = input.nextInt();
            Funcionario func = new Funcionario(nummat, nome, salario, sexo, ndepto, nsuper);
            dao.adiciona(func);
    }
        public static void menuLista(){
            FuncionarioDao dao = new FuncionarioDao();
            ArrayList<Funcionario> listaFunc = dao.getLista();
            for (Funcionario func : listaFunc){
                System.out.println("Numat: " + func.getNumat() + " Nome: "+ func.getNome() + " Salario: " + func.getSalario() + " Sexo: " + func.getSexo() + " Numdpto: "+ func.getNdepto() + " Nsuper: " + func.getNsuper());
            }
            System.out.println("");
        }
        
        public static void mostraMenu(){
        int opc;
        Scanner input = new Scanner(System.in);
        System.out.println("Esolha uma opção: 1-Adicionar Funcionario/2-Ver lista de Funcionarios/3-Sair");
        opc = input.nextInt();

        
        while (opc != 3){
            switch(opc) {
                case 1:
                    AdicionaFuncionario();
                    System.out.println("Esolha uma opção: 1-Adicionar Funcionario/2-Ver lista de Funcionarios/3-Sair");
                    opc = input.nextInt();
                case 2:
                    menuLista();
                    System.out.println("Esolha uma opção: 1-Adicionar Funcionario/2-Ver lista de Funcionarios/3-Sair");
                    opc = input.nextInt();
            }
        }
        System.out.println("Fechando Menu.");
        }
        
}
