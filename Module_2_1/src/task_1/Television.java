package task_1;

public class Television {
    private int channel;
    private boolean isWorking;

    public void setChannel(int newChannel) {
        if (newChannel == 11) {
            channel = 1;
        } else {
            channel = newChannel;
        }
    }

    public void pressOnOff() {
        isWorking = !isWorking;
    }

    public boolean isOn() {
        return isWorking;
    }

    public int getChannel() {
        return channel;
    }
}
