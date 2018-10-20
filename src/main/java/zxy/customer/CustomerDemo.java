package zxy.customer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 张晓鱼
 * @version $id: CustomerDemo.java v 0.1 2018/10/20 下午5:08
 */
public class CustomerDemo {
    /**
     * @param args
     */
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:matrix.xml");

        Matrix matrix = (Matrix) context.getBean("zxy");

        System.out.println(String.format("description: %s", matrix.getDescription()));
    }
}
