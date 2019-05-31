

public class Main {

    public static void main(String[] args) {

        Light light = new LightImpl(new LightSwitchImpl());

        light.toggle();

    }
}
