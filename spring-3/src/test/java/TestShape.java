import com.test.Circle;
import com.test.Square;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestShape {
    public static void main(String[] args) {
    	
//    	Shape shape = new Circle();
//    	shape.draw();
    	
//    	Shape shape0 = new Square();
//    	shape0.draw();
    	ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
    	Circle circle = (Circle) ctx.getBean("circle");
    	circle.draw();
    	
    	Square square = (Square) ctx.getBean("square");
    	
    	square.draw();
    	
    }
}
