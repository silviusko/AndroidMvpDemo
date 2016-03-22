package tt.kao.androidmvpdemo.view;

import android.content.Context;

/**
 * @author Silvius
 */
public interface UpdateView {

    Context getContext();

    void update(UpdateViewEvent event, Object data);
}
