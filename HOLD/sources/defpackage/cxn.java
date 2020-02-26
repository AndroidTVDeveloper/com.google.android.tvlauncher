package defpackage;

import android.content.Context;
import android.media.tv.TvView;

/* renamed from: cxn  reason: default package */
/* compiled from: PG */
public final class cxn extends TvView {
    public cxn(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (getChildCount() > 0) {
            getChildAt(0).layout(0, 0, i3 - i, i4 - i2);
        }
    }
}
