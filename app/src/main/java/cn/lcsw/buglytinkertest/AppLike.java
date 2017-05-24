package cn.lcsw.buglytinkertest;

import android.app.Application;
import android.content.Intent;
import com.tencent.bugly.Bugly;
import com.tencent.tinker.loader.app.DefaultApplicationLike;

/**
 * Created by haohao on 2017/5/24.
 */

public class AppLike extends DefaultApplicationLike {

    public AppLike(Application application, int tinkerFlags, boolean tinkerLoadVerifyFlag, long applicationStartElapsedTime, long applicationStartMillisTime, Intent tinkerResultIntent) {
        super(application, tinkerFlags, tinkerLoadVerifyFlag, applicationStartElapsedTime,
            applicationStartMillisTime, tinkerResultIntent);

    }


    @Override public void onCreate() {
        super.onCreate();
        Bugly.init(getApplication(), "900029763", true);
    }
}
