package org.nustaq.kontraktor;

import java.util.function.Consumer;
import java.util.function.Function;

/**
 * Created by moelrue on 20.05.2014.
 */
public interface Future<T> extends Callback<T> {

    /**
     * called when any result of a future becomes available
     * @param result
     * @return
     */
    public Future<T> then( Runnable result );

    /**
     * called when any result of a future becomes available
     * @param result
     * @return
     */
    public Future<T> then( Callback<T> result );

    /**
     * called when a valid result of a future becomes available
     * @return
     */
    public Future<T> onResult( Consumer<T> resultHandler );

    /**
     * called when an error is set as the result
     * @return
     */
    public Future<T> onError( Consumer errorHandler );

    /**
     * called when the async call times out. see 'timeOutIn'
     * @param timeoutHandler
     * @return
     */
    public Future<T> onTimeout(Consumer timeoutHandler);

    public <OUT> Future<OUT> map(final Filter<T, OUT> filter);

    /**
     * @return result if avaiable
     */
    public T getResult();

    /**
     * @return error if avaiable
     */
    public Object getError();

    /**
     * same as receive(null,null)
     */
    public void signal();

    /**
     *
     * @param millis
     * @return this for chaining
     */
    public Future timeoutIn(long millis);
}
