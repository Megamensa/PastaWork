package Program;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Entities.Empregados;
import Entities.FuncionariosTerceirizados;

public class PagamentoFucnionarios {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        List<Empregados> list = new ArrayList<>();


        System.out.print("Entre com número de funcionários: ");
        int n = sc.nextInt();
        for (int i=1; i<=n; i++) {
            System.out.println("Empregados # " + i + " dados: ");
            System.out.print("Funcionário terceirizado? (y/n) ");
            char ch = sc.next().charAt(0);
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Horas: ");
            int horas = sc.nextInt();
            System.out.print("Valor por hora: ");
            double valorPorHora = sc.nextDouble();
            if ( ch == 'y') {
                System.out.print("Adicional terceirizado: ");
                double adicional = sc.nextDouble();

                Empregados emp = new FuncionariosTerceirizados(nome, horas, valorPorHora, adicional);
                list.add(emp);
            }
            else {
                list.add(new Empregados(nome, horas, valorPorHora));
            }
                // duas maneiras diferentes de instanciar... se mover as informações do emp
                // para dentro do list.add(), a variavel emp é desnecessária.

        }

           System.out.println();  
           System.out.println("Pagamentos: ");
           for (Empregados emp : list) {
                System.out.println(emp.getNome() + " - $ " + String.format("%.2f", emp.pagamento()));

           }







        sc.close();
    }
}
