package test.yuan.com.actionbardemo;

import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class SearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.search_menu, menu);

        //定义一个监听器
        MenuItemCompat.OnActionExpandListener expandListener = new MenuItemCompat.OnActionExpandListener() {
            @Override
            public boolean onMenuItemActionCollapse(MenuItem item) {
                // 当item折叠起来的时候的处理动作
                Toast.makeText(SearchActivity.this, "当item折叠起来的时候的处理动作", Toast.LENGTH_SHORT).show();
                return true;  // 返回true来折叠起这个动作视图
            }

            @Override
            public boolean onMenuItemActionExpand(MenuItem item) {
                // 当item展开来的时候的处理动作
                Toast.makeText(SearchActivity.this, "当item展开来的时候的处理动作", Toast.LENGTH_SHORT).show();
                return true;  // 返回true来展开这个动作视图
            }
        };

        // Get the MenuItem for the action item
        MenuItem searchItem = menu.findItem(R.id.action_search);

        // 设置搜索内容并添加事件监听等等。。。
        // 给这个动作视图添加监听
        MenuItemCompat.setOnActionExpandListener(searchItem, expandListener);

        SearchView searchView = (SearchView) MenuItemCompat.getActionView(searchItem);

        return super.onCreateOptionsMenu(menu);
    }

}
