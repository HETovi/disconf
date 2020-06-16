package com.baidu.disconf.web.service.zookeeper.config;

/**
 * @author liaoqiqi
 * @version 2014-6-24
 */
public class ZooConfig {

    private String zooHosts = "";

    public String zookeeperUrlPrefix = "";

    //add by hetw25334
    //微服务注册中心ACL设置
    private String addAuth = "";

    //add by hetw25334
    //注册中心ACL加密方式 默认digest
    private String scheme = "";

    public String getAddAuth() {
        return addAuth;
    }

    public void setAddAuth(String addAuth) {
        this.addAuth = addAuth;
    }

    public String getScheme() {
        return scheme;
    }

    public void setScheme(String scheme) {
        this.scheme = scheme;
    }

    public String getZooHosts() {
        return zooHosts;
    }

    public void setZooHosts(String zooHosts) {
        this.zooHosts = zooHosts;
    }

    public String getZookeeperUrlPrefix() {
        return zookeeperUrlPrefix;
    }

    public void setZookeeperUrlPrefix(String zookeeperUrlPrefix) {
        this.zookeeperUrlPrefix = zookeeperUrlPrefix;
    }
}
