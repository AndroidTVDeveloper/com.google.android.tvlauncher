package p000;

import android.os.Parcel;

/* renamed from: btq */
/* compiled from: PG */
public abstract class btq extends aip implements btr {
    public btq() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo326a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            buq b = mo2218b();
            parcel2.writeNoException();
            aiq.m586a(parcel2, b);
        } else if (i != 2) {
            return false;
        } else {
            int c = mo2219c();
            parcel2.writeNoException();
            parcel2.writeInt(c);
        }
        return true;
    }
}
