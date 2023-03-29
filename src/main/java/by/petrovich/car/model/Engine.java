package by.petrovich.car.model;

public class Engine {
    private boolean isLaunched;
    private String type;

    public Engine(String type) {
        this.isLaunched = false;
        this.type = type;
    }

    public boolean isLaunched() {
        return isLaunched;
    }

    private void setLaunched(boolean launched) {
        isLaunched = launched;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Engine{");
        sb.append("isLaunched=").append(isLaunched);
        sb.append(", type='").append(type).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public boolean launch() {
        if (!isLaunched) {
            return this.isLaunched = true;
        } else {
            return this.isLaunched = false;
        }
    }

    public void shutDown() {
        isLaunched = false;
    }
}
