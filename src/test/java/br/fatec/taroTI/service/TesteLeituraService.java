package br.fatec.taroTI.service;

import br.fatec.taroTI.repositorios.CartaRepo;
import com.google.common.collect.Range;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

import java.util.Random;
import java.util.stream.Stream;

class TesteLeituraService {

    @Spy
    private LeituraService spy;

    @Mock
    private CartaRepo cartaRepo;

    private AutoCloseable autoCloseable;

    @BeforeEach
    void setUp() {
        autoCloseable = MockitoAnnotations.openMocks(this);
    }

    @AfterEach
    void tearDown() throws Exception {
        if (autoCloseable != null)
            autoCloseable.close();
    }

    private static Stream<Arguments> testeGetValor() {

        Random random = new Random();
        return Stream.of(
                Arguments.of(random, 0, Range.closed(0, 21)),
                Arguments.of(random, 1, Range.closed(1, 14)),
                Arguments.of(random, 2, Range.closed(1, 14)),
                Arguments.of(random, 3, Range.closed(1, 14)),
                Arguments.of(random, 4, Range.closed(1, 14))
        );
    }

    @ParameterizedTest
    @MethodSource
    void testeGetValor(Random random, int naipe, Range<Integer> valoresAceitaveis) {
        for (int i = 0; i<10; i++) {
            int valorResult = spy.getValor(random, naipe);
            Assertions.assertTrue(valoresAceitaveis.contains(valorResult));
        }
    }

}