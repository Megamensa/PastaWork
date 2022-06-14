public class Account {

    private Integer number;
    private String holderTitular;
    protected Double balanceSaldo;

    public Account() {        
    }

    public Account(Integer number, String holderTitular, Double balanceSaldo) {
        this.number = number;
        this.holderTitular = holderTitular;
        this.balanceSaldo = balanceSaldo;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolderTitular() {
        return holderTitular;
    }

    public void setHolderTitular(String holderTitular) {
        this.holderTitular = holderTitular;
    }

    public Double getBalanceSaldo() {
        return balanceSaldo;
    }

        public void withdrawSaque(double amountValor) {
            balanceSaldo -= amountValor + 5.0;
        }

        public void depositDeposito(double amountValor) {
            balanceSaldo += amountValor;
        }

    
    
}
