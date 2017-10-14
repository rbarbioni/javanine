package br.com.rbarbioni.javanine.app;

import br.com.rbarbioni.javanine.libc.LibC;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.logging.Logger;

public class Main {

    private static final Logger LOGGER = Logger.getLogger(LibC.class.getName());

    public static void main(String[] args){
        LOGGER.info("Main.main");
        new LibC().test();
    }
}
