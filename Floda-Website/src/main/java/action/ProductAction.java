package action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.util.ValueStack;
import dao.ImgDao;
import dao.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import pojo.Product;

/**
 * @Auther: zayvion
 * @Date: 2019-08-07 14:07
 * @Description:前台商品相关action
 */
@Controller
@Scope("prototype")
public class ProductAction extends BaseAction {
    @Autowired
    private ProductDao productDao;
    @Autowired
    private ImgDao imgDao;
    private int id;

    public String productDetail(){
        Product product = productDao.getProduct(id);
        System.out.println(product);

        ValueStack valueStack = ActionContext.getContext().getValueStack();
        valueStack.set("pro_name",product.getPro_name());
        valueStack.set("pro_price",product.getPro_price());
        valueStack.set("pro_desc",product.getPro_desc());
        valueStack.set("proImgUrl",imgDao.getImgUrl(product.getPro_imgId()));
        return DETAIL;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
