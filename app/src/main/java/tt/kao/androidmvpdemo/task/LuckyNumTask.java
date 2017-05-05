package tt.kao.androidmvpdemo.task;


import android.os.SystemClock;

import java.util.Random;

import tt.kao.androidmvpdemo.event.PresenterEvent;
import tt.kao.androidmvpdemo.presenter.BasePresenter;

/**
 * @author luke_kao
 */

public class LuckyNumTask extends BaseTask<Void, Integer, Integer> {

    public LuckyNumTask(BasePresenter presenter) {
        super(presenter);
    }

    @Override
    protected Integer doInBackground(Void... params) {
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            publishProgress(i, random.nextInt(100));

            SystemClock.sleep(30);
        }

        return random.nextInt(100);
    }

    @Override
    protected void onProgressUpdate(Integer... values) {
        super.onProgressUpdate(values);

        updatePresenter(PresenterEvent.UPDATE_PROGRESS, values[0]);
        updatePresenter(PresenterEvent.UPDATE_RESULT, values[1]);
    }

    @Override
    protected void onPostExecute(Integer result) {
        super.onPostExecute(result);

        updatePresenter(PresenterEvent.UPDATE_PROGRESS, 100);
        updatePresenter(PresenterEvent.UPDATE_RESULT, result);
    }
}
