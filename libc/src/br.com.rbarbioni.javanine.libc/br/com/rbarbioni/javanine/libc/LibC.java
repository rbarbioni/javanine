package br.com.rbarbioni.javanine.libc;

import br.com.rbarbioni.javanine.libb.LibB;

import java.util.logging.Logger;

public class LibC {

    private static final Logger LOGGER = Logger.getLogger(LibC.class.getName());
    public void test (){
        LOGGER.info("LibC.test");
        new LibB().test();
    }
}
