package com.tyza66.order;

import com.alibaba.nacos.client.naming.utils.ThreadLocalRandom;
import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AbstractLoadBalancerRule;
import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.Server;

import javax.print.attribute.standard.PrinterMakeAndModel;
import java.util.List;

/**
 * Author: tyza66
 * Date: 2023/04/22 17:55
 * Github: https://github.com/tyza66
 **/
//自定义负载均衡规则
public class CustomRule extends AbstractLoadBalancerRule {
    public void initWithNiwsConfig(IClientConfig iClientConfig) {

    }

    //返回当前负载均衡要调用的服务的实例
    public Server choose(Object o) {
        ILoadBalancer loadBalancer = this.getLoadBalancer();
        //获得当前请求的服务器实例
        List<Server> servers = loadBalancer.getReachableServers();
        int i = ThreadLocalRandom.current().nextInt(servers.size());

        Server server = servers.get(i);
        /*if(server.isAlive()){
            return server;
        }*/
        return server;
    }
}
