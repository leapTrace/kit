package com.grade.kit.widget.smartrefresh;

import android.content.Context;
import android.util.AttributeSet;

import com.grade.kit.widget.smartrefresh.base.layout.BaseHeaderView;
import com.grade.kit.widget.smartrefresh.base.support.type.LayoutType;

public class DefaultHeaderView extends BaseHeaderView {

  private boolean refreshing;
  private int topPadding;

  public DefaultHeaderView(Context context) {
    super(context);
  }

  public DefaultHeaderView(Context context, AttributeSet attrs) {
    super(context, attrs);
  }

  public DefaultHeaderView(Context context, AttributeSet attrs, int defStyleAttr) {
    super(context, attrs, defStyleAttr);
  }

  @Override
  public float getSpanHeight() {
    return topPadding + (getHeight() == 0 ? 100 : getHeight());
  }

  @Override
  protected void onStateChange(int state) {
    refreshing = state == BaseHeaderView.REFRESHING;
  }

  public int getLayoutType() {
    return LayoutType.LAYOUT_NORMAL;
  }

  public boolean isRefreshing() {
    return refreshing;
  }

  public void setTopPadding(int topPadding) {
    this.topPadding = topPadding;
  }
}
