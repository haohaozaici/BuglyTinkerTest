package cn.lcsw.buglytinkertest;

import android.Manifest;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.tencent.bugly.Bugly;
import com.tencent.bugly.crashreport.CrashReport;

public class MainActivity extends AppCompatActivity {

    TextView bug;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActivityCompat.requestPermissions(this, new String[] { Manifest.permission.READ_PHONE_STATE,
            Manifest.permission.READ_EXTERNAL_STORAGE }, 0);

        bug = (TextView)findViewById(R.id.bug);
        bug.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                CrashReport.testJavaCrash();
                String s = "success";
                bug.setText(s);
            }
        });

    }
}
