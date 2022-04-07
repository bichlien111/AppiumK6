package lab_11;

public abstract class LoginPage {
    ILogin login;
    public void loginType() {
        login.login();
    }
}
