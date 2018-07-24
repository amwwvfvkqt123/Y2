package com.sz;

import com.sz.bean.Book;
import com.sz.bean.Fies2;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {

    @Test
    public void m1(){
        ApplicationContext context=new ClassPathXmlApplicationContext("app1.xml");
        Book book = (Book) context.getBean("book");
        Book book1= (Book) context.getBean("book");
        System.out.println(book);
        System.out.println(book1);
        System.out.println(book==book1);
        Book ma=new Book();
        System.out.println(ma==book);

        Book n1 = (Book) context.getBean("book2");
        Book n2= (Book) context.getBean("book2");
        System.out.println(n1==n2);
        Fies2 fies2= (Fies2) context.getBean("food");
        System.out.println(fies2);

        Book id7 = (Book) context.getBean("id7");
        System.out.println(id7);

        ((ClassPathXmlApplicationContext) context).close();


    }

}
