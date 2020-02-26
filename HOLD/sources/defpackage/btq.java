package defpackage;

import android.os.Parcel;

/* renamed from: btq  reason: default package */
/* compiled from: PG */
public abstract class btq extends aip implements btr {
    public btq() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    /* access modifiers changed from: protected */
    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            buq b = b();
            parcel2.writeNoException();
            aiq.a(parcel2, b);
        } else if (i != 2) {
            return false;
        } else {
            int c = c();
            parcel2.writeNoException();
            parcel2.writeInt(c);
        }
        return true;
    }
}
