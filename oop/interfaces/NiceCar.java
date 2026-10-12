package interfaces;

public class NiceCar {

    private Engine engine;

    private Media mediaPlayer = new CDPlayer();

    public NiceCar(Engine engine) {
        this.engine = engine;
    }

    public NiceCar() {
        engine = new PowerEngine();
    }

    public void start() {
        engine.start();
    }

    public void stop() {
        engine.stop();
    }

    public void acc() {
        engine.acc();
    }

    public void startMusic() {
        mediaPlayer.start();
    }

    public void stopMusic() {
        mediaPlayer.stop();
    }

    public void upgradeEngine(Engine engine){
        this.engine = engine;
    }
}
