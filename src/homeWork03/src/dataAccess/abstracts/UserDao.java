package homeWork03.src.dataAccess.abstracts;

import homeWork03.src.entities.concretes.User;

import java.util.List;

public interface UserDao {
    void add(User user);
    void update(User user);
    void delete(User user);

    User get(String password);
    List<User> getAll();


}
