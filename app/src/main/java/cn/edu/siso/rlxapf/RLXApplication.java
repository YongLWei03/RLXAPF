package cn.edu.siso.rlxapf;

import android.app.Application;

import com.github.sahasbhop.apngview.ApngImageLoader;

import cn.edu.siso.rlxapf.util.http.OkHttpClientManager;

public class RLXApplication extends Application {

    private OkHttpClientManager okHttpClientManager = null;

    @Override
    public void onCreate() {
        super.onCreate();

        okHttpClientManager = OkHttpClientManager.getInstance(
                getApplicationContext(),
                getResources().getString(R.string.base_url));

        ApngImageLoader.getInstance().init(getApplicationContext());
    }

    public OkHttpClientManager getHttpManager() {
        return okHttpClientManager;
    }
}
