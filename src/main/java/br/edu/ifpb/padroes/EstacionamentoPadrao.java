package br.edu.ifpb.padroes;

import br.edu.ifpb.padroes.estrategias.CalculoEstacionamentoFabrica;
import br.edu.ifpb.padroes.estrategias.CalculoEstacionamentoPadrao;

public class EstacionamentoPadrao extends Estacionamento {
    @Override
    public CalculoEstacionamentoFabrica getCalculoEstacionamentoFabrica() {
        return new CalculoEstacionamentoPadrao();
    }
}
