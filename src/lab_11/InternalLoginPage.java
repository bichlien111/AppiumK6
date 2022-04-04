package lab_11;

public class InternalLoginPage extends LoginPage{
    public InternalLoginPage() {
        login = new NormalLogin();
    }
    public void loginType(){
        login.login();
    }
}
