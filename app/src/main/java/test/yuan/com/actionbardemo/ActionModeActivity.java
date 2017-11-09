package test.yuan.com.actionbardemo;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class ActionModeActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private Context context;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_action_mode);
        context = this;

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        button = (Button) findViewById(R.id.bt);

        toolbar.setTitle("noStartActionMode");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActionMode(mCallback);
            }
        });
    }

    public ActionMode.Callback mCallback = new ActionMode.Callback() {
        @Override
        public boolean onCreateActionMode(ActionMode mode, Menu menu) {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
            TextView textView = new TextView(context);
            textView.setText("startActionMode");
            textView.setLayoutParams(layoutParams);
            textView.setTextSize(30);
            toolbar.addView(textView);
            return true;
        }

        @Override
        public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
            return false;
        }

        @Override
        public boolean onActionItemClicked(ActionMode mode, MenuItem item) {
            return false;
        }

        @Override
        public void onDestroyActionMode(ActionMode mode) {

        }
    };
}
