 public class PowerRanger {
    String Name;
    String Color;
    String Helmet;
    String Weapon;

    // constructor

     PowerRanger(String Name,String Color,String Helmet,String Weapon) {
         this.Name=Name;
         this.Color=Color;
         this.Helmet=Helmet;
         this.Weapon=Weapon;
     }

     void Run() {
         System.out.println("PowerRanger can Run");
     }

     void Fire() {
         System.out.println("PowerRanger can Fire");
     }

     void fight() {
         System.out.println("PowerRanger can fight");
     }

     void Rangers() {
         System.out.println("PowerRanger Name:"+Name);
         System.out.println("PowerRanger Color:"+Color);
         System.out.println("PowerRanger Helmet Level:"+Helmet);
         System.out.println("PowerRanger Weapon:"+Weapon);
     }

}
