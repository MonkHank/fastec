package com.flj.latte.app;

import android.app.Application;
import android.content.Context;
import android.os.Handler;

/**
 * 初始化 Configurator，并从 Configurator 获取相应添加项
 * 一次配置即可，即在 application 中配置；
 * Created by  on
 *
 * @author 傅令杰
 * @date 2017/3/29
 */

public final class Latte {

    public static Configurator init(Context context) {
        Configurator.getInstance()
                .getLatteConfigs()
                .put(ConfigKeys.APPLICATION_CONTEXT, context.getApplicationContext());
        return Configurator.getInstance();
    }

    public static Configurator getConfigurator() {
        return Configurator.getInstance();
    }

    public static <T> T getConfiguration(Object key) {
        return getConfigurator().getConfiguration(key);
    }

    public static Application getApplicationContext() {
        return getConfiguration(ConfigKeys.APPLICATION_CONTEXT);
    }

    public static Handler getHandler() {
        return getConfiguration(ConfigKeys.HANDLER);
    }

    public static void test() {
    }
}