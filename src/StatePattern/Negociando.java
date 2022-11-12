package StatePattern;

import Model.NPC;

public class Negociando extends State{

    public Negociando(NPC npc) {
        this.npc = npc;
    }

    @Override
    public void comunicacao() {
        System.out.println(this.npc.getIteracoes().get(0) + " sim, temos disponivel");
    }

    @Override
    public void alterarEstado() {
        //TODO
    }
}
