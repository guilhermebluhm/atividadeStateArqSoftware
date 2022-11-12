package service.impl;

import Model.NPC;
import Model.PersonagemPlayer;
import service.AcoesPersonagem;

public class AcaoesPersonagemImpl implements AcoesPersonagem {

    @Override
    public String statusPersonagem(PersonagemPlayer player) {
        StringBuffer sb = new StringBuffer();
        sb.append("UUID: ").append(player.getId()).append(" Nome: ").append(player.getNomeJogador());
        return sb.toString();
    }

    @Override
    public void iteracaoComNpc(NPC npc) {
        npc.getEstadoNPC().comunicacao();
    }
}
