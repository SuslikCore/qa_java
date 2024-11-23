package animal;
import com.example.Animal;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SingleAnimalTests {

    @Test
    public void getFamilyReturnInfoTest () {
        Animal animal = new Animal();
        String expectedResult = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";

        String actualResult = animal.getFamily();

        assertEquals(expectedResult, actualResult);
    }

    @Test(expected = Exception.class)
    public void getAnExceptionMessageTest() throws Exception {
            Animal animal = new Animal();
            animal.getFood("asd");
        }
    }