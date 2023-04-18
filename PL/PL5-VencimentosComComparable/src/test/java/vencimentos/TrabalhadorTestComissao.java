package vencimentos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrabalhadorTestComissao {

    @Test
    void calcularVencimento() {
        TrabalhadorComissao tc = new TrabalhadorComissao("joao", 200.5f, 105.2f, 13.5f);
        float expectedVencimentoPeca = 214.702f;
        Assertions.assertEquals(expectedVencimentoPeca, tc.calcularVencimento());

    }

    @Test
    void compareTo() {

    }
}