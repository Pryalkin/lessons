package lesson.library.service;

import lesson.library.domain.User;
import lesson.library.exception.FoundUserException;

public interface UserService {
    void addUser(String name, String password) throws FoundUserException;
    User authorization(String name, String password);
}
