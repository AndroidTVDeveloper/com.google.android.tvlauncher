package p000;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: aiq */
/* compiled from: PG */
public final class aiq {
    static {
        aiq.class.getClassLoader();
    }

    private aiq() {
    }

    /* renamed from: a */
    public static boolean m589a(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    /* renamed from: a */
    public static Parcelable m585a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return (Parcelable) creator.createFromParcel(parcel);
        }
        return null;
    }

    /* renamed from: a */
    public static void m588a(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    /* renamed from: a */
    public static void m587a(Parcel parcel, Parcelable parcelable) {
        if (parcelable != null) {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
            return;
        }
        parcel.writeInt(0);
    }

    /* renamed from: a */
    public static void m586a(Parcel parcel, IInterface iInterface) {
        if (iInterface != null) {
            parcel.writeStrongBinder(iInterface.asBinder());
        } else {
            parcel.writeStrongBinder(null);
        }
    }
}
