package tt.kao.androidmvpdemo;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import tt.kao.androidmvpdemo.presenter.MainPresenter;
import tt.kao.androidmvpdemo.view.UpdateView;
import tt.kao.androidmvpdemo.view.UpdateViewEvent;

public class MainActivity extends AppCompatActivity implements UpdateView {
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
    public void update(UpdateViewEvent event, Object data) {
        switch (event) {

        }
    }
}
