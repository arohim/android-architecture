// Generated code from Butter Knife. Do not modify!
package com.kodelabs.mycosts.presentation.ui.activities;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class MainActivity$$ViewBinder<T extends com.kodelabs.mycosts.presentation.ui.activities.MainActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624043, "field 'mRecyclerView'");
    target.mRecyclerView = finder.castView(view, 2131624043, "field 'mRecyclerView'");
    view = finder.findRequiredView(source, 2131624050, "field 'mRevealLayout'");
    target.mRevealLayout = finder.castView(view, 2131624050, "field 'mRevealLayout'");
  }

  @Override public void unbind(T target) {
    target.mRecyclerView = null;
    target.mRevealLayout = null;
  }
}
