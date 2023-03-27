public class UseAnimalsMain {
    public static void main(String[] args) {

        Animal[] animalArray = new Animal[5];

        animalArray[0] = new Snake();
        animalArray[1] = new Sheep();
        animalArray[2] = new Dog();
        animalArray[3] = new Cat();
        animalArray[4] = new Cow();

        System.err.println();
        System.out.println("All animals in this array makes these sounds:");
        for (int i = 0; i < animalArray.length; i++) {
            animalArray[i].speaks();
        }
        System.out.println();
    }
}