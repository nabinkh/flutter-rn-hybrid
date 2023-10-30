package com.example.flutter_merger;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.core.view.WindowCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

//import com.example.flutter_merger.databinding.ActivityRnactivity2Binding;

public class RNActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
//    private ActivityRnactivity2Binding binding;

    // @Override
    // protected String getMainComponentName() {
    //     return "flutter_merger";
    // }


    // /**
    //  * Returns the instance of the {@link ReactActivityDelegate}. Here we use a util class {@link
    //  * DefaultReactActivityDelegate} which allows you to easily enable Fabric and Concurrent React
    //  * (aka React 18) with two boolean flags.
    //  */
    // @Override
    // protected ReactActivityDelegate createReactActivityDelegate() {
    //     return new DefaultReactActivityDelegate(
    //             this,
    //             getMainComponentName(),
    //             // If you opted-in for the New Architecture, we enable the Fabric Renderer.
    //             DefaultNewArchitectureEntryPoint.getFabricEnabled());
    // }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        binding = ActivityRnactivity2Binding.inflate(getLayoutInflater());
        setContentView(R.layout.content_rnactivity);
//
//        setSupportActionBar(binding.toolbar);
//
//        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_rnactivity);
//        appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).build();
//        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
//
//        binding.fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAnchorView(R.id.fab)
//                        .setAction("Action", null).show();
//            }
//        });
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_rnactivity);
        return NavigationUI.navigateUp(navController, appBarConfiguration)
                || super.onSupportNavigateUp();
    }
}