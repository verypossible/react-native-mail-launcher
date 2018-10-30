
package com.reactlibrary;

import android.content.Intent;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

public class RNMailLauncherModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNMailLauncherModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNMailLauncher";
  }

  @ReactMethod
  public void launchMailApp() {
    Intent intent = new Intent(Intent.ACTION_MAIN);
    intent.addCategory(Intent.CATEGORY_APP_EMAIL);
    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
    getCurrentActivity().startActivity(intent);
  }
}
