// Generated code from Butter Knife. Do not modify!
package com.kodelabs.mycosts.presentation.ui.customviews;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class ExpandedCostView$$ViewBinder<T extends com.kodelabs.mycosts.presentation.ui.customviews.ExpandedCostView> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624045, "field 'mTitle'");
    target.mTitle = finder.castView(view, 2131624045, "field 'mTitle'");
    view = finder.findRequiredView(source, 2131624046, "field 'mValue'");
    target.mValue = finder.castView(view, 2131624046, "field 'mValue'");
    view = finder.findRequiredView(source, 2131624064, "field 'mLinearLayout'");
    target.mLinearLayout = finder.castView(view, 2131624064, "field 'mLinearLayout'");
  }

  @Override public void unbind(T target) {
    target.mTitle = null;
    target.mValue = null;
    target.mLinearLayout = null;
  }
}
