import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class mainTest {
    @Test
    public void teste1() {
        String[] teste = new String[] {"tatiana", "Aline zenon", "tatiana", "walter Azevedo", "lucas suzuki", "tatiana", "tatiana", "lucas suzuki"};
        String[] exp = new String[] {"Azevedo, Walter", "Suzuki, Lucas", "Suzuki, Lucas", "Tatiana", "Tatiana", "Tatiana", "Tatiana", "Zenon, Aline"};
        String[] saida = main.resposta(teste);
        System.out.println("SAIDA");
        System.out.println(Arrays.toString(saida));
        System.out.println("ESPERADO");
        System.out.println(Arrays.toString(exp));
        Assertions.assertArrayEquals(saida, exp);
    }
}
