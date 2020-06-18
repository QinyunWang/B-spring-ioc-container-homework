# Spring - IOC

## Problem 1

@Component 已经可以支持声明一个 bean 了，为何还要再弄个 @Bean 出来？

`@Component` 和 `@Bean` 的区别:

`@Component` 用于自动检测和使用类路径扫描自动配置bean。注释类和bean之间存在隐式的一对一映射（即每个类一个bean）

`@Bean` 用于显式声明单个bean，而不是让Spring像上面那样自动执行它。它将bean的声明与类定义分离，并允许精确地创建和配置bean

Bean的使用场景：
- 第三方库，假如要使用第三方的库不是用Spring编写的，在没有源代码的情况下无法使用`@Component`进行装配，这时使用`@Bean`就比较合适了
- Bean的具体实现依赖于某个参数