public abstract class Light {

    private Switchable aSwitch;

    public Light(Switchable aSwitch) {
        this.aSwitch = aSwitch;
    }

    public void toggle() {
        aSwitch.toggle();
    }


}
