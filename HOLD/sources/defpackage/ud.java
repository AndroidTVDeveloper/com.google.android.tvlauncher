package defpackage;

import android.content.res.AssetManager;
import java.io.IOException;

/* renamed from: ud  reason: default package */
/* compiled from: PG */
public abstract class ud implements ug {
    private final String a;
    private final AssetManager b;
    private Object c;

    public ud(AssetManager assetManager, String str) {
        this.b = assetManager;
        this.a = str;
    }

    /* access modifiers changed from: protected */
    public abstract Object a(AssetManager assetManager, String str);

    /* access modifiers changed from: protected */
    public abstract void a(Object obj);

    public final void c() {
    }

    public final int d() {
        return 1;
    }

    public final void b() {
        Object obj = this.c;
        if (obj != null) {
            try {
                a(obj);
            } catch (IOException e) {
            }
        }
    }

    public final void a(sm smVar, uf ufVar) {
        try {
            Object a2 = a(this.b, this.a);
            this.c = a2;
            ufVar.a(a2);
        } catch (IOException e) {
            ufVar.a((Exception) e);
        }
    }
}
