public interface Animal {
    public void animalSound();
    public void sleep();
}

class Pig implements Animal{
    @Override
    public void animalSound() {
        System.out.println("the pig says : we  wee");
    }

    @Override
    public void sleep() {
        System.out.println("zzz");
    }
}
