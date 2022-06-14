public class BusinessAccount extends Account {

    private Double loanLimitEmprestimo;

    public BusinessAccount() {
        super();
    }

    public BusinessAccount(Integer number, String holderTitular, Double balanceSaldo, Double loanLimitEmprestimo) {
        super(number, holderTitular, balanceSaldo);
        this.loanLimitEmprestimo = loanLimitEmprestimo;
    }

    public Double getLoanLimitEmprestimo() {
        return loanLimitEmprestimo;
    }

    public void setLoanLimitEmprestimo(Double loanLimitEmprestimo) {
        this.loanLimitEmprestimo = loanLimitEmprestimo;
    }

    
    public void loanDeposita(double amountValor) {
        if (amountValor <= loanLimitEmprestimo) {
        balanceSaldo += amountValor -10.0;
        
        }
    }
    @Override
    public void withdrawSaque(double amountValor) {
    super.withdrawSaque(amountValor);
    balanceSaldo -= 2.0;


    }

    
}
