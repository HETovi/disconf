package com.baidu.disconf.core.common.zookeeper.inner;

import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.zookeeper.KeeperException;

/**
 * @author liaoqiqi
 * @version 2014-6-16
 */
public class ConfigUpdater {

    public static final String PATH = "/config";

    private ResilientActiveKeyValueStore store;
    private Random random = new Random();

    //add by hetw25334
    public ConfigUpdater(String hosts,String scheme,String auth) throws IOException, InterruptedException {
        store = new ResilientActiveKeyValueStore(true);
        store.connect(hosts,scheme,auth);
    }

    public void run(String scheme,String auth) throws InterruptedException, KeeperException {

        while (true) {
            String value = random.nextInt(100) + "";
            store.write(PATH, value,scheme,auth);
            System.out.printf("Set %s to %s\n", PATH, value);
            TimeUnit.SECONDS.sleep(random.nextInt(10));
        }
    }

    public static void main(String[] args) throws Exception {

        ConfigUpdater configUpdater = new ConfigUpdater(args[0],args[1],args[2]);
        configUpdater.run(args[1],args[2]);
    }
}
