package test.yuan.com.actionbardemo.customtoolbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;

import test.yuan.com.actionbardemo.R;
import test.yuan.com.actionbardemo.widget.TitleToolBar;

public class TitleBarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_title_bar);

        TitleToolBar titleToolBar = (TitleToolBar) findViewById(R.id.title_toolbar);
        titleToolBar.setTitleName("云相册");
        titleToolBar.setTitle("");
        titleToolBar.getBackView().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        setSupportActionBar(titleToolBar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.cloud_set_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }
}
