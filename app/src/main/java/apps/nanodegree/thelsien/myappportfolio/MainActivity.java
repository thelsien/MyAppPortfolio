package apps.nanodegree.thelsien.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onAppButtonClicked(View clickedView) {
        String btnText = ((Button) clickedView).getText().toString();
        Toast.makeText(this, "This button will launch my \"" + btnText + "\" app!", Toast.LENGTH_SHORT).show();
    }
}
