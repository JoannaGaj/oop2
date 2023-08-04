package abstractExamples;

public class Cat extends Animal {
    public Cat(String name){
        super(name, 0);
        System.out.println("Konstruktor z parametrem name Cat");
      //  this.setName(name);
    }

    @Override
    public void useVoice() {
        super.useVoice();
        System.out.println("Meooow");
    }

    @Override
    public void feed() {
        System.out.println("Daję kotu mleko");
    }

}
