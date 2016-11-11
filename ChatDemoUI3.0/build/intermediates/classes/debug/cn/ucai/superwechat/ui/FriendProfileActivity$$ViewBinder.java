// Generated code from Butter Knife. Do not modify!
package cn.ucai.superwechat.ui;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class FriendProfileActivity$$ViewBinder<T extends cn.ucai.superwechat.ui.FriendProfileActivity> implements ViewBinder<T> {
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
    view = finder.findRequiredView(source, 2131624046, "field 'mProfileImage'");
    target.mProfileImage = finder.castView(view, 2131624046, "field 'mProfileImage'");
    view = finder.findRequiredView(source, 2131624047, "field 'mTvUserinfoNick'");
    target.mTvUserinfoNick = finder.castView(view, 2131624047, "field 'mTvUserinfoNick'");
    view = finder.findRequiredView(source, 2131624048, "field 'mTvUserinfoName'");
    target.mTvUserinfoName = finder.castView(view, 2131624048, "field 'mTvUserinfoName'");
    view = finder.findRequiredView(source, 2131624050, "field 'mBtnAddContact' and method 'onClick'");
    target.mBtnAddContact = finder.castView(view, 2131624050, "field 'mBtnAddContact'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131624051, "field 'mBtnSendMsg' and method 'onClick'");
    target.mBtnSendMsg = finder.castView(view, 2131624051, "field 'mBtnSendMsg'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131624052, "field 'mBtnSendVideo' and method 'onClick'");
    target.mBtnSendVideo = finder.castView(view, 2131624052, "field 'mBtnSendVideo'");
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
    target.mProfileImage = null;
    target.mTvUserinfoNick = null;
    target.mTvUserinfoName = null;
    target.mBtnAddContact = null;
    target.mBtnSendMsg = null;
    target.mBtnSendVideo = null;
  }
}
