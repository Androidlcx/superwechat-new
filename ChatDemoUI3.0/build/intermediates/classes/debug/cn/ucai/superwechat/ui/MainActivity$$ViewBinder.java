// Generated code from Butter Knife. Do not modify!
package cn.ucai.superwechat.ui;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class MainActivity$$ViewBinder<T extends cn.ucai.superwechat.ui.MainActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624620, "field 'mTxtLeft'");
    target.mTxtLeft = finder.castView(view, 2131624620, "field 'mTxtLeft'");
    view = finder.findRequiredView(source, 2131624622, "field 'mImgRight' and method 'showPop'");
    target.mImgRight = finder.castView(view, 2131624622, "field 'mImgRight'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.showPop();
        }
      });
    view = finder.findRequiredView(source, 2131624199, "field 'mLayoutViewpage'");
    target.mLayoutViewpage = finder.castView(view, 2131624199, "field 'mLayoutViewpage'");
    view = finder.findRequiredView(source, 2131624200, "field 'mLayoutTabhost'");
    target.mLayoutTabhost = finder.castView(view, 2131624200, "field 'mLayoutTabhost'");
  }

  @Override public void unbind(T target) {
    target.mTxtLeft = null;
    target.mImgRight = null;
    target.mLayoutViewpage = null;
    target.mLayoutTabhost = null;
  }
}
