package umg.edu.gt.test.ClaseArrays;

import static org.junit.jupiter.api.Assertions.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import umg.edu.gt.desarrollo.estructuradedatos2025.EstructuraDeDatos2025;
import umg.edu.gt.desarrollo.estructuradedatos2025.ejercicios.EjercicioArrays;

class ClaseArrays {
    private static final Logger logger = LogManager.getLogger(EstructuraDeDatos2025.class);

    @Test
    void testRiquezaMaxima() {
        assertEquals(6, EjercicioArrays.riquezaMaxima(new int[][]{{1,2,3},{3,2,1}}));
        assertEquals(10, EjercicioArrays.riquezaMaxima(new int[][]{{1,5},{7,3},{3,5}}));
        assertEquals(17, EjercicioArrays.riquezaMaxima(new int[][]{{2,8,7},{7,1,3},{1,9,5}}));
    }

    @Test
    void testOrdenarDiagonales() {
        int[][] entrada1 = {{3,3,1,1},{2,2,1,2},{1,1,1,2}};
        int[][] salidaEsperada1 = {{1,1,1,1},{1,2,2,2},{1,2,3,3}};
        assertArrayEquals(salidaEsperada1, EjercicioArrays.ordenarDiagonales(entrada1));

        int[][] entrada2 = {
                {11,25,66,1,69,7},
                {23,55,17,45,15,52},
                {75,31,36,44,58,8},
                {22,27,33,25,68,4},
                {84,28,14,11,5,50}
        };
        int[][] salidaEsperada2 = {
                {5,17,4,1,52,7},
                {11,11,25,45,8,69},
                {14,23,25,44,58,15},
                {22,27,31,36,50,66},
                {84,28,75,33,55,68}
        };
        assertArrayEquals(salidaEsperada2, EjercicioArrays.ordenarDiagonales(entrada2));
    }

    @Test
    void testSumaMatriz() {
        assertEquals(45, EjercicioArrays.sumaMatriz(new int[][]{{1,2,3},{4,5,6},{7,8,9}}));
        assertEquals(100, EjercicioArrays.sumaMatriz(new int[][]{{10,20},{30,40}}));
    }

    @Test
    void testFalloForzado() {
        assertNotEquals(50, EjercicioArrays.sumaMatriz(new int[][]{{1,2,3},{4,5,6},{7,8,9}}));
    }
}

