package tt.kao.androidmvpdemo.presenter;

import tt.kao.androidmvpdemo.event.PresenterEvent;
import tt.kao.androidmvpdemo.event.ViewEvent;
import tt.kao.androidmvpdemo.task.LuckyNumTask;
import tt.kao.androidmvpdemo.view.BaseView;

/**
 * @author Silvius
 */
public class MainPresenter extends BasePresenter {
    public MainPresenter(BaseView view) {
        super(view);
    }

    public void takeLuckyNumber() {
        LuckyNumTask task = new LuckyNumTask(this);
        task.execute();
    }

    @Override
    public void handleEvent(PresenterEvent event, Object data) {
        switch (event) {
            case UPDATE_PROGRESS:
                updateView(ViewEvent.UPDATE_PROGRESS_BAR, data);
                break;

            case UPDATE_RESULT:
                updateView(ViewEvent.UPDATE_TEXT, data);
                break;
        }
    }
}
