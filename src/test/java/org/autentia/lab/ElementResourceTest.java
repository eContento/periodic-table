package org.autentia.lab;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
class ElementResourceTest {
	
	@Test
    void cuando_POST_de_un_elemento_nuevo_entonces_lo_crea_y_OK_200() {
    }
	
	@Test
    void cuando_POST_de_un_elemento_que_ya_existe_entonces_no_lo_persiste_y_OK_201() {
    }
	
	@Test
    void cuando_PUT_de_un_elemento_nuevo_entonces_NO_lo_crea_y_ERROR_400() {
    }
	
	@Test
    void cuando_PUT_de_un_elemento_existente_entonces_lo_actualiza_y_OK_201() {
    }

	@Test
    void cuando_DELETE_de_un_elemento_existente_entonces_lo_borra_y_OK_200() {
    }

    @Test
    void cuando_DELETE_de_un_elemento_que_NO_existe_entonces_no_borro_nada_pero_OK_200() {
    }

    @Test
    void cuando_GET_de_un_simbolo_que_existe_entonces_devuelve_el_elemento_y_OK_200() {
    }
    
    @Test
    void cuando_GET_de_un_simbolo_que_NO_existe_entonces_ERROR_404() {
    }
}