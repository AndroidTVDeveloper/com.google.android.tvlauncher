package p000;

import android.content.res.AssetManager;
import java.io.IOException;

/* renamed from: ud */
/* compiled from: PG */
public abstract class C0546ud implements C0549ug {

    /* renamed from: a */
    private final String f10532a;

    /* renamed from: b */
    private final AssetManager f10533b;

    /* renamed from: c */
    private Object f10534c;

    public C0546ud(AssetManager assetManager, String str) {
        this.f10533b = assetManager;
        this.f10532a = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo5999a(AssetManager assetManager, String str);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo6000a(Object obj);

    /* renamed from: c */
    public final void mo9c() {
    }

    /* renamed from: d */
    public final int mo10d() {
        return 1;
    }

    /* renamed from: b */
    public final void mo8b() {
        Object obj = this.f10534c;
        if (obj != null) {
            try {
                mo6000a(obj);
            } catch (IOException e) {
            }
        }
    }

    /* renamed from: a */
    public final void mo7a(C0501sm smVar, C0548uf ufVar) {
        try {
            Object a = mo5999a(this.f10533b, this.f10532a);
            this.f10534c = a;
            ufVar.mo22a(a);
        } catch (IOException e) {
            ufVar.mo21a((Exception) e);
        }
    }
}
