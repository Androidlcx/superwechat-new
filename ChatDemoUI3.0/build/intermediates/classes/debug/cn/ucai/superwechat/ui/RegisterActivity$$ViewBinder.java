// Generated code from Butter Knife. Do not modify!
package cn.ucai.superwechat.ui;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class RegisterActivity$$ViewBinder<T extends cn.ucai.superwechat.ui.RegisterActivity> implements ViewBinder<T> {
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
    view = finder.findRequiredView(source, 2131624156, "field 'mEtUsername'");
    target.mEtUsername = finder.castView(view, 2131624156, "field 'mEtUsername'");
    view = finder.findRequiredView(source, 2131624219, "field 'mEtNickname'");
    target.mEtNickname = finder.castView(view, 2131624219, "field 'mEtNickname'");
    view = finder.findRequiredView(source, 2131624196, "field 'mEtPassword'");
    target.mEtPassword = finder.castView(view, 2131624196, "field 'mEtPassword'");
    view = finder.findRequiredView(source, 2131624220, "field 'mEtConfirmPassword'");
    target.mEtConfirmPassword = finder.castView(view, 2131624220, "field 'mEtConfirmPassword'");
    view = finder.findRequiredView(source, 2131624056, "method 'onClick'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClick(p0);
        }
      });
  }

  @Override public void unbind(T target) {
    target.mImgBack = null;
    target.mTxtTitle = null;
    target.mEtUsername = null;
    target.mEtNickname = null;
    target.mEtPassword = null;
    target.mEtConfirmPassword = null;
  }
}
