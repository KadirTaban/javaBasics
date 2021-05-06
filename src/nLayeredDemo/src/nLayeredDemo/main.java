package nLayeredDemo.src.nLayeredDemo;

import nLayeredDemo.src.nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.src.nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.src.nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import nLayeredDemo.src.nLayeredDemo.entities.concretes.Product;

public class main {

    public static void main(String[] args){
// ToDo: Spring IoC ile çözülecek.
        ProductService productService = new ProductManager(new HibernateProductDao());
        //entity dışında new yaparsan illa hata alırsın ama bunu Spring IoC ile cozecegiz.
        //interfaceler somut sınıfların referansını tutar
        Product product=new Product(1,2,"Elma",12,50);
        productService.add(product);



    }
}
