package com.fatdevs.thread;

import androidx.appcompat.app.AppCompatActivity;

import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.net.URL;

public class MainActivity extends AppCompatActivity {
    public final static String TAG = "MainActivity";
    public void start_thread(View view){
thread_runner run1 = new thread_runner(20);
run1.start();
}
    public void stop_thread(View view){
    }
public class thread_runner extends Thread{
public int second;
        public thread_runner(int seconds){
    this.second = seconds;
}
    @Override
    public void run() {     for(int i=0;i<second;i++){
            Log.i(TAG, "run: " +  i );
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
