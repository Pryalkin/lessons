package lesson.library.service.impl;

import lesson.library.domain.User;
import lesson.library.enumeration.Role;
import lesson.library.exception.FoundUserException;
import lesson.library.repository.Repository;
import lesson.library.service.UserService;

import java.util.Collection;

public class UserServiceImpl implements UserService {

    private Repository repository = Repository.getInstance();

    @Override
    public void addUser(String name, String password) throws FoundUserException {
        User user = new User(name, password);
        if (repository.getUsers().size() == 0){
            user.setRole(Role.ROLE_ADMIN);
        } else {
            Collection<User> users = repository.getUsers().values();
            for (User u: users) {
                if (u.getName().equals(name) && u.getPassword().equals(password)){
                    throw new FoundUserException("Пользователь уже разегистрирован");
                }
            }
            user.setRole(Role.ROLE_USER);
        }
        repository.saveUsers(user);
    }

    @Override
    public User authorization(String name, String password) {
        if (repository.getUsers().size() == 0) return null;
        else {
            Collection<User> users = repository.getUsers().values();
            for (User u: users) {
                if (u.getName().equals(name) && u.getPassword().equals(password)){
                   return u;
                }
            }

        }
        return null;
    }
}
