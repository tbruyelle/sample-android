package sample.android;

import android.app.Activity;
import android.os.Bundle;
import org.androidannotations.annotations.EActivity;

@EActivity
public class SampleActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}
