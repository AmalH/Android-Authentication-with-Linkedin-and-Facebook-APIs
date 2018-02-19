package amalhichri.androidprojects.com.authenticationSample.activities;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import android.view.View;

import com.google.firebase.auth.FirebaseAuth;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import amalhichri.androidprojects.com.authenticationSample.R;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;


public class MainActivity extends Activity implements View.OnClickListener   {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            // called only once to generate package hashKey for Linkedin app
        generateHashkey();


        /** if user is logged in --> homeActivity**/
        if(FirebaseAuth.getInstance().getCurrentUser()!=null){
          startActivity(new Intent(getApplicationContext(), HomeActivity.class));
        }
    }

    /*** login and signup buttons clicks ***/
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case(R.id.loginBtn):
                startActivity(new Intent(getApplicationContext(),LoginActivity.class));
                break;
            case (R.id.signupBtn):
                startActivity(new Intent(getApplicationContext(),SignupActivity.class));
        }
    }

    /** for calligraphy lib usage **/
    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }

    /** needs to get called only once to get the package hash for Linkedin application **/
    public void generateHashkey(){
        try {
            PackageInfo info = getPackageManager().getPackageInfo(
                    "amalhichri.androidprojects.com.authenticationSample",
                    PackageManager.GET_SIGNATURES);
            for (Signature signature : info.signatures) {
                MessageDigest md = MessageDigest.getInstance("SHA");
                md.update(signature.toByteArray());
                Log.d("KeyHash:", Base64.encodeToString(md.digest(), Base64.DEFAULT));
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.d("Error", e.getMessage(), e);
        } catch (NoSuchAlgorithmException e) {
            Log.d("Error", e.getMessage(), e);
        }
    }


}
