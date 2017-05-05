package tt.kao.androidmvpdemo.mvp;

/**
 * @author Silvius
 */
public interface MvpView<Event extends Enum<Event>> {

    void handleEvent(Event event, Object data);
}
