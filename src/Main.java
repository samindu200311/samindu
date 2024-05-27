public class Main {
    public static void main(String[] args) {
        PowerRanger obj1 = new PowerRanger("Hulk","Green","Level 2", "MP5");
        PowerRanger obj2 = new PowerRanger("Iron Man", "Red", "Level 3", "MP40");
        PowerRanger obj3 = new PowerRanger("Captain America", "Blue", "Level 3", "Shield");

        obj1.Rangers();
        obj1.Run();
        System.out.println(" ");
        obj2.Rangers();
        obj2.fight();
        System.out.println(" ");
        obj3.Rangers();
        obj3.Fire();

    }
}