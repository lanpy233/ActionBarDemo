package test.yuan.com.actionbardemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

/**
 * @author lanpoyang
 * ToolBar
 * 使用ToolBar条件：（１）Android2.1(API级别７)或者更高版本；
 * 使用：（１）向项目添加v7 appcompat支持库，（２）确保Activity可以扩展AppCompatActivity.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);

        getSupportActionBar().hide();
    }
}
