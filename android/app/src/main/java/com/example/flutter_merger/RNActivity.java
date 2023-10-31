package com.example.flutter_merger;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.facebook.react.PackageList;
import com.facebook.react.ReactInstanceManager;
import com.facebook.react.ReactRootView;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.modules.core.DefaultHardwareBackBtnHandler;
import com.facebook.soloader.SoLoader;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;


public final class RNActivity extends Activity implements DefaultHardwareBackBtnHandler {
    private ReactRootView reactRootView;
    private ReactInstanceManager reactInstanceManager;

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SoLoader.init((Context)this, false);
        this.reactRootView = new ReactRootView((Context)this);
        ArrayList var10000 = (new PackageList(this.getApplication())).getPackages();
        Intrinsics.checkNotNullExpressionValue(var10000, "PackageList(application).packages");
        List packages = (List)var10000;
        ReactInstanceManager var10001 = ReactInstanceManager.builder().setApplication(this.getApplication()).setCurrentActivity((Activity)this).setBundleAssetName("index.android.bundle").setJSMainModulePath("index").addPackages(packages).setUseDeveloperSupport(BuildConfig.DEBUG).setInitialLifecycleState(LifecycleState.RESUMED).build();
        Intrinsics.checkNotNullExpressionValue(var10001, "ReactInstanceManager.bui…MED)\n            .build()");
        this.reactInstanceManager = var10001;
        ReactRootView var3 = this.reactRootView;
        if (var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("reactRootView");
        }

        if (var3 != null) {
            var10001 = this.reactInstanceManager;
            if (var10001 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("reactInstanceManager");
            }

            var3.startReactApplication(var10001, "react-native-merger", (Bundle)null);
        }

        ReactRootView var4 = this.reactRootView;
        if (var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("reactRootView");
        }

        this.setContentView((View)var4);
    }

    public void invokeDefaultOnBackPressed() {
        super.onBackPressed();
    }
}
