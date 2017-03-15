package proyecto.which.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import proyecto.which.R;
import proyecto.which.managers.UserLoginManager;
import proyecto.which.model.UserToken;


public class TokenActivity extends AppCompatActivity {

    private TextView accessToken;
    private TextView tokenType;
    private TextView grantType;
    private TextView refreshToken;
    private TextView expiresIn;
    private TextView scope;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_token);

        accessToken = (TextView) findViewById(R.id.access_token);
        tokenType = (TextView) findViewById(R.id.token_type);
        grantType = (TextView) findViewById(R.id.grant_type);
        refreshToken = (TextView) findViewById(R.id.refresh_token);
        expiresIn = (TextView) findViewById(R.id.expires_in);
        scope = (TextView) findViewById(R.id.scope);
        button = (Button) findViewById(R.id.main_button);
    }

    @Override
    protected void onResume() {
        super.onResume();

        UserToken userToken = UserLoginManager.getInstance().getUserToken();

        if(userToken!=null) {
            accessToken.setText(userToken.getAccessToken());
            tokenType.setText(userToken.getTokenType());
            grantType.setText(userToken.getGrantType());
            refreshToken.setText(userToken.getRefreshToken());
            expiresIn.setText(Math.ceil(userToken.getExpiresIn() / 60) + " minutes.");
            scope.setText(userToken.getScope());
        } else {
            Log.e("MainActivity->", "onResume ERROR: userToken is NULL");
        }

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(TokenActivity.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}
