package ddl.customer;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.beans.factory.xml.BeanDefinitionParser;
import org.springframework.beans.factory.xml.ParserContext;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;

/**
 * @author dd
 * @version $id: MatrixBeanDefinitionParser.java v 0.1 2018/10/20 下午4:49
 */
public class MatrixBeanDefinitionParser implements BeanDefinitionParser {

    private final Class<?> beanClass;

    private final boolean required;

    /**
     * @param beanClass
     * @param required
     */
    public MatrixBeanDefinitionParser(Class<?> beanClass, boolean required) {
        this.beanClass = beanClass;
        this.required = required;
    }

    /**
     * @param element
     * @param parserContext
     * @return
     */
    public BeanDefinition parse(Element element, ParserContext parserContext) {
        return parse(element, parserContext, beanClass, required);
    }

    /**
     * @param element
     * @param parserContext
     * @param beanClass
     * @param required
     * @return
     */
    private BeanDefinition parse(Element element, ParserContext parserContext, Class<?> beanClass, boolean required) {
        RootBeanDefinition beanDefinition = new RootBeanDefinition();

        beanDefinition.setBeanClass(beanClass);
        beanDefinition.setLazyInit(false);

        String id = element.getAttribute("id");

        if (!StringUtils.isEmpty(id)) {
            parserContext.getRegistry().registerBeanDefinition(id, beanDefinition);
            beanDefinition.getPropertyValues().add("id", id);
        }

        String description = element.getAttribute("description");

        if (!StringUtils.isEmpty(description)) {
            beanDefinition.getPropertyValues().add("description", description);
        }

        return beanDefinition;
    }
}