package org.apache.rocketmq.namesrv;

import org.apache.rocketmq.common.MixAll;

public class A {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println(1);
        System.out.println("Java类路径:" + System.getProperty("java.class.path"));
        System.out.println(System.getenv("JAVA_HOME"));
        System.out.println(System.getProperty(MixAll.ROCKETMQ_HOME_ENV));
        System.out.println(System.getProperty(System.getenv(MixAll.ROCKETMQ_HOME_ENV)));
    }

}
