package teamexe.teamexe_app.activities;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.ProgressBar;

import teamexe.teamexe_app.HomeActivity;
import teamexe.teamexe_app.R;

public class splashActivity extends AppCompatActivity {

    private static final long splashTime = 2000;
    private ImageView ivSplashLogo;
    private ProgressBar pbSplash;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        ivSplashLogo = (ImageView) findViewById(R.id.ivSplashlogo);
        
        Handler handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                startActivity(new Intent(splashActivity.this,HomeActivity.class));
                finish();
            }
        },splashTime);


    }
}
