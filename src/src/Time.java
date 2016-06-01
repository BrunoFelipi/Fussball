package src;

import BancoDeDados.BancoDeDados;
import java.awt.Color;
import src.titulos.Titulo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;

/**
 *
 * @author Bruno
 */
public class Time implements Serializable {

    private int id;
    private ImageIcon escudo;
    private String nome;
    private int forca;
    private int nivel;
    private float caixa;
    private String estado;
    private List<Jogador> jogadores;
    private List<Jogador> jogadoresTitular;
    private List<Jogador> jogadoresReserva;
    private List<Titulo> titulos;
    private Treinador treinador;
    private Estadio estadio;
    private Color cor1;
    private Color cor2;
    private int qtdTorcedores;    
    private BancoDeDados bd;
    private int qtdMaxJogadores;

    public Time(String nome) {
        this.nome = nome;
    }
        
    public Time(String nome, int nivel, BancoDeDados bd) {
        setNome(nome);
        setNivel(nivel);
        setBd(bd);
        setId(nextID());
        setQtdTorcedores(0);
        setQtdMaxJogadores(25);
        this.jogadores = new ArrayList<>();
        this.jogadoresReserva = new ArrayList<>();
        this.jogadoresTitular = new ArrayList<>();        
        this.titulos = new ArrayList<>();
        setCaixa(0);
    }
        
    public Time(ImageIcon escudo, String nome, int nivel, Treinador treinador, Estadio estadio, Color cor1, Color cor2, BancoDeDados bd) {
        setEscudo(escudo);
        setNome(nome);
        setNivel(nivel);
        setTreinador(treinador);
        this.jogadores = new ArrayList<>();
        this.jogadoresReserva = new ArrayList<>();
        this.jogadoresTitular = new ArrayList<>();        
        this.titulos = new ArrayList<>();
        setCaixa(0);
        setEstadio(estadio);
        setBd(bd);
        setId(nextID());
        setCor1(cor1);
        setCor2(cor2);
        setQtdTorcedores(0);
        setQtdMaxJogadores(25);
    }

    public int getQtdMaxJogadores() {
        return qtdMaxJogadores;
    }

    public void setQtdMaxJogadores(int qtdMaxJogadores) {
        this.qtdMaxJogadores = qtdMaxJogadores;
    }

    public int getQtdTorcedores() {
        return qtdTorcedores;
    }

    public void setQtdTorcedores(int qtdTorcedores) {
        this.qtdTorcedores = qtdTorcedores;
    }

    public ImageIcon getEscudo() {
        return escudo;
    }

    public void setEscudo(ImageIcon escudo) {
        this.escudo = escudo;
    }

    public BancoDeDados getBd() {
        return bd;
    }

    public void setBd(BancoDeDados bd) {
        this.bd = bd;
    }

    public Color getCor1() {
        return cor1;
    }

    public void setCor1(Color cor1) {
        this.cor1 = cor1;
    }

    public Color getCor2() {
        return cor2;
    }

    public void setCor2(Color cor2) {
        this.cor2 = cor2;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;       
    }

    public int getExperiencia() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public List<Titulo> getTitulos() {
        return titulos;
    }

    public void setTitulos(List<Titulo> titulos) {
        this.titulos = titulos;
    }
    
    public List<Jogador> getJogadores() {
        return jogadores;
    }

    public void setJogadores(List<Jogador> jogadores) {
        this.jogadores = jogadores;
    }

    public Treinador getTreinador() {
        return treinador;
    }

    public void setTreinador(Treinador treinador) {
        this.treinador = treinador;
    }

    public float getCaixa() {
        return caixa;
    }

    public void setCaixa(float caixa) {
        this.caixa = caixa;
    }

    public Estadio getEstadio() {
        return estadio;
    }

    public void setEstadio(Estadio estadio) {
        this.estadio = estadio;
    }
    
    public List<Jogador> getJogadoresTitular() {
        return jogadoresTitular;
    }

    public void setJogadoresTitular(List<Jogador> jogadoresTitular) {
        this.jogadoresTitular = jogadoresTitular;
    }

    public List<Jogador> getJogadoresReserva() {
        return jogadoresReserva;
    }

    public void setJogadoresReserva(List<Jogador> jogadoresReserva) {
        this.jogadoresReserva = jogadoresReserva;
    }
    
    public void addTitulo(Titulo t){
        getTitulos().add(t);
    }
    
    public void addJogador(Jogador j){
        
        if(getJogadores().size() < this.qtdMaxJogadores){
            getJogadores().add(j);    
        } else {
            throw new RuntimeException("");
        }
        
    }
    
    public void addJogadorTitular(Jogador j){
        
        if(getJogadoresTitular().size() < 11){
            getJogadores().add(j);    
        } else {
            throw new RuntimeException("");
        }        
    }
    
    public void addJogadorReserva(Jogador j){
        
        if(getJogadoresReserva().size() <= this.qtdMaxJogadores - 11){
            getJogadores().add(j);    
        } else {
            throw new RuntimeException("");
        }
        
        getJogadoresReserva().add(j);
    }
    
    private int nextID(){
        
        if(getBd().getTimes().isEmpty()){
            return 1;
        } else {
            return getBd().getTimes().get(getBd().getTimes().size()-1).getId() +1;
        }
    }
    
}