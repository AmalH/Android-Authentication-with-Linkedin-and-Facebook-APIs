package amalhichri.androidprojects.com.kotlinlearning.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import amalhichri.androidprojects.com.kotlinlearning.R;
import amalhichri.androidprojects.com.kotlinlearning.utils.Statics;

public class HomeActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        /** setting the actionBar **/
        getSupportActionBar().setDisplayShowCustomEnabled(false);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        /** signing user out **/
        (findViewById(R.id.signOutTxt)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Statics.auth.signOut();
                startActivity(new Intent(HomeActivity.this, MainActivity.class));
            }
        });

    }

    /** to prevent back to loginActivity **/
    @Override
    public void onBackPressed() {
    }


}