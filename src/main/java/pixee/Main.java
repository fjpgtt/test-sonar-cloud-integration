package main.java.pixee;

import java.util.logging.Logger;

public class Main {

private static final String HELLO_WORLD = "Hello world!";

    private static int myIntegerValue;

    public static void main(String[] args) {
        System.out.println(HELLO_WORLD);
        System.out.println(HELLO_WORLD);
        System.out.println(HELLO_WORLD);


        myIntegerValue = Integer.valueOf("3").intValue();
    }

    public void log(){
        logger.info(String.format("Processing annotations %d", myIntegerValue));

    }

    private static final Logger logger = Logger.getLogger(Main.class.getName());
}
