package p000;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: bmq */
/* compiled from: PG */
public final class bmq extends aio implements bmr {
    public bmq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    /* renamed from: b */
    public final String mo2156b() {
        Parcel a = mo322a(1, mo321a());
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
    /* renamed from: c */
    public final boolean mo2157c() {
        Parcel a = mo321a();
        aiq.m588a(a, true);
        Parcel a2 = mo322a(2, a);
        boolean a3 = aiq.m589a(a2);
        a2.recycle();
        return a3;
    }
}
