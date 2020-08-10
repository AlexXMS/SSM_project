import com.zm.pojo.Books;
import com.zm.service.BookMapperService;
import javafx.application.Application;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTest {

    @Test
    public void testConfig(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContent.xml");
        BookMapperService bookServiceImp = (BookMapperService) context.getBean("BookServiceImp");
        List<Books> list = bookServiceImp.queryBookName("M");
        System.out.println(list);
    }
}
