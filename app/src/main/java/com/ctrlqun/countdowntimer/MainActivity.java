package com.ctrlqun.countdowntimer;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView mTvShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTvShow = (EditText) findViewById(R.id.show);
    }

    /**
     * 取消倒计时
     *
     * @param v
     */
    public void oncancel(View v) {
        timer.cancel();
    }

    public void restart(View v) {
        timer.start();
    }

    private CountDownTimer timer = new CountDownTimer(60 * 1000, 1000) {

        @Override
        public void onTick(long millisUntilFinished) {
            mTvShow.setText((millisUntilFinished / 1000) + "");
        }

        @Override
        public void onFinish() {
            mTvShow.setEnabled(true);
        }
    };
}
