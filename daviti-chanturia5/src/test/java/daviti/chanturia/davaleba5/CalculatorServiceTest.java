package daviti.chanturia.davaleba5;

import daviti.chanturia.davaleba5.service.CalculatorService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorServiceTest {

    @Autowired
    CalculatorService calculatorService;


    @Test
    void multiplicationTest(){
        int excepted = 20;
        int actual;
        actual = calculatorService.multiplication(10, 2);
        assertEquals(excepted, actual);
    }


}