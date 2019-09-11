package com.sjj.adapter.classadapter;

/**
 * @Description 假如我的手机是typec类型的充电口，
 * <br>但是现在却只有个传统的MicroUSB充电线，
 * <br>怎么办？很简单，弄个转换接头，
 * <br>MicroUSB口转化成typec的，问题解决
 * <br>类适配器 :继承实现，静态定义
 * @Author sjj
 * @Date 2019/9/11 22:21
 */
public class Main {
    public static void main(String[] args) {
        MicroUSB microUSB = new Adapter();
        microUSB.isMicroUSB();
    }
}
