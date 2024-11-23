package LionTests;

import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class SingleLionTests {



    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Mock
    Feline felineMock;

    @Test
    public void getExceptionMessageTest(){
        final String wrongSexInput = "Используйте допустимые значения пола животного - самей или самка";
        try {
            Lion lion = new Lion("фыв",felineMock);
            lion.getKittens();
            fail("Expected an Exception to be thrown");
        } catch (Exception e) {
            assertEquals(wrongSexInput,e.getMessage());
        }
    }
}
