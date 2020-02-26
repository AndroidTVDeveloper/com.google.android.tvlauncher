package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: bmq  reason: default package */
/* compiled from: PG */
public final class bmq extends aio implements bmr {
    public bmq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    public final String b() {
        Parcel a = a(1, a());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aiq.a(android.os.Parcel, boolean):void
     arg types: [android.os.Parcel, int]
     candidates:
      aiq.a(android.os.Parcel, android.os.Parcelable$Creator):android.os.Parcelable
      aiq.a(android.os.Parcel, android.os.IInterface):void
      aiq.a(android.os.Parcel, android.os.Parcelable):void
      aiq.a(android.os.Parcel, boolean):void */
    public final boolean c() {
        Parcel a = a();
        aiq.a(a, true);
        Parcel a2 = a(2, a);
        boolean a3 = aiq.a(a2);
        a2.recycle();
        return a3;
    }
}
