package lab_11;

/* Please use Strategy Design Pattern to solve below problem
* ILOgin: login
* NormalLogin implements ILOgin
* SSOLogin implements ILOgin
* LoginPage - abstract
* InternalLoginPage use normal login type
* ExternalLoginPage use SSO type
* */
public class Main {
    public static void main(String[] args) {
        LoginPage internalLogin = new InternalLoginPage();
        System.out.println("Internal Login using: ");
        internalLogin.loginType();

        LoginPage externalLogin = new ExternalLoginPage();
        System.out.println("External Login using: ");
        externalLogin.loginType();
    }
}
