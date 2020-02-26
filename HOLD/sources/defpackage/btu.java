package defpackage;

import android.os.IBinder;

/* renamed from: btu  reason: default package */
/* compiled from: PG */
final class btu implements btv {
    private final IBinder a;

    public btu(IBinder iBinder) {
        this.a = iBinder;
    }

    public final IBinder asBinder() {
        return this.a;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [btt, android.os.IBinder] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.btt r4, defpackage.bta r5) {
        /*
            r3 = this;
            android.os.Parcel r0 = android.os.Parcel.obtain()
            android.os.Parcel r1 = android.os.Parcel.obtain()
            java.lang.String r2 = "com.google.android.gms.common.internal.IGmsServiceBroker"
            r0.writeInterfaceToken(r2)     // Catch:{ all -> 0x0029 }
            r0.writeStrongBinder(r4)     // Catch:{ all -> 0x0029 }
            r4 = 1
            r0.writeInt(r4)     // Catch:{ all -> 0x0029 }
            r4 = 0
            defpackage.btb.a(r5, r0, r4)     // Catch:{ all -> 0x0029 }
            android.os.IBinder r5 = r3.a     // Catch:{ all -> 0x0029 }
            r2 = 46
            r5.transact(r2, r0, r1, r4)     // Catch:{ all -> 0x0029 }
            r1.readException()     // Catch:{ all -> 0x0029 }
            r1.recycle()
            r0.recycle()
            return
        L_0x0029:
            r4 = move-exception
            r1.recycle()
            r0.recycle()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.btu.a(btt, bta):void");
    }
}
