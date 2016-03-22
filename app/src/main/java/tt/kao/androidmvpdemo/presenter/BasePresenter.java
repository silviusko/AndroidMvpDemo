package tt.kao.androidmvpdemo.presenter;

import android.content.Context;

import java.lang.ref.WeakReference;

import tt.kao.androidmvpdemo.view.UpdateView;
import tt.kao.androidmvpdemo.view.UpdateViewEvent;

/**
 * @author Silvius
 */
public abstract class BasePresenter implements UpdatePresenter {
    private WeakReference<UpdateView> mWeakUpdateUi;

    protected BasePresenter(UpdateView ui) {
        mWeakUpdateUi = new WeakReference<>(ui);
    }

    protected Context getContext() {
        UpdateView ui = mWeakUpdateUi.get();

        return ui == null ? null : ui.getContext();
    }

    protected void updateView(UpdateViewEvent reason, Object data) {
        UpdateView ui = mWeakUpdateUi.get();

        if (ui != null) {
            ui.update(reason, data);
        }
    }
}
