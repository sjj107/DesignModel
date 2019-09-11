package com.sjj.adapter.objectAdapter;

import com.sjj.adapter.classadapter.MicroUSB;
import com.sjj.adapter.classadapter.TypeC;

/**
 * @Description 对象适配器
 * @Author sjj
 * @Date 2019/9/11 22:25
 */
public class Adapter implements MicroUSB {
    private TypeC typeC;
    public Adapter(TypeC typeC){
        this.typeC = typeC;
    }
    @Override
    public void isMicroUSB() {
        typeC.isTypeC();
    }
}
