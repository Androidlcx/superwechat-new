// Generated code from Butter Knife. Do not modify!
package cn.ucai.superwechat.ui;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class AddFriendActivity$$ViewBinder<T extends cn.ucai.superwechat.ui.AddFriendActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624621, "field 'mImgBack' and method 'onClick'");
    target.mImgBack = finder.castView(view, 2131624621, "field 'mImgBack'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131624329, "field 'mTxtTitle'");
    target.mTxtTitle = finder.castView(view, 2131624329, "field 'mTxtTitle'");
    view = finder.findRequiredView(source, 2131624141, "field 'mBtnSend' and method 'onClick'");
    target.mBtnSend = finder.castView(view, 2131624141, "field 'mBtnSend'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131624044, "field 'mEtMsg'");
    target.mEtMsg = finder.castView(view, 2131624044, "field 'mEtMsg'");
  }

  @Override public void unbind(T target) {
    target.mImgBack = null;
    target.mTxtTitle = null;
    target.mBtnSend = null;
    target.mEtMsg = null;
  }
}
