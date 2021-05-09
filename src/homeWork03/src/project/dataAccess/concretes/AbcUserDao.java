package homeWork03.src.project.dataAccess.concretes;

import homeWork03.src.project.dataAccess.abstracts.UserDao;
import homeWork03.src.project.entities.concretes.User;

import java.util.List;

public class AbcUserDao implements UserDao {
    private List<User> users;

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
    public boolean Login(String email, String password) {
            for (User user : users){
                if (user.geteMail() == email && user.getPassword() == password)
                    return true;
            }
        return false;
    }

    @Override
    public User get(String password) {
        return null;
    }


    @Override
    public List<User> getAll() {
        return this.users;
    }


}
