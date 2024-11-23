package AnimalTests;
import com.example.Animal;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;


public class SingleAnimalTests {

    @Test
    public void getFamilyReturnInfoTest () {
        Animal animal = new Animal();
        String expectedResult = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";

        String actualResult = animal.getFamily();
        System.out.println(String.format("actualResult = %s", actualResult));

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void getAnExceptionMessageTest() {
        try {
            Animal animal = new Animal();
            animal.getFood("asd");
            fail("Expected an Exception to be thrown");
        } catch (Exception e) {
            System.out.println(String.format("Текст ошибки - %s", e.getMessage()));
            assertEquals("Неизвестный вид животного, используйте значение Травоядное или Хищник",e.getMessage());

        }
    }
}