package com.zxaeva.greenifyhibernate;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = new Intent();
        intent.setClassName(
                "com.oasisfeng.greenify",
                "com.oasisfeng.greenify.GreenifyShortcut");
        startActivity(intent);
        finish();
    }
}
