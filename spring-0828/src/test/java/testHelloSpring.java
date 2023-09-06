import com.ssm.HelloSpring;
import com.ssm.Shape;
import lombok.extern.java.Log;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

/**
 * @author 韩德康~
 * @version 1.0
 * @time 2023/08/28/9:43
 */
@Log
@Service
public class testHelloSpring {

    @Test
    public void test01() {
        log.info("----------");
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        ApplicationContext ctx2 = new FileSystemXmlApplicationContext("applicationContext.xml");
        HelloSpring hello = (HelloSpring) ctx.getBean("helloSpring");
        log.info("----------");

    }

    @Test
    public void test02() {
        Resource resource = new ClassPathResource("applicationContext.xml");
        BeanFactory beanFactory = new XmlBeanFactory(resource);
        HelloSpring helloSpring = (HelloSpring) beanFactory.getBean("helloSpring");
        helloSpring.show();

    }

    @Test
    public void test03() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Shape circle = (Shape) context.getBean("circle");
        Shape square = (Shape) context.getBean("square");
        square.draw();

        circle.draw();
    }
}
