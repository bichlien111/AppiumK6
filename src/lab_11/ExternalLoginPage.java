package lab_11;

public class ExternalLoginPage extends LoginPage{
    public ExternalLoginPage() {
        login = new SSOLogin();
        }
    public void loginType(){
        login.login();
    }
}
