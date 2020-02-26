package com.google.android.tvlauncher.appsview;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.leanback.widget.VerticalGridView;

/* compiled from: PG */
public class LaunchItemsRowView extends LinearLayout {
    public LaunchItemsRowView(Context context) {
        this(context, null);
    }

    public LaunchItemsRowView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LaunchItemsRowView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public LaunchItemsRowView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public final boolean requestFocus(int i, Rect rect) {
        View focusedChild;
        ViewGroup viewGroup = (ViewGroup) ((VerticalGridView) getParent()).getFocusedChild();
        if (viewGroup == null || (focusedChild = viewGroup.getFocusedChild()) == null) {
            return super.requestFocus(i, rect);
        }
        int indexOfChild = viewGroup.indexOfChild(focusedChild);
        if (indexOfChild < getChildCount()) {
            getChildAt(indexOfChild).requestFocus();
            return true;
        }
        getChildAt(getChildCount() - 1).requestFocus();
        return true;
    }
}
