package cn.lcsw.buglytinkertest;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;
import com.tencent.bugly.Bugly;
import com.tencent.bugly.beta.Beta;
import com.tencent.tinker.loader.app.TinkerApplication;
import com.tencent.tinker.loader.shareutil.ShareConstants;

/**
 * Created by haohao on 2017/5/24.
 */

public class App extends Application {

    @Override public void onCreate() {
        super.onCreate();

        Bugly.init(this, "5dd781976d", true);

    }


    @Override protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);

        MultiDex.install(base);

        Beta.installTinker();

    }
}
