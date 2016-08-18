package tt.kao.androidmvpdemo.mvp;

import android.content.Context;

/**
 * @author Silvius
 */
public interface MvpView<Event extends Enum<Event>> {

    Context getContext();

    void handleEvent(Event event, Object data);
}
