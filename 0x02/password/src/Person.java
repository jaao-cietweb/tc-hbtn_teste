public class Person {

    String user;
    String password;

    public boolean checkUser(){ //"^[a-zA-Z0-9]{8,}$"
        return this.user.matches("^[a-zA-Z0-9]{8,}$");
    }

    public boolean checkPassword(){
        return this.password.matches("^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*#?&])[A-Za-z\\d@$!%*#?&]{8,}$");
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
