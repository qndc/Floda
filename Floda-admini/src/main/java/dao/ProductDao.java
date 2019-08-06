package dao;

import pojo.Img;
import pojo.Product;

import java.util.List;

/**
 * @Auther: zayvion
 * @Date: 2019-08-05 14:44
 * @Description:商品Dao接口类
 */
public interface ProductDao {
    /**
     * 添加商品
     *
     * @param product
     */
    void addProduct(Product product);

    /**
     * 更新商品
     *
     * @param product
     */
    void updateProduct(Product product);

    /**
     * 展示所有商品
     *
     * @return list
     */
    List<Product> getProducts();

    /**
     * 获取商品总数
     *
     * @return int
     */
    int getProductCount();

    /**
     * 获取一个商品
     *
     * @param id
     * @return product
     */
    Product getProduct(int id);

    /**
     * 更新图片地址
     *
     * @param img
     */
    void updateProductImg(Img img);
}
