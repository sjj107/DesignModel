package com.sjj.adapter.classadapter;

/**
 * @Description 用于将MicroUSB接口转化成tytpec接口
 * @Author sjj
 * @Date 2019/9/11 22:19
 */
public class Adapter extends TypeCImpl implements  MicroUSB{
    @Override
    public void isMicroUSB() {
        isTypeC();
    }
}
