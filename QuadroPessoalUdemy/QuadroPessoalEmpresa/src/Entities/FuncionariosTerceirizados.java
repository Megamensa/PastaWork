package Entities;

public class FuncionariosTerceirizados extends Empregados {

    private Double adicional;

    public FuncionariosTerceirizados() {
        super();
    }

    public FuncionariosTerceirizados(String nome, Integer horas, Double valorPorHora, Double adicional) {
        super(nome, horas, valorPorHora);
        this.adicional = adicional;
    }

    public Double getAdicional() {
        return adicional;
    }

    public void setAdicional(Double adicional) {
        this.adicional = adicional;
    }

    @Override
    public Double pagamento() {
        return super.pagamento() + adicional * 1.1;
    }
    
}
