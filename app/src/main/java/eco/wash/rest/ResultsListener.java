package eco.wash.rest;

/**
 * Created by Alexandre S on 18/07/2017.
 */

public interface ResultsListener<T>  {
    public void onSuccess(T result);
    public void onFailure(Throwable e);
}
