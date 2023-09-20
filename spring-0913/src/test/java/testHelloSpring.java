import com.ssm.HelloSpring;
import com.ssm.Shape;
import com.ssm.entity.AdminInfo;
import com.ssm.entity.Person;
import com.ssm.entity.User;
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
    ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
    @Test
    public void test01() {
        log.info("----------");
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        ApplicationContext ctx2 = new FileSystemXmlApplicationContext("applicationContext.xml");
        HelloSpring hello = (HelloSpring) this.ctx.getBean("helloSpring");
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
    @Test
    public void test04(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        AdminInfo adminInfo = (AdminInfo) ctx.getBean("adminInfo");
        System.out.println(adminInfo);
    }
    @Test
    public void test05(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = (User) context.getBean("user");
        System.out.println(user);
    }
    @Test
    public void test06(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person = (Person) context.getBean("person");
        System.out.println(person);
    }
    @Test
    public void test07(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        AdminInfo adminInfo = (AdminInfo) context.getBean("adminInfo");
        System.out.println(adminInfo);
        System.out.println("*******************");
        AdminInfo admin = (AdminInfo) context.getBean("admin");
        System.out.println(admin);
    }
}
