import com.seele.demo.BookService;
import com.seele.demo.BooksMapper;


import com.seele.demo.books;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

public class BookServiceMockTest {
    @InjectMocks
    BookService bookservice;
    @Mock
    BooksMapper booksMapper;
    @BeforeEach
    public void setup(){
        System.out.println("1111");
        MockitoAnnotations.initMocks(this);
        ArrayList<books> list =new ArrayList<books>();
        list.add(new books(1,"龙珠","鸟山明"));
        list.add(new books(2,"剑豪生死斗","山口贵由"));
        //创建mock对象
        Mockito.when(booksMapper.getBooks()).thenReturn(list);
    }

    /**
     * 测试获取所有books
     *
     */
    @Test
    void getAllBooks() {

        List<books> allBooks = bookservice.getAllBooks();
        System.out.println(allBooks);


    }
}
