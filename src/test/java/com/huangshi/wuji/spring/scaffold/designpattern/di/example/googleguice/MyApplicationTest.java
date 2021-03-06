package com.huangshi.wuji.spring.scaffold.designpattern.di.example.googleguice;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.huangshi.wuji.spring.scaffold.designpattern.di.example.di.service.MessageService;
import com.huangshi.wuji.spring.scaffold.designpattern.di.example.googleguice.consumer.MyGoogleGuiceConsumer;
import com.huangshi.wuji.spring.scaffold.designpattern.di.example.googleguice.service.MockMessageService;
import com.huangshi.wuji.spring.scaffold.ioc.component.MyApplication;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

public class MyApplicationTest {

    private Injector injector;

    @Before
    public void setUp() throws Exception {
        injector = Guice.createInjector(new AbstractModule() {

            @Override
            protected void configure() {
                bind(MessageService.class).to(MockMessageService.class);
            }
        });
    }

    @After
    public void tearDown() throws Exception {
        injector = null;
    }

//    @Test
//    public void test() {
//        MyApplication appTest = injector.getInstance(MyGoogleGuiceConsumer.class);
//        Assert.assertEquals(true, appTest.sendMessage("Hi Pankaj", "pankaj@abc.com"));;
//    }
}
