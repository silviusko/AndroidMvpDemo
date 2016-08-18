package tt.kao.androidmvpdemo.presenter;

import android.content.Context;

import java.lang.ref.WeakReference;

import tt.kao.androidmvpdemo.PresenterEvent;
import tt.kao.androidmvpdemo.ViewEvent;
import tt.kao.androidmvpdemo.mvp.MvpPresenter;
import tt.kao.androidmvpdemo.mvp.MvpView;
import tt.kao.androidmvpdemo.view.BaseView;

/**
 * @author Silvius
 */
public abstract class BasePresenter implements MvpPresenter<PresenterEvent> {
    private WeakReference<BaseView> mWeakCallbackView;

    protected BasePresenter(BaseView callbackView) {
        mWeakCallbackView = new WeakReference<>(callbackView);
    }

    protected Context getContext() {
        MvpView view = mWeakCallbackView.get();

        return view == null ? null : view.getContext();
    }

    protected void updateView(ViewEvent event, Object data) {
        BaseView view = mWeakCallbackView.get();

        if (view != null) {
            view.handleEvent(event, data);
        }
    }
}
