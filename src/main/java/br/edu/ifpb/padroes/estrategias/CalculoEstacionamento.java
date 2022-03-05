package br.edu.ifpb.padroes.estrategias;

import java.math.BigDecimal;
import java.time.Duration;

public interface CalculoEstacionamento {
    BigDecimal calcular(Duration periodo);
}
