package StatePattern;

import Model.NPC;

public class IteracaoInicial extends State{

    public IteracaoInicial(NPC npc) {
        this.npc = npc;
    }

    @Override
    public void comunicacao() {
        System.out.println("Olá viajante, o que deseja ?");
    }

    @Override
    public void alterarEstado() {
        if(this.npc.getIteracoes().size() != 0){
            this.npc.setEstadoNPC(new Negociando(npc));
        }
    }
}
