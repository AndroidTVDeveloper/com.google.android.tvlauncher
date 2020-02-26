package p000;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* renamed from: aeu */
/* compiled from: PG */
public final class aeu implements aew {

    /* renamed from: a */
    private final C0630xg f215a;

    /* renamed from: b */
    private final aew f216b;

    /* renamed from: c */
    private final aew f217c;

    public aeu(C0630xg xgVar, aew aew, aew aew2) {
        this.f215a = xgVar;
        this.f216b = aew;
        this.f217c = aew2;
    }

    /* renamed from: a */
    public final C0619ww mo122a(C0619ww wwVar, C0539tx txVar) {
        Drawable drawable = (Drawable) wwVar.mo33b();
        if (drawable instanceof BitmapDrawable) {
            return this.f216b.mo122a(acf.m107a(((BitmapDrawable) drawable).getBitmap(), this.f215a), txVar);
        }
        if (drawable instanceof aeh) {
            return this.f217c.mo122a(wwVar, txVar);
        }
        return null;
    }
}
