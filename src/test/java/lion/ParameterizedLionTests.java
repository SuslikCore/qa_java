package lion;

import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import java.util.List;
import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class ParameterizedLionTests {

    private final String lionSex;
    private final boolean hasMane;
    private final String info;

    public ParameterizedLionTests(String lionSex, boolean hasMane, String info) {
        this.lionSex = lionSex;
        this.hasMane = hasMane;
        this.info = info;
    }

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Parameterized.Parameters()
    public static Object[][] getDate(){
        return new Object[][]{
                {"Самец", true, "У самца есть грива"},
                {"Самка", false, "У самки нет гривы"}
        };
    }
    @Mock
    Feline felineMock;

    @Test
    public void getKittensReturnOneKittenTest() throws Exception {

        Lion lion = new Lion(lionSex,felineMock);
        int expectedResult = 1;

        Mockito.when(felineMock.getKittens()).thenReturn(1);
        int actualResult = lion.getKittens();

        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void doesHaveManeTest() throws Exception {

        Lion lion = new Lion(lionSex,felineMock);
        boolean expectedResult = hasMane;

        boolean actualResult = lion.doesHaveMane();

        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void getFoodReturnCarnivoreTest() throws Exception {

        Lion lion = new Lion(lionSex,felineMock);
        List <String> expectedResult = List.of("Животные", "Птицы", "Рыба");

        Mockito.when(felineMock.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List <String> actualResult = lion.getFood();

        assertEquals(expectedResult,actualResult);
    }
}

