package component;

/**
 * Created by rakshit.sathwara on 12/1/2016.
 */

public class FeedsComponents<T> {

    public static final int FEED_DETAILS = 0;

    public static final int EMPTY_VIEW = 1;

    final T object;

    final int viewtype;

    public FeedsComponents(T object, int viewtype) {
        this.object = object;
        this.viewtype = viewtype;
    }

    public T getObject() {
        return object;
    }

    public int getViewtype() {
        return viewtype;
    }
}
