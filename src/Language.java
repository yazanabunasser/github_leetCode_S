public interface Language {
    void getName(String name);
}

class ProgrammingLanguage implements Language{
    public void getName(String name){
        System.out.println("Programming Language : " + name);
    }
}