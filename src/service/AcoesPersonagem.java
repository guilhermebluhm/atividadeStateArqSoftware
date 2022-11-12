package service;

import Model.NPC;
import Model.PersonagemPlayer;

public interface AcoesPersonagem {

    String statusPersonagem(PersonagemPlayer player);
    void iteracaoComNpc(NPC npc);

}
