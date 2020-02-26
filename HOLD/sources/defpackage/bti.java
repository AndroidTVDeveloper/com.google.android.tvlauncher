package defpackage;

import android.content.ServiceConnection;

/* renamed from: bti  reason: default package */
/* compiled from: PG */
public abstract class bti {
    public static final Object a = new Object();
    public static bti b;

    /* access modifiers changed from: protected */
    public abstract void a(bth bth, ServiceConnection serviceConnection);

    /* access modifiers changed from: protected */
    public abstract boolean b(bth bth, ServiceConnection serviceConnection);

    public final void a(String str, String str2, ServiceConnection serviceConnection) {
        a(new bth(str, str2), serviceConnection);
    }
}
