package org.linlinjava.litemall.allinone;

import org.junit.Test;

import java.net.InetAddress;
import java.net.UnknownHostException;


public class T {
    @Test
    public void te() {
        InetAddress ia=null;
        try {
            ia = ia.getLocalHost();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        String localname = ia.getHostName();
        String localip = ia.getHostAddress();
        System.out.println("本机名称是：" + localname);
        System.out.println("本机的ip是 ：" + localip);
    }
}
