package homeWork01;

public class UserManager {

    public void add(User user) {
        System.out.println(user.getFirstName() + "kullanıcısı eklendi. ");
    }
    public void delete(User user) {
        System.out.println(user.getFirstName() + "Kullanıcı silindi");
    }

    public void update(User user){
        System.out.println(user.getFirstName() + " kullanıcısı güncellendi.");
    }


}
