package br.edu.ifpb.padroes;

import br.edu.ifpb.padroes.estrategias.CalculoEstacionamento;
import br.edu.ifpb.padroes.estrategias.CalculoEstacionamentoFabrica;
import br.edu.ifpb.padroes.estrategias.CalculoEstacionamentoPadrao;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalDateTime;

@Getter
@Setter
public abstract class Estacionamento {

    private LocalDateTime entrada;
    private LocalDateTime saida;
    private Veiculo veiculo;

    public abstract CalculoEstacionamentoFabrica getCalculoEstacionamentoFabrica();

    public BigDecimal obterTotalAPagar() {
        assert(entrada != null && saida != null && veiculo != null);
        Duration periodo = Duration.between(entrada, saida);
        CalculoEstacionamento calculoEstacionamento = getCalculoEstacionamentoFabrica().criarCalculoEstacionamento(periodo);
        assert calculoEstacionamento != null;
        return calculoEstacionamento.calcular(periodo);
    }

}
