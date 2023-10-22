


package simpledemo;


public class SpringTest1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        //初始化Spring容器，加载applicationContext.xml文件
        //ApplicationContext ctx= new ClassPathXmlApplicationContext("bean.xml");


        //通过容器获取配置中的Shape的实例
        //Shape s = (Shape)ctx.getBean("sShape");
        Shape s = new Square();
        s.draw();

    }

}
