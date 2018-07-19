package com.sz.old.test;

import com.sz.old.bean.Girl;
import org.junit.Test;

public class Test1 {

    @Test
    public void m1(){
        Girl girl = new Girl();
        girl.setColor("红色");
        girl.setLuckNum(91);
        girl.setName("范冰冰");

        System.out.println(girl);
    }

}
