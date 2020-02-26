package p000;

import android.content.Context;
import com.google.android.tvlauncher.R;

/* renamed from: cti */
/* compiled from: PG */
public final class cti {

    /* renamed from: a */
    public final int f7353a;

    /* renamed from: b */
    public final int f7354b;

    /* renamed from: c */
    public final Context f7355c;

    /* renamed from: d */
    public final String f7356d;

    /* renamed from: e */
    public final ctg f7357e = new ctg();

    public cti(String str, Context context) {
        this.f7355c = context;
        this.f7356d = str;
        this.f7353a = context.getResources().getDimensionPixelSize(R.dimen.home_background_image_optimal_width);
        this.f7354b = context.getResources().getDimensionPixelSize(R.dimen.home_background_image_optimal_height);
    }
}
