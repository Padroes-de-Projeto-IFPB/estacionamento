package br.edu.ifpb.padroes.estrategias;

import java.time.Duration;

public interface CalculoEstacionamentoFabrica {
    CalculoEstacionamento criarCalculoEstacionamento(Duration periodo);
}
