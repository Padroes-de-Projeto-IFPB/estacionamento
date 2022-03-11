package br.edu.ifpb.padroes.estrategias;

import java.time.Duration;

public class CalculoEstacionamentoPadrao implements CalculoEstacionamentoFabrica {

    public CalculoEstacionamento criarCalculoEstacionamento(Duration periodo) {
        if (periodo.toHours() < 12) {
            return new CalculoHora();
        } else if (periodo.toDays() < 15) {
            return new CalculoDiaria();
        } else if (periodo.toDays() > 15) {
            return new CalculoMensalidade();
        }
        return null;
    }

}
