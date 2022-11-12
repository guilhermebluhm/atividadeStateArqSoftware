import Model.NPC;
import Model.PersonagemPlayer;
import service.impl.AcaoesPersonagemImpl;

import java.util.UUID;

public class EntryPoint {

    public static void main(String[] args) {

        UUID grng = UUID.randomUUID();

        PersonagemPlayer player = new PersonagemPlayer(grng,"assembly",4250.00);
        NPC npc = new NPC(grng,"ulterir","venda de armaduras",player);

        AcaoesPersonagemImpl impl = new AcaoesPersonagemImpl();
        System.out.println(impl.statusPersonagem(player));
        impl.iteracaoComNpc(npc);
        npc.setIteracoes("arma de duas maos");
        impl.iteracaoComNpc(npc);

    }

}
