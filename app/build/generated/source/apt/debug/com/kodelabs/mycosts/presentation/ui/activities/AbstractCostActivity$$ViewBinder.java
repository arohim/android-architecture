// Generated code from Butter Knife. Do not modify!
package com.kodelabs.mycosts.presentation.ui.activities;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class AbstractCostActivity$$ViewBinder<T extends com.kodelabs.mycosts.presentation.ui.activities.AbstractCostActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624050, "field 'mRevealLayout'");
    target.mRevealLayout = finder.castView(view, 2131624050, "field 'mRevealLayout'");
    view = finder.findRequiredView(source, 2131624041, "field 'mToolbar'");
    target.mToolbar = finder.castView(view, 2131624041, "field 'mToolbar'");
    view = finder.findRequiredView(source, 2131624051, "field 'mDateTextView' and method 'showDatePickerDialog'");
    target.mDateTextView = finder.castView(view, 2131624051, "field 'mDateTextView'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.showDatePickerDialog(p0);
        }
      });
    view = finder.findRequiredView(source, 2131624052, "field 'mAmountEditText'");
    target.mAmountEditText = finder.castView(view, 2131624052, "field 'mAmountEditText'");
    view = finder.findRequiredView(source, 2131624056, "field 'mDescriptionEditText'");
    target.mDescriptionEditText = finder.castView(view, 2131624056, "field 'mDescriptionEditText'");
    view = finder.findRequiredView(source, 2131624055, "field 'mCategorySpinner'");
    target.mCategorySpinner = finder.castView(view, 2131624055, "field 'mCategorySpinner'");
  }

  @Override public void unbind(T target) {
    target.mRevealLayout = null;
    target.mToolbar = null;
    target.mDateTextView = null;
    target.mAmountEditText = null;
    target.mDescriptionEditText = null;
    target.mCategorySpinner = null;
  }
}
