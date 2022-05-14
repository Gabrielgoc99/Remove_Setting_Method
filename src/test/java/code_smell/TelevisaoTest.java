package code_smell;

import static org.junit.jupiter.api.Assertions.*;

class TelevisaoTest {

    @org.junit.jupiter.api.Test
    void cadastrarTelevisao() {
        Televisao televisao = new Televisao();
            televisao.setMarca("Samsung");
            televisao.setModelo("u300");
            televisao.setTamanho(50);
            televisao.setValor(2599.0f);

            assertEquals("Televisao{" +
                    "marca='Samsung" +  '\'' +
                    ", modelo='u300" +  '\'' +
                    ", valor=2599.0" +
                    ", tamanho=50" +
                    '}', televisao.cadastrarTelevisao());
    }
}