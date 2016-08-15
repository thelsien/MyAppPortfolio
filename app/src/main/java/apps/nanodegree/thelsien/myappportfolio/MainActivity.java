package apps.nanodegree.thelsien.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onPopularMoviesClicked(View clickedView) {
        Toast.makeText(this, "This button will launch my \"Popular Movies\" app!", Toast.LENGTH_SHORT).show();
    }

    public void onStockHawkClicked(View clickedView) {
        Toast.makeText(this, "This button will launch my \"Stock Hawk\" app!", Toast.LENGTH_SHORT).show();
    }

    public void onBuildItBiggerClicked(View clickedView) {
        Toast.makeText(this, "This button will launch my \"Build It Bigger\" app!", Toast.LENGTH_SHORT).show();
    }

    public void onMakeYourAppMaterialClicked(View clickedView) {
        Toast.makeText(this, "This button will launch my \"Make Your App Material\" app!", Toast.LENGTH_SHORT).show();
    }

    public void onGoUbiquitousClicked(View clickedView) {
        Toast.makeText(this, "This button will launch my \"Go Ubiquitous\" app!", Toast.LENGTH_SHORT).show();
    }

    public void onCapstoneClicked(View clickedView) {
        Toast.makeText(this, "This button will launch my \"Capstone\" app!", Toast.LENGTH_SHORT).show();
    }
}
