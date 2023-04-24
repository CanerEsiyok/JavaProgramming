package day35_Encapsulation;

public class Credentials {
    private String username, password;

    public boolean isStrongPassword(String password) {
    boolean chlong=false;
    boolean notSpace=false;
    boolean oneLetter=false;
    boolean specialCharacters=false;
    boolean digit= false;
    if(password.length()>=8)
        chlong=true;
    if(!password.contains(" "))
        notSpace=true;
    char[] arr=password.toCharArray();
        for (char c : arr) {
            if(Character.isLetter(c))
                oneLetter=true;
            if(!Character.isLetterOrDigit(c))
                specialCharacters=true;
            if(Character.isDigit(c))
                digit=true;
        }
        boolean result=(chlong && notSpace && oneLetter && specialCharacters && digit);
        if(result)
            return true;
        else
            return false;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(!isStrongPassword(password)){
            System.err.println("Your password is not strong");
            System.exit(0);
        }
        this.password = password;

    }

    public String toString() {
        return "Credentials{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public Credentials(String username, String password) {
        setUsername(username);
        setPassword(password);
    }
}
