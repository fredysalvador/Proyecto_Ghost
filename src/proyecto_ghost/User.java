
package proyecto_ghost;

import java.util.ArrayList;

public class User {
    public static ArrayList<User> users = new ArrayList();
    private String user;
    private String pass;
    private int puntos;
    private ArrayList<String> juegos;
    
    public User(){
    }
    
    public User(String _user, String _pass, int _puntos){
        this.user = _user;
        this.pass = _pass;
        this.puntos = _puntos;
        this.juegos = new ArrayList();
    }

    public ArrayList<String> getLogs(){
        return juegos;
    }
    
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getPuntos() {
        return puntos;
    }

    public void addPuntos() {
        this.puntos += 3;
    }

    public static void addLog(String _user, String _message) {
        for(User usr:users){
            if(usr.user.equals(_user)){
                usr.juegos.add(_message);
            }
        }
    }
    
    public static User buscarUser(String _user){
        for(User usr: users){
            if(usr.getUser().equals(_user)){
                return usr;
            }
        }
        return null;
    }
    
    public static void addUser(String _user, String _pass){
        if(buscarUser(_user) == null){
            users.add(new User(_user, _pass, 0));
        }
    }
    
    public static void eraseUser(User _user){
        users.remove(_user);
    }
}
