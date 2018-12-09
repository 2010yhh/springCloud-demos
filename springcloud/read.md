1服务发现——Netflix Eureka(Eureka服务器和Eureka客户端)
eureka注册中心实际生产需要高可用
2客服端负载均衡——Netflix Ribbon（主要提供客户侧的软件负载均衡算法）
3断路器——Netflix Hystrix：
在一个分布式系统里，许多依赖不可避免的会调用失败，比如超时、异常等，
如何能够保证在一个依赖出问题的情况下，不会导致整体服务失败，
这个就是Hystrix需要做的事情。Hystrix提供了熔断、隔离、Fallback、cache、监控等功能，
能够在一个、或多个依赖同时出现问题时保证系统依然可用。
4服务网关——Netflix Zuul：
类似nginx，反向代理的功能，权限认证，token合法性校验，灰度验证
实际项目:zuul的高可用通过nginx转发到不同的zuul
zuul限流;
对请求的目标URL进行限流（例如：某个URL每分钟只允许调用多少次）
对客户端的访问IP进行限流（例如：某个IP每分钟只允许请求多少次）
对某些特定用户或者用户组进行限流（例如：非VIP用户限制每分钟只允许调用100次某个API等）
多维度混合的限流。此时，就需要实现一些限流规则的编排机制。与、或、非等关系。
5分布式配置——Spring Cloud Config
6zipkin原理：在服务调用的请求和响应中加入ID,表明上下游请求的关系。利用这些信息，可以可视化地分析服务调用链路和服务间的依赖关系

7.admin服务监控界面



1.cloud-eureka:发现、注册服务
2.cloud-service:提供服务
3.cloud-ribbon；客户端
4.cloud-fegin：客户端，Feign封装了HTTP调用服务方法，使得客户端像调用本地方法那样直接调用方法
5.cloud-zuul：zuul网关
6.cloud-config-server:配置中心服务端(git为例)
7.cloud-config-client:获取配置的接口

8.cloud-fegin2：测试turibne聚合hystrix信息;测试zipkin调用链跟踪

9.cloud-admin-web:admin监控服务端，利用eureka注册中心，也是一个微服务

10.cloud-admin-client:admin监控客户端