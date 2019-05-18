package ddl.customer;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * 定义命名空间处理器
 *
 * @author dd
 * @version $id: MatrixNamespaceHandler.java v 0.1 2018/10/20 下午4:43
 */
public class MatrixNamespaceHandler extends NamespaceHandlerSupport {

    public void init() {
        registerBeanDefinitionParser("dd", new MatrixBeanDefinitionParser(Matrix.class, true));
    }
}
