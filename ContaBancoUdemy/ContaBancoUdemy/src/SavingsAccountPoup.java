public class SavingsAccountPoup extends Account{

    //final evita que sejam criadas outras classes com base nesta

    private Double interestRate;

    public SavingsAccountPoup() {
        super();

    }

    public SavingsAccountPoup(Integer number, String holderTitular, Double balanceSaldo, Double interestRate) {
        super(number, holderTitular, balanceSaldo);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance() {
         balanceSaldo += balanceSaldo + interestRate;
    }

    @Override
    public void withdrawSaque(double amountValor) {
        balanceSaldo -= amountValor;
    }





}
