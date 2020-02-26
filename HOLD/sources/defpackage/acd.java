package defpackage;

import android.graphics.drawable.BitmapDrawable;
import java.io.File;

/* renamed from: acd  reason: default package */
/* compiled from: PG */
public final class acd implements ua {
    private final xg a;
    private final ua b;

    public acd(xg xgVar, ua uaVar) {
        this.a = xgVar;
        this.b = uaVar;
    }

    public final int a() {
        return 2;
    }

    public final /* bridge */ /* synthetic */ boolean a(Object obj, File file, tx txVar) {
        return this.b.a(new acf(((BitmapDrawable) ((ww) obj).b()).getBitmap(), this.a), file, txVar);
    }
}
