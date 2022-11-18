public class Guest {

    private String name;
    private int age;
    private double wallet;
    private char currency;
    private Integer sobriety;
    private boolean banStatus;

    public Guest(String name, int age, double wallet, char currency, Integer sobriety, boolean banStatus){
        this.name = name;
        this.age = age;
        this.wallet = wallet;
        this.currency = currency;
        this.sobriety = sobriety;
        this.banStatus = banStatus;
    }

//    GETTERS & SETTERS

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getCurrency(char £) {
        return currency;
    }

    public double getWallet() {
        return wallet;
    }

    public void setWallet(double wallet) {
        this.wallet = wallet;
    }

    public Integer getSobriety() {
        return sobriety;
    }

    public boolean getBanStatus(boolean b) {
        return banStatus;
    }


}
