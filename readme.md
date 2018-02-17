# Spring life cycle

Project that aims to understand the spring life cycle.


## Anotations

* @PostConstruct -  After the construction of the bean.

* @PreDestroy - Before the bean is destroyed. 

## Callback

### InitializingBean

* afterPropertiesSet() - Executed after properties are set.

### DisposableBean

* destroy() - Execute during bean destruction.

## Post Processors

* postProcessBeforeInitialization - Before bean initialization.

* postProcessAfterInitialization - After bean initialization.