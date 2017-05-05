package tt.kao.androidmvpdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import tt.kao.androidmvpdemo.event.ViewEvent;
import tt.kao.androidmvpdemo.presenter.MainPresenter;
import tt.kao.androidmvpdemo.view.BaseView;

public class MainActivity extends AppCompatActivity implements BaseView, View.OnClickListener {
    private MainPresenter mPresenter;

    private Button mButton;
    private TextView mText;
    private ProgressBar mProgressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPresenter = new MainPresenter(this);

        mButton = (Button) findViewById(R.id.button);
        mText = (TextView) findViewById(R.id.text);
        mProgressBar = (ProgressBar) findViewById(R.id.progressBar);

        mButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                mPresenter.takeLuckyNumber();
                break;
        }
    }

    @Override
    public void handleEvent(ViewEvent event, Object data) {
        switch (event) {
            case UPDATE_PROGRESS_BAR:
                mProgressBar.setProgress((int) data);
                break;

            case UPDATE_TEXT:
                mText.setText(String.valueOf(data));
                break;
        }
    }
}
