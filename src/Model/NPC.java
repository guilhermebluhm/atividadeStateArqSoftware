package Model;

import StatePattern.IteracaoInicial;
import StatePattern.State;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class NPC {

    private UUID id;
    private String nomeNPC;
    private String funcionalidade;
    private PersonagemPlayer player;
    private State estadoNPC;
    private List<String> iteracoes;

    public NPC(UUID id, String nomeNPC, String funcionalidade, PersonagemPlayer player) {
        this.id = id;
        this.nomeNPC = nomeNPC;
        this.funcionalidade = funcionalidade;
        this.player = player;
        estadoNPC = new IteracaoInicial(this);
        this.iteracoes = new ArrayList<>();
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNomeNPC() {
        return nomeNPC;
    }

    public void setNomeNPC(String nomeNPC) {
        this.nomeNPC = nomeNPC;
    }

    public String getFuncionalidade() {
        return funcionalidade;
    }

    public void setFuncionalidade(String funcionalidade) {
        this.funcionalidade = funcionalidade;
    }

    public PersonagemPlayer getPlayer() {
        return player;
    }

    public void setPlayer(PersonagemPlayer player) {
        this.player = player;
    }

    public State getEstadoNPC() {
        return estadoNPC;
    }

    public void setEstadoNPC(State estadoNPC) {
        this.estadoNPC = estadoNPC;
    }

    public List<String> getIteracoes() {
        return iteracoes;
    }

    public void setIteracoes(String iteracoes) {
        this.iteracoes.add(iteracoes);
        this.estadoNPC.alterarEstado();
    }
}
