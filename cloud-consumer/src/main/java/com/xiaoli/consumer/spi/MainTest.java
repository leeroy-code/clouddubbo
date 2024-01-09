package com.xiaoli.consumer.spi;

import org.apache.dubbo.common.extension.ExtensionLoader;
import org.apache.dubbo.rpc.model.ApplicationModel;

import java.util.List;

public class MainTest {

    public static void main(String[] args) {
        ApplicationModel applicationModel = ApplicationModel.defaultModel();
        ExtensionLoader<MyInterface> extensionLoader = applicationModel.getExtensionLoader(MyInterface.class);
        List<MyInterface> myInterface = extensionLoader.getLoadedExtensionInstances();
        myInterface.stream().forEach(myInterface1 -> {
            System.out.println(myInterface1.getPort());
        });

    }
}
