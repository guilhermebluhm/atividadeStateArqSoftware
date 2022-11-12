package Model;

import java.util.UUID;

public class PersonagemPlayer {

    private UUID id;
    private String nomeJogador;
    private Double vidaMaxima;

    public PersonagemPlayer(UUID id, String nomeJogador, Double vidaMaxima) {
        this.id = id;
        this.nomeJogador = nomeJogador;
        this.vidaMaxima = vidaMaxima;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNomeJogador() {
        return nomeJogador;
    }

    public void setNomeJogador(String nomeJogador) {
        this.nomeJogador = nomeJogador;
    }

    public Double getVidaMaxima() {
        return vidaMaxima;
    }

    public void setVidaMaxima(Double vidaMaxima) {
        this.vidaMaxima = vidaMaxima;
    }
}
