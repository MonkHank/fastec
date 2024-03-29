package com.flj.latte.app;

import com.flj.latte.util.storage.LattePreference;

/**
 * @author 傅令杰
 * @date 2017/4/22
 */
public class AccountManager {

    private enum SignTag {
        /**
         *
         */
        SIGN_TAG
    }

    /**
     * 保存用户登录状态，登录后调用
     * @param state
     */
    public static void setSignState(boolean state) {
        LattePreference.setAppFlag(SignTag.SIGN_TAG.name(), state);
    }

    private static boolean isSignIn() {
        return LattePreference.getAppFlag(SignTag.SIGN_TAG.name());
    }

    public static void checkAccount(IUserChecker checker) {
        if (isSignIn()) {
            checker.onSignIn();
        } else {
            checker.onNotSignIn();
        }
    }
}
