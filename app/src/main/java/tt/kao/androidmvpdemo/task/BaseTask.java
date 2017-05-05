package tt.kao.androidmvpdemo.task;

import android.os.AsyncTask;

import java.lang.ref.WeakReference;

import tt.kao.androidmvpdemo.event.PresenterEvent;
import tt.kao.androidmvpdemo.presenter.BasePresenter;

/**
 * @author luke_kao
 */

abstract public class BaseTask<Params, Progress, Result> extends AsyncTask<Params, Progress, Result> {
    private final WeakReference<BasePresenter> mWeakPresenter;

    protected BaseTask(BasePresenter presenter) {
        mWeakPresenter = new WeakReference<>(presenter);
    }

    protected void updatePresenter(PresenterEvent event, Object data) {
        BasePresenter presenter = mWeakPresenter.get();

        if (presenter != null) {
            presenter.handleEvent(event, data);
        }
    }
}
