package vencimentos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrabalhadorTest {

    @Test
    void calcularVencimento() {
        TrabalhadorHora th = new TrabalhadorHora("aa", 20, 15.0f);
        float expectedVencimento = 300;
        Assertions.assertEquals(expectedVencimento, th.calcularVencimento());

    }

    @Test
    void compareTo() {
    }
}