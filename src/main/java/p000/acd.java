package p000;

import android.graphics.drawable.BitmapDrawable;
import java.io.File;

/* renamed from: acd */
/* compiled from: PG */
public final class acd implements C0543ua {

    /* renamed from: a */
    private final C0630xg f84a;

    /* renamed from: b */
    private final C0543ua f85b;

    public acd(C0630xg xgVar, C0543ua uaVar) {
        this.f84a = xgVar;
        this.f85b = uaVar;
    }

    /* renamed from: a */
    public final int mo40a() {
        return 2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo29a(Object obj, File file, C0539tx txVar) {
        return this.f85b.mo29a(new acf(((BitmapDrawable) ((C0619ww) obj).mo33b()).getBitmap(), this.f84a), file, txVar);
    }
}
