package com.xiaoli.consumer.spi;

import org.apache.dubbo.common.extension.SPI;

@SPI
public interface MyInterface {

    int getPort();
}
