package tt.kao.androidmvpdemo.view;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import tt.kao.androidmvpdemo.R;
import tt.kao.androidmvpdemo.ViewEvent;
import tt.kao.androidmvpdemo.presenter.MainPresenter;

public class MainActivity extends AppCompatActivity implements BaseView {
    private MainPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPresenter = new MainPresenter(this);
    }

    @Override
    public Context getContext() {
        return this;
    }

    @Override
    public void handleEvent(ViewEvent event, Object data) {
        switch (event) {

        }
    }
}
