package AnimalTests;
import com.example.Animal;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.List;
import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class ParameterizedAnimalTest {

    private final String animalType;
    private final List<String> foodType;

    public ParameterizedAnimalTest(String animalType, List<String> foodType) {
        this.animalType = animalType;
        this.foodType = foodType;
    }

    @Parameterized.Parameters
    public static Object[][] getDate(){
        return new Object[][]{
                {"Травоядное",List.of("Трава", "Различные растения")},
                {"Хищник",List.of("Животные", "Птицы", "Рыба")}
        };
    }

    @Test
    public void getFoodTest() throws Exception {
        Animal animal = new Animal();
        List<String> expectedResult = foodType;

        List<String> actualResult = animal.getFood(animalType);
        System.out.printf("actualResult = %s%n", actualResult);

        assertEquals(expectedResult, actualResult);
    }
}