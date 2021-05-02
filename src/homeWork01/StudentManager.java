package homeWork01;

public class StudentManager extends  UserManager{
    @Override
    public void add(User user) {
        System.out.println(user.getFirstName()+"İsimli öğrenci eklendi");
    }
    @Override
    public void delete(User user) {
        System.out.println(user.getFirstName()+"İsimli öğrenci çıkarıldı");
    }
    @Override
    public void update(User user) {
        System.out.println(user.getFirstName()+"İsimli öğrenci eklendi");
    }
}
