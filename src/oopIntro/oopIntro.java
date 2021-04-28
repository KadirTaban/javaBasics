package oopIntro;

public class oopIntro {

    public static void main(String[]args) {

        Product product1= new Product();//ornek olusturma,referans olusturma,instance olusturma
        product1.id =1 ;
        product1.name="Lenovo V14";
        product1.unitPrice= 15000;
        product1.detail = "16 GB RAM";


        Product product2= new Product();//ornek olusturma,referans olusturma,instance olusturma
        product1.id =2 ;
        product1.name="Lenovo V15";
        product1.unitPrice= 16000;
        product1.detail = "32 GB RAM";

        Product product3= new Product();//ornek olusturma,referans olusturma,instance olusturma
        product1.id =3 ;
        product1.name=" Hp ";
        product1.unitPrice= 8000;
        product1.detail = "8 GB RAM";

        Product[] products={product1,product2,product3};


        System.out.println(products.length);

    }
}
