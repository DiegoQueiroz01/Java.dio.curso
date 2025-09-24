package Dio.curso.modulos.POO_Estrutura_de_Dados.Interfaces.Codigos_de_Aula;

public class MainInterfaceReproducer {
    public static void main(String[] args) {
        var msuciPlayer = new MusicPlayer() {
            @Override
            public void playMusic() {
                System.out.println("Tocando a música.");
            }

            @Override
            public void pauseMusic() {

            }

            @Override
            public void stopMusic() {

            }
        };
        //musicPlayer.playMusci();
    }
}
