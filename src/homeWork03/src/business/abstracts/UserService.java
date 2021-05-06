package homeWork03.src.business.abstracts;

import homeWork03.src.entities.concretes.User;

import java.util.List;

public interface UserService {


    void add(User user);

    List<User> getAll();

    public interface ProductService {
        void add(User user);

        List<User> getAll();

    }


}
