package com.gz.test;

import org.apache.log4j.Logger;
import org.junit.Test;

public class TestJunti {
    /**
     * log4j
     */
    private Logger log4j=Logger.getLogger(TestJunti.class);
    @Test
    public void test(){
        log4j.debug("log4j方法的开始..");
//        log4j.warn();
//        log4j.info();
//        log4j.error();
//        log4j.fatal();
        System.out.println("ojbk");
    }

}
