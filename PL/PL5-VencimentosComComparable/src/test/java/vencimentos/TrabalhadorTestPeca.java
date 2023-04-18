package vencimentos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrabalhadorTestPeca {

    @Test
    void calcularVencimento() {
        TrabalhadorPeca tp = new TrabalhadorPeca("aa", 2, 6);
        float expectedVencimentoPeca = 151;
        Assertions.assertEquals(expectedVencimentoPeca, tp.calcularVencimento());
    }

    @Test
    void compareTo() {
    }
}