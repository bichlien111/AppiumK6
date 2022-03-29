package lab_09;
import java.util.ArrayList;
import java.util.List;

import static lab_09.AnimalBuilder.Builder;

public class TestAnimalFly {
    public static void main(String[] args) {
        Builder builder = new Builder();

        AnimalBuilder tiger = builder.withFlyable(false).build();
        AnimalBuilder falcon = builder.withFlyable(true).build();
        AnimalBuilder eagle = builder.withFlyable(true).build();
        AnimalBuilder snake = builder.withFlyable(false).build();

        List<AnimalBuilder> animalBuilderList = new ArrayList<>();
        animalBuilderList.add(tiger);
        animalBuilderList.add(falcon);
        animalBuilderList.add(eagle);
        animalBuilderList.add(snake);

        for (AnimalBuilder animalBuilder : animalBuilderList) {
            if(animalBuilder.getFlyable() == true){
                System.out.println("Animal has flyable \n");
            }
            if(animalBuilder.getFlyable() == false) {
                System.out.println("Animal has NO flyable \n");
            }
        }
    }
}
