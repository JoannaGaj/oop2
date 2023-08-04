package Animals;

public class Animal {
    private String name;
    private int age;

    public Animal(){
        System.out.println("Konstruktor bezparametrowy Animal");
      this.name = "nieznany";
      this.age = 0;
    }
    public Animal(String name, int age){
        System.out.println("Konstruktor z dwoma parametrami Animal");
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("Konstruktor z parametrem name Animal");
        this.name = name;
        this.age = 0;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void useVoice(){
        System.out.println("Każde zwierze daje jakiś dźwięk");
    }
}
