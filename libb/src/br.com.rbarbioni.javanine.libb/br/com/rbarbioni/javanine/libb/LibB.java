package br.com.rbarbioni.javanine.libb;

import br.com.rbarbioni.javanine.liba.LibA;
import br.com.rbarbioni.javanine.libc.LibC;

import java.util.logging.Logger;

public class LibB {

    private static final Logger LOGGER = Logger.getLogger(LibC.class.getName());

    public void test(){
        LOGGER.info("LibB.test");
        new LibA().test();
    }
}
