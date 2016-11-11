// Generated code from Butter Knife. Do not modify!
package cn.ucai.superwechat.ui;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class NewGroupActivity$$ViewBinder<T extends cn.ucai.superwechat.ui.NewGroupActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624621, "field 'imgBack' and method 'onClick'");
    target.imgBack = finder.castView(view, 2131624621, "field 'imgBack'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131624329, "field 'txtTitle'");
    target.txtTitle = finder.castView(view, 2131624329, "field 'txtTitle'");
    view = finder.findRequiredView(source, 2131624623, "field 'txtRight' and method 'onClick'");
    target.txtRight = finder.castView(view, 2131624623, "field 'txtRight'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131624201, "field 'editGroupName'");
    target.editGroupName = finder.castView(view, 2131624201, "field 'editGroupName'");
    view = finder.findRequiredView(source, 2131624202, "field 'editGroupIntroduction'");
    target.editGroupIntroduction = finder.castView(view, 2131624202, "field 'editGroupIntroduction'");
    view = finder.findRequiredView(source, 2131624204, "field 'ivAvatar'");
    target.ivAvatar = finder.castView(view, 2131624204, "field 'ivAvatar'");
    view = finder.findRequiredView(source, 2131624205, "field 'cbPublic' and method 'onClick'");
    target.cbPublic = finder.castView(view, 2131624205, "field 'cbPublic'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131624207, "field 'secondDesc'");
    target.secondDesc = finder.castView(view, 2131624207, "field 'secondDesc'");
    view = finder.findRequiredView(source, 2131624208, "field 'cbMemberInviter' and method 'onClick'");
    target.cbMemberInviter = finder.castView(view, 2131624208, "field 'cbMemberInviter'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131624203, "method 'onClick'");
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
    target.imgBack = null;
    target.txtTitle = null;
    target.txtRight = null;
    target.editGroupName = null;
    target.editGroupIntroduction = null;
    target.ivAvatar = null;
    target.cbPublic = null;
    target.secondDesc = null;
    target.cbMemberInviter = null;
  }
}
