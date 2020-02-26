package android.support.v7.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;

/* compiled from: PG */
public class AlertController$RecycleListView extends ListView {
    public AlertController$RecycleListView(Context context) {
        this(context, null);
    }

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, er.p);
        obtainStyledAttributes.getDimensionPixelOffset(0, -1);
        obtainStyledAttributes.getDimensionPixelOffset(1, -1);
    }
}
