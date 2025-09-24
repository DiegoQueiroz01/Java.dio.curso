package Dio.curso.modulos.POO_Estrutura_de_Dados.Interfaces.Codigos_de_Aula;

public class Smartphone implements VideoPlayer, MusicPlayer{
    @Override
    public void playMusic() {
        System.out.println("Tocanddo música...");
    }

    @Override
    public void pauseMusic() {
        System.out.println("Música pausada...");
    }

    @Override
    public void stopMusic() {
        System.out.println("Música parada...");
    }

    @Override
    public void playVideo() {
        System.out.println("Transmitindo vídeo...");
    }

    @Override
    public void pauseVideo() {
        System.out.println("Pausando vídeo...");
    }

    @Override
    public void stopVideo() {
        System.out.println("Vídeo parado...");
    }
}
