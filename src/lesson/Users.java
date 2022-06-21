package lesson;

import java.util.ArrayList;
import java.util.List;

public class Users {

    private static List<User> users = new ArrayList<User>();

    public static List<User> getUsers() {
        return users;
    }

    public boolean addUser(User user){
        return users.add(user);
    }
}
