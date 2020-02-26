package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;

/* renamed from: cpt */
/* compiled from: PG */
final class cpt {

    /* renamed from: a */
    public final Context f6938a;

    /* renamed from: b */
    public int f6939b = -16777216;

    /* renamed from: c */
    public int f6940c = -16777216;

    /* renamed from: d */
    public int f6941d = -16777216;

    /* renamed from: e */
    public boolean f6942e = false;

    /* renamed from: f */
    public Paint f6943f;

    /* renamed from: g */
    public Paint f6944g;

    /* renamed from: h */
    public Bitmap f6945h;

    /* renamed from: i */
    public Paint f6946i;

    /* renamed from: j */
    public cps f6947j;

    /* renamed from: k */
    public final ddd f6948k;

    public cpt(View view) {
        C0497si.m8296c(view.getContext());
        this.f6938a = view.getContext();
        ddd ddd = new ddd(new BitmapDrawable[]{m5502a(), m5502a(), m5502a()});
        this.f6948k = ddd;
        view.setBackground(ddd);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.graphics.Bitmap.createBitmap(int, int, android.graphics.Bitmap$Config, boolean):android.graphics.Bitmap}
     arg types: [int, int, android.graphics.Bitmap$Config, int]
     candidates:
      ClspMth{android.graphics.Bitmap.createBitmap(android.util.DisplayMetrics, int, int, android.graphics.Bitmap$Config):android.graphics.Bitmap}
      ClspMth{android.graphics.Bitmap.createBitmap(int[], int, int, android.graphics.Bitmap$Config):android.graphics.Bitmap}
      ClspMth{android.graphics.Bitmap.createBitmap(android.graphics.Picture, int, int, android.graphics.Bitmap$Config):android.graphics.Bitmap}
      ClspMth{android.graphics.Bitmap.createBitmap(int, int, android.graphics.Bitmap$Config, boolean):android.graphics.Bitmap} */
    /* renamed from: a */
    private final BitmapDrawable m5502a() {
        Bitmap bitmap;
        if (dcy.m6189a()) {
            bitmap = Bitmap.createBitmap(960, 540, Bitmap.Config.ARGB_8888, false);
        } else {
            bitmap = Bitmap.createBitmap(960, 540, Bitmap.Config.ARGB_8888);
        }
        BitmapDrawable bitmapDrawable = new BitmapDrawable(this.f6938a.getResources(), bitmap);
        bitmapDrawable.setAutoMirrored(true);
        return bitmapDrawable;
    }

    /* renamed from: a */
    public final void mo3567a(int i, int i2, int i3, boolean z) {
        this.f6942e = false;
        if (this.f6939b != i || this.f6940c != i2 || this.f6941d != i3 || z) {
            this.f6939b = i;
            this.f6940c = i2;
            this.f6941d = i3;
            cps cps = this.f6947j;
            if (cps != null) {
                cps.cancel(true);
            }
            cps cps2 = new cps(this);
            this.f6947j = cps2;
            cps2.execute((BitmapDrawable) this.f6948k.getDrawable(0));
        }
    }
}
