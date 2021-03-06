 class Rocket implements SpaceShip {
    int rocketCost;
    int rocketWeight;
    int maxWeight;
    double launchExplosion;
    double landingSuccess;
    int currentWeight;

     @Override
     public boolean launch() {
         return true;
     }

     @Override
     public boolean land() {
         return true;
     }

     @Override
     public boolean canCarry(Item item) {
         return currentWeight + item.weight <= maxWeight;
     }

     @Override
     public int carry(Item item) {
         return currentWeight+=rocketWeight;
     }
 }
