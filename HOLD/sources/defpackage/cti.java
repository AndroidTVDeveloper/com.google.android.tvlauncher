package defpackage;

import android.content.Context;
import com.google.android.tvlauncher.R;

/* renamed from: cti  reason: default package */
/* compiled from: PG */
public final class cti {
    public final int a;
    public final int b;
    public final Context c;
    public final String d;
    public final ctg e = new ctg();

    public cti(String str, Context context) {
        this.c = context;
        this.d = str;
        this.a = context.getResources().getDimensionPixelSize(R.dimen.home_background_image_optimal_width);
        this.b = context.getResources().getDimensionPixelSize(R.dimen.home_background_image_optimal_height);
    }
}
