public abstract class Animal {

    private String name;

    public abstract void speaks();

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}