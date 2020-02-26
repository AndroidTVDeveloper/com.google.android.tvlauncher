package defpackage;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* renamed from: aeu  reason: default package */
/* compiled from: PG */
public final class aeu implements aew {
    private final xg a;
    private final aew b;
    private final aew c;

    public aeu(xg xgVar, aew aew, aew aew2) {
        this.a = xgVar;
        this.b = aew;
        this.c = aew2;
    }

    public final ww a(ww wwVar, tx txVar) {
        Drawable drawable = (Drawable) wwVar.b();
        if (drawable instanceof BitmapDrawable) {
            return this.b.a(acf.a(((BitmapDrawable) drawable).getBitmap(), this.a), txVar);
        }
        if (drawable instanceof aeh) {
            return this.c.a(wwVar, txVar);
        }
        return null;
    }
}
