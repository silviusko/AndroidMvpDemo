package tt.kao.androidmvpdemo.presenter;

import java.lang.ref.WeakReference;

import tt.kao.androidmvpdemo.event.PresenterEvent;
import tt.kao.androidmvpdemo.event.ViewEvent;
import tt.kao.androidmvpdemo.mvp.MvpPresenter;
import tt.kao.androidmvpdemo.view.BaseView;

/**
 * @author Silvius
 */
public abstract class BasePresenter implements MvpPresenter<PresenterEvent> {
    private WeakReference<BaseView> mWeakCallbackView;

    protected BasePresenter(BaseView callbackView) {
        mWeakCallbackView = new WeakReference<>(callbackView);
    }

    protected void updateView(ViewEvent event, Object data) {
        BaseView view = mWeakCallbackView.get();

        if (view != null) {
            view.handleEvent(event, data);
        }
    }
}
