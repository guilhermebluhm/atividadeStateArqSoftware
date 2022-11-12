package StatePattern;

import Model.NPC;

public class Despedida extends State{

    public Despedida(NPC npc) {
        this.npc = npc;
    }

    @Override
    public void comunicacao() {
        System.out.println("transação realizada com sucesso");
    }

    @Override
    public void alterarEstado() {
        //SEM MAIS ESTADOS ADICIONAIS
    }
}
