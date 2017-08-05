package com.bogovich.didemo;

import com.bogovich.didemo.controllers.ConstructorInjectedController;
import com.bogovich.didemo.controllers.GetterInjectedController;
import com.bogovich.didemo.controllers.MyController;
import com.bogovich.didemo.controllers.PropertyInjectedController;
import com.bogovich.didemo.examplebeans.FakeDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

        System.out.println(ctx.getBean(FakeDataSource.class).toString());
//		MyController controller = (MyController) ctx.getBean("myController");
//        System.out.println(controller.hello());
//        System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
//        System.out.println(ctx.getBean(GetterInjectedController.class).sayHello());
//        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
    }
}
