package cn.hikyson.godeye.core.internal.modules.leakdetector;

import android.app.Activity;
import android.support.v4.app.Fragment;

public interface LeakRefNameProvider {
    String convertActivity(Activity activity);
    String convertV4Fragment(Fragment fragment);
    String convertFragment(android.app.Fragment fragment);
}
