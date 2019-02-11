// Generated code from Butter Knife. Do not modify!
package com.kodelabs.mycosts.presentation.ui.adapters;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class CostItemAdapter$ViewHolder$$ViewBinder<T extends com.kodelabs.mycosts.presentation.ui.adapters.CostItemAdapter.ViewHolder> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624045, "field 'mTitle'");
    target.mTitle = finder.castView(view, 2131624045, "field 'mTitle'");
    view = finder.findRequiredView(source, 2131624046, "field 'mTotalCost'");
    target.mTotalCost = finder.castView(view, 2131624046, "field 'mTotalCost'");
  }

  @Override public void unbind(T target) {
    target.mTitle = null;
    target.mTotalCost = null;
  }
}
