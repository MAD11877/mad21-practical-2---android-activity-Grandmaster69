package sg.edu.np.mad.madpractical;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        User u = new User("Gerald", "likes cats", 1, true);
        Button btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                if (u.Followed) {
                    btn.setText("UNFOLLOW");
                    u.Followed = false;
                }
                else {
                    btn.setText("FOLLOW");
                    u.Followed = true;
                }
            }
        });
    }
}