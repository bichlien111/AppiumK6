package lab_08_2;

import java.security.SecureRandom;
import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.List;

public class TestAnimalRacing {
    public static void main(String[] args) {
        Animal dogAnimal = new Dog();
        Animal horseAnimal = new Horse();
        Animal tigerAnimal = new Tiger();

        List<Animal> animalList= new ArrayList<>();
        animalList.add(dogAnimal);
        animalList.add(horseAnimal);
        animalList.add(tigerAnimal);

        dogAnimal.setSpeed(new SecureRandom().nextInt(60));
        horseAnimal.setSpeed(new SecureRandom().nextInt(75));
        tigerAnimal.setSpeed(new SecureRandom().nextInt(100));

        int maxSpeed = 0;
        String animalName = null;

        for (Animal animal : animalList) {
            System.out.printf("%s with speed %d \n", animal.getClass().getSimpleName(), animal.getSpeed());
            if(animal.getSpeed() > maxSpeed){
                maxSpeed = animal.getSpeed();
                animalName = animal.getClass().getSimpleName();
            }
        }
        System.out.printf("Winner is: %s with speed: %d", animalName, maxSpeed);
    }
}
