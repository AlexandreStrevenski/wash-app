package eco.wash.rest;

import android.widget.Toast;

import com.loopj.android.http.AsyncHttpResponseHandler;

import cz.msebera.android.httpclient.Header;

/**
 * Created by Alexandre S on 18/07/2017.
 */

public class RestClient {

    private static RestClient sInstance = null;

    public static RestClient getInstance() {
        if (sInstance == null) {
            sInstance = new RestClient();
        }

        return sInstance;
    }

    public void listAllClients() {

    }
}