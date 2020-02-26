package defpackage;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: buj  reason: default package */
/* compiled from: PG */
public final class buj {
    public static Boolean a;
    private static Boolean b;
    private static Boolean c;

    public static void a(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    public static void a(MediaFormat mediaFormat, List list) {
        for (int i = 0; i < list.size(); i++) {
            StringBuilder sb = new StringBuilder(15);
            sb.append("csd-");
            sb.append(i);
            mediaFormat.setByteBuffer(sb.toString(), ByteBuffer.wrap((byte[]) list.get(i)));
        }
    }

    public static int a(Parcel parcel) {
        return a(parcel, 20293);
    }

    public static int a(Parcel parcel, int i) {
        parcel.writeInt(i | -65536);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void b(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(dataPosition - i);
        parcel.setDataPosition(dataPosition);
    }

    public static void a(Parcel parcel, int i, boolean z) {
        a(parcel, i, 4);
        parcel.writeInt(z ? 1 : 0);
    }

    public static void a(Parcel parcel, int i, Bundle bundle) {
        if (bundle != null) {
            int a2 = a(parcel, i);
            parcel.writeBundle(bundle);
            b(parcel, a2);
        }
    }

    public static void a(Parcel parcel, int i, byte[] bArr) {
        if (bArr != null) {
            int a2 = a(parcel, i);
            parcel.writeByteArray(bArr);
            b(parcel, a2);
        }
    }

    public static void a(Parcel parcel, int i, byte[][] bArr) {
        if (bArr != null) {
            int a2 = a(parcel, i);
            parcel.writeInt(r0);
            for (byte[] writeByteArray : bArr) {
                parcel.writeByteArray(writeByteArray);
            }
            b(parcel, a2);
        }
    }

    public static void a(Parcel parcel, int i, int i2) {
        parcel.writeInt(i | (i2 << 16));
    }

    public static void a(Parcel parcel, int i, IBinder iBinder) {
        if (iBinder != null) {
            int a2 = a(parcel, i);
            parcel.writeStrongBinder(iBinder);
            b(parcel, a2);
        }
    }

    public static void b(Parcel parcel, int i, int i2) {
        a(parcel, i, 4);
        parcel.writeInt(i2);
    }

    public static void a(Parcel parcel, int i, int[] iArr) {
        if (iArr != null) {
            int a2 = a(parcel, i);
            parcel.writeIntArray(iArr);
            b(parcel, a2);
        }
    }

    public static void a(Parcel parcel, int i, long j) {
        a(parcel, i, 8);
        parcel.writeLong(j);
    }

    public static void a(Parcel parcel, int i, Parcelable parcelable, int i2) {
        if (parcelable != null) {
            int a2 = a(parcel, i);
            parcelable.writeToParcel(parcel, i2);
            b(parcel, a2);
        }
    }

    public static void a(Parcel parcel, int i, String str) {
        if (str != null) {
            int a2 = a(parcel, i);
            parcel.writeString(str);
            b(parcel, a2);
        }
    }

    public static void a(Parcel parcel, int i, String[] strArr) {
        if (strArr != null) {
            int a2 = a(parcel, i);
            parcel.writeStringArray(strArr);
            b(parcel, a2);
        }
    }

    public static void a(Parcel parcel, int i, List list) {
        if (list != null) {
            int a2 = a(parcel, i);
            parcel.writeStringList(list);
            b(parcel, a2);
        }
    }

    public static void a(Parcel parcel, int i, Parcelable[] parcelableArr, int i2) {
        if (parcelableArr != null) {
            int a2 = a(parcel, i);
            parcel.writeInt(r0);
            for (Parcelable parcelable : parcelableArr) {
                if (parcelable == null) {
                    parcel.writeInt(0);
                } else {
                    a(parcel, parcelable, i2);
                }
            }
            b(parcel, a2);
        }
    }

    private static void a(Parcel parcel, Parcelable parcelable, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }

    public static void b(Parcel parcel, int i, List list) {
        if (list != null) {
            int a2 = a(parcel, i);
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                Parcelable parcelable = (Parcelable) list.get(i2);
                if (parcelable == null) {
                    parcel.writeInt(0);
                } else {
                    a(parcel, parcelable, 0);
                }
            }
            b(parcel, a2);
        }
    }

    public static boolean a(Context context) {
        if (b == null) {
            buk.a();
            b = Boolean.valueOf(context.getPackageManager().hasSystemFeature("android.hardware.type.watch"));
        }
        return b.booleanValue();
    }

    public static void b(Context context) {
        if (a(context)) {
            int i = Build.VERSION.SDK_INT;
            if (c == null) {
                int i2 = Build.VERSION.SDK_INT;
                c = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
            }
            if (c.booleanValue()) {
                buk.b();
            }
        }
    }
}
