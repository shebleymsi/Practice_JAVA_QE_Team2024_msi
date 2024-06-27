package MidTerm.databases;

public class Stimulus_info {
    private int checkNumber;
    private String peopleName;
    private String homeAddress;
    private int moneyOrder;
    private String emailAddress;

    public Stimulus_info(){

    }

    public Stimulus_info(int checkNumber, String peopleName, String homeAddress, int moneyOrder, String emailAddress) {
        this.checkNumber = checkNumber;
        this.peopleName = peopleName;
        this.homeAddress = homeAddress;
        this.moneyOrder = moneyOrder;
        this.emailAddress = emailAddress;
    }

    public int getCheckNumber() {
        return checkNumber;
    }

    public void setCheckNumber(int checkNumber) {
        this.checkNumber = checkNumber;
    }

    public String getPeopleName() {
        return peopleName;
    }

    public void setPeopleName(String peopleName) {
        this.peopleName = peopleName;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public int getMoneyOrder() {
        return moneyOrder;
    }

    public void setMoneyOrder(int moneyOrder) {
        this.moneyOrder = moneyOrder;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}
