package lab_08_2;
/* Horse: Max 75 Km/h
* Tiger: Max 100 Km/h
* Dog: Max 60 Km/h
* Create an Animal class with a method speed() which return a random speeds
* Create 3 objects for those 3 animal type
* Run and see which animal is winner for racing
Bonus: Default name with Class variable
Format: Winner is <Animal name>, with speed: <speed>
Hints: -> Class name can get from: object.getClass().getSimpleName();
       ->  int randomSpeed = new SecureRandom().nextInt(50);
*/

import java.security.SecureRandom;

public class Animal {

    private int speed;

    public Animal() {
    }

    public Animal(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {

        this.speed = speed;
    }
}
