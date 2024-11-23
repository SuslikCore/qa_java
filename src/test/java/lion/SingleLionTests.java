package lion;
import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class SingleLionTests {

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Mock
    Feline felineMock;

    @Test(expected = Exception.class)
    public void getExceptionMessageTest() throws Exception {
            Lion lion = new Lion("asd",felineMock);
            lion.getKittens();
        }
    }
