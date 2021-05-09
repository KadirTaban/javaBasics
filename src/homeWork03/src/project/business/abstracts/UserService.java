package homeWork03.src.project.business.abstracts;

import homeWork03.src.project.entities.concretes.User;

import java.util.List;

public interface UserService {


    void add(User user);

    void Login(String email, String password);


    List<User> getAll();






}
