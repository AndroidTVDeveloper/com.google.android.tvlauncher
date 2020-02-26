package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;

/* renamed from: cpt  reason: default package */
/* compiled from: PG */
final class cpt {
    public final Context a;
    public int b = -16777216;
    public int c = -16777216;
    public int d = -16777216;
    public boolean e = false;
    public Paint f;
    public Paint g;
    public Bitmap h;
    public Paint i;
    public cps j;
    public final ddd k;

    public cpt(View view) {
        si.c(view.getContext());
        this.a = view.getContext();
        ddd ddd = new ddd(new BitmapDrawable[]{a(), a(), a()});
        this.k = ddd;
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
    private final BitmapDrawable a() {
        Bitmap bitmap;
        if (dcy.a()) {
            bitmap = Bitmap.createBitmap(960, 540, Bitmap.Config.ARGB_8888, false);
        } else {
            bitmap = Bitmap.createBitmap(960, 540, Bitmap.Config.ARGB_8888);
        }
        BitmapDrawable bitmapDrawable = new BitmapDrawable(this.a.getResources(), bitmap);
        bitmapDrawable.setAutoMirrored(true);
        return bitmapDrawable;
    }

    public final void a(int i2, int i3, int i4, boolean z) {
        this.e = false;
        if (this.b != i2 || this.c != i3 || this.d != i4 || z) {
            this.b = i2;
            this.c = i3;
            this.d = i4;
            cps cps = this.j;
            if (cps != null) {
                cps.cancel(true);
            }
            cps cps2 = new cps(this);
            this.j = cps2;
            cps2.execute((BitmapDrawable) this.k.getDrawable(0));
        }
    }
}
