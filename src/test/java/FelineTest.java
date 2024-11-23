import com.example.Feline;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest {
    @Test
    public void eatMeatReturnPredatorListOfFoodTest() throws Exception {
        Feline feline = new Feline();
        List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");

        List<String> actualResult = feline.eatMeat();
        System.out.printf("actualResult = %s%n", actualResult);

        assertEquals(expectedResult,actualResult);

    }

    @Test
    public void getFamilyReturnFelineTest() {
        Feline feline = new Feline();
        String expectedResult = "Кошачьи";

        String actualResult= feline.getFamily();
        System.out.printf("actualResult = %s%n", actualResult);

        assertEquals(expectedResult,actualResult);

    }

    @Test
    public void getKittensReturnOneKittenTest() {
        Feline feline = new Feline();
        int expectedResult = 1;

        int actualResult= feline.getKittens();
        System.out.printf("actualResult = %s%n", actualResult);

        assertEquals(expectedResult,actualResult);

    }

    @Test
    public void getKittensReturnFiveTest() {
        Feline feline = new Feline();
        int expectedResult = 5;

        int actualResult= feline.getKittens(5);
        System.out.printf("actualResult = %s%n", actualResult);

        assertEquals(expectedResult,actualResult);

    }


}
