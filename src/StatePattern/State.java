package StatePattern;

import Model.NPC;

public abstract class State {

    protected NPC npc;

    public abstract void comunicacao();
    public abstract void alterarEstado();

}
