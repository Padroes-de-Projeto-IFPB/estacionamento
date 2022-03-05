package br.edu.ifpb.padroes.estrategias;

import br.edu.ifpb.padroes.estrategias.util.Taxas;

import java.math.BigDecimal;
import java.time.Duration;

public class CalculoDiaria implements CalculoEstacionamento {
    @Override
    public BigDecimal calcular(Duration periodo) {
        return Taxas.VALOR_DIARIA.multiply(new BigDecimal(periodo.toDays()));
    }
}
