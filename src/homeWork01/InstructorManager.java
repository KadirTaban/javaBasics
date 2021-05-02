package homeWork01;

public class InstructorManager extends UserManager {
    @Override
    public void add(User user) {
            System.out.println(user.getFirstName()+"isimli eğitmen eklendi");
    }
    @Override
    public void delete(User user) {
            System.out.println(user.getFirstName() + "isimli eğitmen silindi");
    }
    @Override
    public void update(User user) {
            System.out.println(user.getFirstName() + "isimli eğitmen güncellendi");
    }
}
