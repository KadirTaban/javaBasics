package oopIntro;

public class oopIntro {

    public static void main(String[]args) {

        Product product1= new Product();//ornek olusturma,referans olusturma,instance olusturma
        product1.id =1 ;
        product1.name="Lenovo V14";
        product1.unitPrice= 15000;
        product1.detail = "16 GB RAM";

        Product[] products={product1};

        System.out.println(products.length);

    }
}
