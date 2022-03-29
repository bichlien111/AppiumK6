package lab_09;

/* Racing animal with builder design pattern (adding attribute flyable)
 * Eagle, Falcon, Tiger, Snake....
 * Animal tiger = new Animal.Builder().whithWings(false).....build();
 * Animal falcon = new Animal.Builder().whithWings(true).....build();*/

public class AnimalBuilder {
    private boolean flyable;

    private AnimalBuilder() {
    }

    protected AnimalBuilder(Builder builder){
        flyable = builder.flyable;
    }

    // Read only
    public boolean getFlyable() {
        return flyable;
    }

    public static class Builder {
        private boolean flyable;

        // Write only
        public Builder withFlyable(boolean flyable) {
            this.flyable = flyable;
            return this;
        }
        public AnimalBuilder build(){
            return new AnimalBuilder(this);
        }
    }
}
