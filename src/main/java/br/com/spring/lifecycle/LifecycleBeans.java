package br.com.spring.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class LifecycleBeans implements InitializingBean, DisposableBean, BeanNameAware,
        BeanFactoryAware, ApplicationContextAware {


    public LifecycleBeans() {
        System.out.println("#01 - Lifecycle Constructor");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("#02 - setBeanName: " + name);

    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("#03 - setBeanFactory");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("#04 - setApplicationContext");
    }


    public void beforeInit() {
        System.out.println("#05 - Before Init - Post Processor");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("#06 - postConstruct annotated method");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("#07 - afterPropertiesSet - InitializingBean(callback)");

    }

    public void afterInit() {
        System.out.println("#08 - After init - Post Processor");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("#09 - preDestroy annotated method");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("#10 - destroy - DisposableBean(Callback)");

    }

}
