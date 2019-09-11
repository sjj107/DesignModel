package com.sjj.adapter.objectAdapter;

import com.sjj.adapter.classadapter.MicroUSB;
import com.sjj.adapter.classadapter.TypeC;
import com.sjj.adapter.classadapter.TypeCImpl;

/**
 * @Description TODO
 * @Author sjj
 * @Date 2019/9/11 22:29
 */
public class Main {
    public static void main(String[] args) {
        TypeC typeC = new TypeCImpl();
        MicroUSB microUSB = new Adapter(typeC);
        microUSB.isMicroUSB();
    }
}
