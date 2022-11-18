import java.util.ArrayList;

public class Server {

    private ArrayList<String> drinks = new ArrayList<>();



//    METHOD
    public boolean canServeGuest(Guest guest){
        if(guest.getAge() >= 18) {
            return true;
        }

        if(guest.getWallet() >= 5) {
            return true;
        }

        if(guest.getSobriety() <= 100 && guest.getSobriety() >= 50) {
            return true;
        }

        if(guest.getBanStatus(false)) {
            return true;
        }

        return false;

    }
}
