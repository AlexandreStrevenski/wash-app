package eco.wash.rest;

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

    public void getFeed(final ResultsListener<String> aListener) {

        Api.get("feed/", null, new AsyncHttpResponseHandler() {

            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                if (statusCode == 200) {
                    aListener.onSuccess("");
                }
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
                aListener.onFailure(error);
            }

        });
    }

    public void getUser() {
        Api.get("getUser/", null, new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                System.out.println(new String(responseBody));
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
                System.out.println(statusCode);
                error.printStackTrace();
            }
        });
    }
}