package iics.hernandez.allianagabriel.adulting101;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_page);
    }
//    public void sign(View v) {
//       startActivity(new Intent(LoginPage.this, SignupPage.class));
//    }

    public void sign(View v) {
        Intent i = new Intent(getApplicationContext(), SignupPage.class);
        startActivity(i);
    }


}
