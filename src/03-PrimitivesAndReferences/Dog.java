public class Dog {
    String name = "Rocksy";

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.bark();
        dog1.name = "Bart";

        Dog[] myDogs = new Dog[3];
        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = dog1;

        myDogs[0].name = "Fred";
        myDogs[1].name = "Marge";

        System.out.println("Last dog's name is: " + myDogs[2].name);
        myDogs[1].eat();
        myDogs[2].chaseCat();

        int x = 0;
        while(x < myDogs.length){
            myDogs[x].bark();
            x = x + 1;
        }
    }
    public void bark(){
        System.out.println(name + " says Ruff! 🐶");
    }
    public void eat(){
        System.out.println(name + " is eating! 🍖");
    }
    public void chaseCat(){
        System.out.println(name + " is chasing cat! 🐱");
    }
}
