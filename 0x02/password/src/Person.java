public class Person {

    String user;
    String password;

    public boolean checkUser(){
        return user.length() >= 8 && !(user.contains("!@#$%*()"));
    }

    public boolean checkPassword(){
        boolean upperCase = false;
        boolean digit = false;
        boolean specialChar = false;
        for (int i = 0; i < password.length(); i++) {
            if(Character.isUpperCase(password.charAt(i))){
                upperCase = true;
            }
            else if (Character.isDigit(password.charAt(i))){
                digit = true;
            }
        }
        return upperCase && digit && specialChar &&
                password.contains("!@#$%*()") && password.length()>=8;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
