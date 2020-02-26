package com.google.android.tvlauncher.home.featuredcarousel.view;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;

/* compiled from: PG */
public class ScrollingContainerView extends FrameLayout {
    public ScrollingContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new Handler();
    }

    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        throw null;
    }

    public final View focusSearch(View view, int i) {
        if (i == 17 && view.getId() == 0) {
            throw null;
        } else if (i != 66 || view.getId() != 0) {
            return super.focusSearch(view, i);
        } else {
            throw null;
        }
    }
}
