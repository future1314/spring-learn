package zxy.customer;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * 定义命名空间处理器
 *
 * @author 张晓鱼
 * @version $id: MatrixNamespaceHandler.java v 0.1 2018/10/20 下午4:43
 */
public class MatrixNamespaceHandler extends NamespaceHandlerSupport {

    public void init() {
        registerBeanDefinitionParser("matrix", new MatrixBeanDefinitionParser(Matrix.class, true));
    }
}
