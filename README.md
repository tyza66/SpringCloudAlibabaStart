# SpringCloudAlibabaStart
### Spring Cloud Alibaba 入门  

- Step1：手写分布式请求处理调用实现消费同时减少库存（order，stock）
- Step2：Spring Cloud Alibaba环境搭建
- Step3：Nacos注册中心（支持CP和AP）（order-nacos，stock-nacos）
- Step4：Nacos集群部署（不能忘记在config文件夹中配置mysql数据库）
- Step5：Ribbon负载均衡策略（order-ribbon）
- Step5：自定义Ribbin负载均衡策略（order-ribbon）
- Step6：Spring Cloud官方提供的LoadBalancer（order-loadbalancer）
- Step7：微服务调用组件Feign/OpenFeign（order-openfeign）
- Step8：OpenFeign中的自定义配置（order-openfeign，product-nacos）
- Step9：Nacos配置中心（config-nacos）
- Step10：Sentinel服务高可用、容错机制（了解代码，使用控制台）（order-sentinel）
- Step11：Sentinel的各种配置（order-sentinel）
- Step12：Sentinel整合OpenFeign（order-openfeign-sentinel，stock-nacos）
- Step13：Sentinel热点参数流控（order-sentinel）
- Step13：Sentinel持久化（order-sentinel）
- Step14：分布式事务Seata（AT模式，二阶段提交协议prepare，commit）（文件存储选择db，配置中心和注册中心选择nacos）（seata-t1，seata-t2）
- Step15：Gateway网关（各种断言工厂，过滤器工厂，跨域）（gateway，order-nacos，跨域测试用的网页）
- Step16：Gateway结合Sentinel流控降级（了解代码，使用控制台）
- Step17：SkyWalking链路追踪
- 另一种RPC实现方法：https://github.com/tyza66/DubboPlay
- Seata+Dubbo：https://github.com/tyza66/SeataReview-Dubbo

By：tyza66(洮羱芝闇)
