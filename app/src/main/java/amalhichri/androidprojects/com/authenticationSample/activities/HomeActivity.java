package amalhichri.androidprojects.com.authenticationSample.activities;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.squareup.picasso.Picasso;

import amalhichri.androidprojects.com.authenticationSample.R;
import amalhichri.androidprojects.com.authenticationSample.utils.Statics;
import de.hdodenhof.circleimageview.CircleImageView;

public class HomeActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        /** setting the actionBar **/
        getSupportActionBar().setDisplayShowCustomEnabled(false);
        getSupportActionBar().setDisplayShowTitleEnabled(false);


        /** setting user info **/
          ((TextView) findViewById(R.id.userInfoTxt)).setText(Statics.getLoggedUser(getApplicationContext()).getFirstName()+" "+
                Statics.getLoggedUser(getApplicationContext()).getLastName());

        if(FirebaseAuth.getInstance().getCurrentUser()!=null){
            Picasso.with(getApplicationContext()).load(Uri.parse(Statics.getLoggedUser(getApplicationContext()).getPictureUrl())).into((CircleImageView)findViewById(R.id.userImgProfile));
       }
        else
          ((CircleImageView)findViewById(R.id.userImgProfile)).setImageResource(R.drawable.ic_profile);

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