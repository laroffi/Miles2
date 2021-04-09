public class BonusMilesService {
    public long calculate(int price) {
        int cost = 20;
        int miles = price / cost;
        return miles;
    }
}
