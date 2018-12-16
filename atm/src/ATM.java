public class ATM {
    private int depositAmount;
    private int withdrawAmount;
    private int currentBalance;
    private boolean userAuthenticated;

    public ATM(){}

    public ATM(int depositAmount, int withdrawAmount, int currentBalance, boolean userAuthenticated) {
        super();
        this.depositAmount = depositAmount;
        this.withdrawAmount = withdrawAmount;
        this.currentBalance = currentBalance;
        this.userAuthenticated = userAuthenticated;
    }

    public int getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(int depositAmount) {
        this.depositAmount = depositAmount;
    }

    public int getWithdrawAmount() {
        return withdrawAmount;
    }

    public void setWithdrawAmount(int withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
    }

    public int getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(int currentBalance) {
        this.currentBalance = currentBalance;
    }

    public boolean isUserAuthenticated() {
        return userAuthenticated;
    }

    public void setUserAuthenticated(boolean userAuthenticated) {
        this.userAuthenticated = userAuthenticated;
    }
}


