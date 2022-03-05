package br.edu.ifpb.padroes.estrategias;

import br.edu.ifpb.padroes.estrategias.util.Taxas;

import java.math.BigDecimal;
import java.time.Duration;

public class CalculoHora implements CalculoEstacionamento {
    @Override
    public BigDecimal calcular(Duration periodo) {
        return Taxas.VALOR_HORA.multiply(new BigDecimal(periodo.toHours()));
    }
}
