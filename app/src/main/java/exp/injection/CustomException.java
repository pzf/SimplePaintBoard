package exp.injection;

import android.util.Log;



public class CustomException {
    public static final String TAG = CustomException.class.getSimpleName();

    public static void injectSleepANRException (){
        try {
            Log.i(TAG,"injectSleepANRException wait 10s begin");
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            Log.i(TAG,"injectSleepANRException wait 10s after");
        }
    }
}
