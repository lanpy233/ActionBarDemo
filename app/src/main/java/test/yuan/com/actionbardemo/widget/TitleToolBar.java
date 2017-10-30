package test.yuan.com.actionbardemo.widget;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.TextView;

import test.yuan.com.actionbardemo.R;

/**
 * Created by lanpoyang on 17-10-30.
 */

public class TitleToolBar extends Toolbar {

    private ImageView mBackView;
    private TextView mTitleView;

    public TitleToolBar(Context context) {
        super(context);
    }

    public TitleToolBar(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public TitleToolBar(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        mBackView = (ImageView) findViewById(R.id.back_img);
        mTitleView = (TextView) findViewById(R.id.toolbar_title_textview);
    }

    public void setTitleName(String title){
        mTitleView.setText(title);
    }

    public ImageView getBackView(){
        return mBackView;
    }
}
