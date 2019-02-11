// Generated code from Butter Knife. Do not modify!
package com.kodelabs.mycosts.presentation.ui.customviews;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class CostItemView$$ViewBinder<T extends com.kodelabs.mycosts.presentation.ui.customviews.CostItemView> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624045, "field 'mCategoryView'");
    target.mCategoryView = finder.castView(view, 2131624045, "field 'mCategoryView'");
    view = finder.findRequiredView(source, 2131624046, "field 'mValueView'");
    target.mValueView = finder.castView(view, 2131624046, "field 'mValueView'");
    view = finder.findRequiredView(source, 2131624065, "field 'mDescriptionView'");
    target.mDescriptionView = finder.castView(view, 2131624065, "field 'mDescriptionView'");
    view = finder.findRequiredView(source, 2131624066, "field 'mMenuButton' and method 'onClickMenu'");
    target.mMenuButton = finder.castView(view, 2131624066, "field 'mMenuButton'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClickMenu();
        }
      });
  }

  @Override public void unbind(T target) {
    target.mCategoryView = null;
    target.mValueView = null;
    target.mDescriptionView = null;
    target.mMenuButton = null;
  }
}
