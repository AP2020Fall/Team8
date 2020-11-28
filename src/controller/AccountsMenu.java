package controller;

import model.Account;

public class AccountsMenu {
    private Account  account;
    private boolean isLogin;
    public void viewAccountInfo(String info){}
    public void changePassWord(String password){}
    public void editField(String field){}
    public void viewPlatoStatistics(){}
    public void setAccount(Account account) {
        this.account = account;
    }
    public void Logout(Account account){}
    public void gameNameValidation(String name){}
    public void showGameHistory(){}
    public void showGameStatistics(String gameName){}

    public void setLogin(boolean login) {
        isLogin = login;
    }
}
