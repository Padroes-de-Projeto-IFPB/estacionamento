package br.edu.ifpb.padroes.estrategias;

import java.time.Duration;

public class CalculoEstacionamentoLuxo implements CalculoEstacionamentoFabrica {

    public CalculoEstacionamento criarCalculoEstacionamento(Duration periodo) {
        if (periodo.toHours() < 4) {
            return new CalculoHora();
        } else if (periodo.toDays() < 5) {
            return new CalculoDiaria();
        } else if (periodo.toDays() > 5) {
            return new CalculoMensalidade();
        }
        return null;
    }

}
