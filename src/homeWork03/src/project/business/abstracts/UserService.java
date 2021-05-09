package homeWork03.src.project.business.abstracts;

import homeWork03.src.project.entities.concretes.User;

import java.util.List;

public interface UserService {


    void add(User user);

    List<User> getAll();

    public interface ProductService {
        void add(User user);

        List<User> getAll();

    }


}
