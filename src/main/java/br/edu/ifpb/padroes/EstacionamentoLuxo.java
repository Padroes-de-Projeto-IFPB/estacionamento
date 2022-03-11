package br.edu.ifpb.padroes;

import br.edu.ifpb.padroes.estrategias.CalculoEstacionamentoFabrica;
import br.edu.ifpb.padroes.estrategias.CalculoEstacionamentoLuxo;

public class EstacionamentoLuxo extends Estacionamento {
    @Override
    public CalculoEstacionamentoFabrica getCalculoEstacionamentoFabrica() {
        return new CalculoEstacionamentoLuxo();
    }
}
