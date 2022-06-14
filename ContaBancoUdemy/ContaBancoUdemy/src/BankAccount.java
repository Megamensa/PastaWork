public class BankAccount {
    public static void main(String[] args) throws Exception {

        Account acc8 = new Account(9090, "Alex", 1000.0);
        acc8.withdrawSaque(200.0);
        System.out.println(acc8.getBalanceSaldo());

        Account acc9 = new SavingsAccountPoup(1010, "Maria", 1000.0, 0.01);
        acc9.withdrawSaque(200.0);
        System.out.println(acc9.getBalanceSaldo());

        Account acc11 = new BusinessAccount(1111, "Bob", 1000.0, 500.0);
        acc11.withdrawSaque(200.0);
        System.out.println(acc11.getBalanceSaldo());





        /*Account acc = new Account(1234, "Zezinho", 0.0);
        BusinessAccount bacc = new BusinessAccount(9876, "Zézão", 0.0, 500.0);

        //upcasting = casting da subclasse para superclasse

        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1235, "Zezinho2", 0.0, 200.0);
        Account acc3 = new SavingsAccountPoup(5566, "Anna", 0.0, 0.01);


        //downcasting = casting da superclasse para subclasse
        BusinessAccount acc4 = (BusinessAccount)acc2;
        acc4.loanDeposita(100.0);

        // BusinessAccount acc5 = (BusinessAccount)acc3; dará erro de excessão
        //a account acc3 foi instanciada como SavingsAccountPoup, que é uma Account...
        // mas não é uma BusinessAccount

        if (acc3 instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount)acc3;
            acc5.loanDeposita(200.0);
            System.out.println("Emprestou");
        }

        if (acc3 instanceof SavingsAccountPoup) {
            SavingsAccountPoup acc5 = (SavingsAccountPoup)acc3;
            acc5.updateBalance();
            System.out.println("Update");
        }*/


      
    }
}
