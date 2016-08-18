package tt.kao.androidmvpdemo.presenter;

import tt.kao.androidmvpdemo.PresenterEvent;
import tt.kao.androidmvpdemo.view.BaseView;

/**
 * @author Silvius
 */
public class MainPresenter extends BasePresenter {
    public MainPresenter(BaseView view) {
        super(view);
    }

    @Override
    public void handleEvent(PresenterEvent event, Object data) {
        switch (event) {

        }
    }
}
