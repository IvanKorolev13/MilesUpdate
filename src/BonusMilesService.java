public class BonusMilesService {
    public int calculate(int cost){
        int pricePerMiles = 20;
        int milesEarned = cost / pricePerMiles;
        return milesEarned;
    }

}
