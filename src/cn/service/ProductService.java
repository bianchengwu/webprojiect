package cn.service;

import cn.dao.ProductDao;
import cn.model.Product;

//ProductService ->ProductDao->JdbcUtils->db数据库
public class ProductService {
    //编写一个方法调用Dao完成数据库的入库操作
    private ProductDao productDao = new ProductDao();
    public void save(Product product){
        productDao.save(product);
    }
}
