import com.animal.Animal;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 韩德康~
 * @version 1.0
 * @time 2023/09/04/9:35
 */
public class test {
    @Test
    public void test01(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Animal dog = (Animal) context.getBean("dog");
        Animal cat = (Animal) context.getBean("cat");
        dog.eat();
        dog.work();
        cat.eat();
        cat.work();

    }
}
