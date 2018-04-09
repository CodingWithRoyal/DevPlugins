/**
 * Created by ROYALRandhawa
 * Github @ROYALRandhawa
 * Freelancer @ROYALRandhawa
 * ---------------------------------------------------------------
 * SUPPORT US ON FACEBOOK -> https://fb.com/imroyalrandhawa
 *               TWITTER  -> https://twitter.com/@imroyalrandhawa
 * ---------------------------------------------------------------
 * Support Our Effort With PayPal -> https://paypal.me/royalrandhawa
 *
 * 
 * Following Codes Check Both Mobile Network and WiFi.
 * How To Use:
 * 					if(new Helper().isNetworkAvailable()){
 *						//Network Available
 *					}else{
 *						//Network Not Available
 *					}
 * 
 */

public class Helper extends Activity {

	private boolean isNetworkAvailable() {
        boolean haveConnectedWifi = false;
        boolean haveConnectedMobile = false;

        ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo[] netInfo = new NetworkInfo[0];
        if (cm != null) {
            netInfo = cm.getAllNetworkInfo();
        }
        for (NetworkInfo ni : netInfo) {
            if (ni.getTypeName().equalsIgnoreCase("WIFI"))
                if (ni.isConnected())
                    haveConnectedWifi = true;
            if (ni.getTypeName().equalsIgnoreCase("MOBILE"))
                if (ni.isConnected())
                    haveConnectedMobile = true;
        }
        return haveConnectedWifi || haveConnectedMobile;
    }
	
}