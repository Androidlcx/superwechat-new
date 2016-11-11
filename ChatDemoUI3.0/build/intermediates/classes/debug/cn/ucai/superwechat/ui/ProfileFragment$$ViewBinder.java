// Generated code from Butter Knife. Do not modify!
package cn.ucai.superwechat.ui;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class ProfileFragment$$ViewBinder<T extends cn.ucai.superwechat.ui.ProfileFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624321, "field 'mIvProfileAvatar'");
    target.mIvProfileAvatar = finder.castView(view, 2131624321, "field 'mIvProfileAvatar'");
    view = finder.findRequiredView(source, 2131624322, "field 'mTvProfileNickname'");
    target.mTvProfileNickname = finder.castView(view, 2131624322, "field 'mTvProfileNickname'");
    view = finder.findRequiredView(source, 2131624323, "field 'mTvProfileUsername'");
    target.mTvProfileUsername = finder.castView(view, 2131624323, "field 'mTvProfileUsername'");
    view = finder.findRequiredView(source, 2131624320, "method 'onClick'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131624326, "method 'onClick'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131624328, "method 'onClick'");
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
    target.mIvProfileAvatar = null;
    target.mTvProfileNickname = null;
    target.mTvProfileUsername = null;
  }
}
