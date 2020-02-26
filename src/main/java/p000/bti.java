package p000;

import android.content.ServiceConnection;

/* renamed from: bti */
/* compiled from: PG */
public abstract class bti {

    /* renamed from: a */
    public static final Object f4808a = new Object();

    /* renamed from: b */
    public static bti f4809b;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo2425a(bth bth, ServiceConnection serviceConnection);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract boolean mo2427b(bth bth, ServiceConnection serviceConnection);

    /* renamed from: a */
    public final void mo2426a(String str, String str2, ServiceConnection serviceConnection) {
        mo2425a(new bth(str, str2), serviceConnection);
    }
}
