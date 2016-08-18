package tt.kao.androidmvpdemo.mvp;

/**
 * @author luke_kao
 */
public interface MvpPresenter<Event extends Enum<Event>> {

    void handleEvent(Event event, Object data);
}
