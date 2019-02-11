// Generated code from Butter Knife. Do not modify!
package com.kodelabs.mycosts.presentation.ui.adapters;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class CostItemAdapter$ExpandedViewHolder$$ViewBinder<T extends com.kodelabs.mycosts.presentation.ui.adapters.CostItemAdapter.ExpandedViewHolder> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624047, "field 'mExpandedCostView'");
    target.mExpandedCostView = finder.castView(view, 2131624047, "field 'mExpandedCostView'");
  }

  @Override public void unbind(T target) {
    target.mExpandedCostView = null;
  }
}
