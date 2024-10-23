package internship.june;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Create a blank FrameLayout programmatically
        FrameLayout frameLayout = new FrameLayout(this);
        setContentView(frameLayout);

        db = openOrCreateDatabase("AndroidInternshipJune.db", MODE_PRIVATE, null);
        String tableQuery = "CREATE TABLE IF NOT EXISTS USERS(USERID INTEGER PRIMARY KEY AUTOINCREMENT, NAME VARCHAR(50), EMAIL VARCHAR(50), CONTACT BIGINT(10), PASSWORD VARCHAR(20))";
        db.execSQL(tableQuery);

        Intent intent = new Intent(MainActivity.this, DashboardActivity.class);
        startActivity(intent);
        finish();
    }
}
