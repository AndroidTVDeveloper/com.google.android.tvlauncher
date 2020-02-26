package defpackage;

import android.os.Bundle;

/* renamed from: bsi  reason: default package */
/* compiled from: PG */
abstract class bsi extends bsm {
    private final int c;
    private final Bundle d;
    private final /* synthetic */ bst e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected bsi(bst bst, int i, Bundle bundle) {
        super(bst, true);
        this.e = bst;
        this.c = i;
        this.d = bundle;
    }

    /* access modifiers changed from: protected */
    public abstract void a(bno bno);

    /* access modifiers changed from: protected */
    public abstract boolean a();

    /* access modifiers changed from: protected */
    public final void b() {
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [android.os.Parcelable] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void c() {
        /*
            r5 = this;
            int r0 = r5.c
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x005a
            r3 = 10
            if (r0 == r3) goto L_0x002a
            bst r0 = r5.e
            r0.a(r2, (android.os.IInterface) null)
            android.os.Bundle r0 = r5.d
            if (r0 == 0) goto L_0x001d
            java.lang.String r1 = "pendingIntent"
            android.os.Parcelable r0 = r0.getParcelable(r1)
            r1 = r0
            android.app.PendingIntent r1 = (android.app.PendingIntent) r1
            goto L_0x001f
        L_0x001d:
        L_0x001f:
            bno r0 = new bno
            int r2 = r5.c
            r0.<init>(r2, r1)
            r5.a(r0)
            return
        L_0x002a:
            bst r0 = r5.e
            r0.a(r2, (android.os.IInterface) null)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r3 = 0
            java.lang.Class r4 = r5.getClass()
            java.lang.String r4 = r4.getSimpleName()
            r1[r3] = r4
            bst r3 = r5.e
            java.lang.String r3 = r3.a()
            r1[r2] = r3
            r2 = 2
            bst r3 = r5.e
            java.lang.String r3 = r3.b()
            r1[r2] = r3
            java.lang.String r2 = "A fatal developer error has occurred. Class name: %s. Start service action: %s. Service Descriptor: %s. "
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.<init>(r1)
            throw r0
        L_0x005a:
            boolean r0 = r5.a()
            if (r0 != 0) goto L_0x0070
            bst r0 = r5.e
            r0.a(r2, (android.os.IInterface) null)
            bno r0 = new bno
            r2 = 8
            r0.<init>(r2, r1)
            r5.a(r0)
            return
        L_0x0070:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bsi.c():void");
    }
}
