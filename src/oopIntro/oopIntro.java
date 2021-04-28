package oopIntro;

public class oopIntro {

    public static void main(String[]args) {

        Product product1= new Product();//ornek olusturma,referans olusturma,instance olusturma
        product1.id =1 ;
        product1.name="Lenovo V14";
        product1.unitPrice= 15000;
        product1.detail = "16 GB RAM";


        Product product2= new Product();
        product2.id =2 ;
        product2.name="Lenovo V15";
        product2.unitPrice= 16000;
        product2.detail = "32 GB RAM";

        Product product3= new Product();
        product3.id =3 ;
        product3.name=" Hp ";
        product3.unitPrice= 8000;
        product3.detail = "8 GB RAM";

        Product[] products={product1,product2,product3};

        for (Product product: products) {
            System.out.println(product.name);
        }

        System.out.println(products.length);

        Category category1 = new Category();
        category1.id=1;
        category1.name="Bilgisayar";

        Category category2 = new Category();
        category2.id=1;
        category2.name="Ev/Bahçe";

    }
}
