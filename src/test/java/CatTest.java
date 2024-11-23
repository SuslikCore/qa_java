import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    Feline felineMock;
    @Test
    public void getSoundReturnMeowTest(){
        Cat cat = new Cat(felineMock);
        String expectedResult = "Мяу";

        String actualResult = cat.getSound();

        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void getFoodReturnPredatorListOfFoodTest() throws Exception {
        Cat cat = new Cat(felineMock);
        List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");

        Mockito.when(felineMock.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> actualResult = cat.getFood();

        assertEquals(expectedResult,actualResult);
    }
}
