
package android.privacy;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Binder;
import android.os.RemoteException;
import android.util.Log;


public class PrivacySettingsManager {

    private String TAG = "PrivacySettingsManager";
    
    private IPrivacySettingsManager mService;
    
    private Context mContext;
    
    /**
     * @hide - this should be instantiated through Context.getSystemService
     * @param context
     */
    public PrivacySettingsManager(Context context, IPrivacySettingsManager service) {
        mService = service;
        mContext = context;
    }

    public PrivacySettings getSettings(String packageName, int uid) {
        try {
            Log.d(TAG, "getSettings for package: " + packageName + " UID: " + uid);
            if (mService != null) {
                return mService.getSettings(packageName, uid);
            } else {
                Log.e(TAG, "PrivacySettingsManagerService not ready");
                return null;
            }
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean saveSettings(PrivacySettings settings) {
        try {
            Log.d(TAG, "saveSettings: " + settings);
            if (mService != null) {            
                return mService.saveSettings(settings);
            } else {
                Log.e(TAG, "PrivacySettingsManagerService not ready");
                return false;
            }
        } catch (RemoteException e) {
            Log.e(TAG, "RemoteException in saveSettings: ", e);
            return false;
        }
    }
}