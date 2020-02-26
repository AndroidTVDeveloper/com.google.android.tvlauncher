package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: aiq  reason: default package */
/* compiled from: PG */
public final class aiq {
    static {
        aiq.class.getClassLoader();
    }

    private aiq() {
    }

    public static boolean a(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    public static Parcelable a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return (Parcelable) creator.createFromParcel(parcel);
        }
        return null;
    }

    public static void a(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    public static void a(Parcel parcel, Parcelable parcelable) {
        if (parcelable != null) {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
            return;
        }
        parcel.writeInt(0);
    }

    public static void a(Parcel parcel, IInterface iInterface) {
        if (iInterface != null) {
            parcel.writeStrongBinder(iInterface.asBinder());
        } else {
            parcel.writeStrongBinder(null);
        }
    }
}
