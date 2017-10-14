package br.com.rbarbioni.javanine.liba;

import br.com.rbarbioni.javanine.libc.LibC;

import java.util.logging.Logger;

public class LibA {

    private static final Logger LOGGER = Logger.getLogger(LibC.class.getName());

    public void test(){
        LOGGER.info("LibA.test");
    }
}
