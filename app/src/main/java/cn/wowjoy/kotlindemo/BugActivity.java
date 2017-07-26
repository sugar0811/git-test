package cn.wowjoy.kotlindemo;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by liu on 2017/7/26.
 */

public class BugActivity extends Activity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.e("aaa","哈哈哈哈");
        Log.e("aaa","哈哈哈哈");
        Log.e("aaa","哈哈哈哈");
        Log.e("aaa","哈哈哈哈");
        Log.e("aaa","新版本");

    }
}
