// Generated code from Butter Knife. Do not modify!
package cn.ucai.superwechat.ui;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class UserProfileActivity$$ViewBinder<T extends cn.ucai.superwechat.ui.UserProfileActivity> implements ViewBinder<T> {
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
    view = finder.findRequiredView(source, 2131624222, "field 'mIvUserinfoAvatar'");
    target.mIvUserinfoAvatar = finder.castView(view, 2131624222, "field 'mIvUserinfoAvatar'");
    view = finder.findRequiredView(source, 2131624047, "field 'mTvUserinfoNick'");
    target.mTvUserinfoNick = finder.castView(view, 2131624047, "field 'mTvUserinfoNick'");
    view = finder.findRequiredView(source, 2131624048, "field 'mTvUserinfoName'");
    target.mTvUserinfoName = finder.castView(view, 2131624048, "field 'mTvUserinfoName'");
    view = finder.findRequiredView(source, 2131624221, "method 'onClick'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131624223, "method 'onClick'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131624224, "method 'onClick'");
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
    target.mIvUserinfoAvatar = null;
    target.mTvUserinfoNick = null;
    target.mTvUserinfoName = null;
  }
}
