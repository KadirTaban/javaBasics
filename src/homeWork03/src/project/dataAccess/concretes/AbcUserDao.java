package homeWork03.src.project.dataAccess.concretes;

import homeWork03.src.project.dataAccess.abstracts.UserDao;
import homeWork03.src.project.entities.concretes.User;

import java.util.List;

public class AbcUserDao implements UserDao {
    @Override
    public void add(User user) {
        System.out.println("Abc ile eklendi"+user.getName());
    }

    @Override
    public void update(User user) {

    }

    @Override
    public void delete(User user) {

    }

    @Override
    public User get(String password) {
        return null;
    }

    @Override
    public List<User> getAll() {
        return null;
    }
}