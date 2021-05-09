package homeWork03.src.project.dataAccess.abstracts;

import homeWork03.src.project.entities.concretes.User;

import java.util.List;

public interface UserDao {
    void add(User user);
    void update(User user);
    void delete(User user);

    User get(String password);
    List<User> getAll();


}
