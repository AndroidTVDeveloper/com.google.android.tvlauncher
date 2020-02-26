package p000;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: buj */
/* compiled from: PG */
public final class buj {

    /* renamed from: a */
    public static Boolean f4847a;

    /* renamed from: b */
    private static Boolean f4848b;

    /* renamed from: c */
    private static Boolean f4849c;

    /* renamed from: a */
    public static void m4232a(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    /* renamed from: a */
    public static void m4233a(MediaFormat mediaFormat, List list) {
        for (int i = 0; i < list.size(); i++) {
            StringBuilder sb = new StringBuilder(15);
            sb.append("csd-");
            sb.append(i);
            mediaFormat.setByteBuffer(sb.toString(), ByteBuffer.wrap((byte[]) list.get(i)));
        }
    }

    /* renamed from: a */
    public static int m4230a(Parcel parcel) {
        return m4231a(parcel, 20293);
    }

    /* renamed from: a */
    public static int m4231a(Parcel parcel, int i) {
        parcel.writeInt(i | -65536);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    /* renamed from: b */
    public static void m4250b(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(dataPosition - i);
        parcel.setDataPosition(dataPosition);
    }

    /* renamed from: a */
    public static void m4241a(Parcel parcel, int i, boolean z) {
        m4234a(parcel, i, 4);
        parcel.writeInt(z ? 1 : 0);
    }

    /* renamed from: a */
    public static void m4236a(Parcel parcel, int i, Bundle bundle) {
        if (bundle != null) {
            int a = m4231a(parcel, i);
            parcel.writeBundle(bundle);
            m4250b(parcel, a);
        }
    }

    /* renamed from: a */
    public static void m4242a(Parcel parcel, int i, byte[] bArr) {
        if (bArr != null) {
            int a = m4231a(parcel, i);
            parcel.writeByteArray(bArr);
            m4250b(parcel, a);
        }
    }

    /* renamed from: a */
    public static void m4246a(Parcel parcel, int i, byte[][] bArr) {
        if (bArr != null) {
            int a = m4231a(parcel, i);
            parcel.writeInt(r0);
            for (byte[] writeByteArray : bArr) {
                parcel.writeByteArray(writeByteArray);
            }
            m4250b(parcel, a);
        }
    }

    /* renamed from: a */
    public static void m4234a(Parcel parcel, int i, int i2) {
        parcel.writeInt(i | (i2 << 16));
    }

    /* renamed from: a */
    public static void m4237a(Parcel parcel, int i, IBinder iBinder) {
        if (iBinder != null) {
            int a = m4231a(parcel, i);
            parcel.writeStrongBinder(iBinder);
            m4250b(parcel, a);
        }
    }

    /* renamed from: b */
    public static void m4251b(Parcel parcel, int i, int i2) {
        m4234a(parcel, i, 4);
        parcel.writeInt(i2);
    }

    /* renamed from: a */
    public static void m4243a(Parcel parcel, int i, int[] iArr) {
        if (iArr != null) {
            int a = m4231a(parcel, i);
            parcel.writeIntArray(iArr);
            m4250b(parcel, a);
        }
    }

    /* renamed from: a */
    public static void m4235a(Parcel parcel, int i, long j) {
        m4234a(parcel, i, 8);
        parcel.writeLong(j);
    }

    /* renamed from: a */
    public static void m4238a(Parcel parcel, int i, Parcelable parcelable, int i2) {
        if (parcelable != null) {
            int a = m4231a(parcel, i);
            parcelable.writeToParcel(parcel, i2);
            m4250b(parcel, a);
        }
    }

    /* renamed from: a */
    public static void m4239a(Parcel parcel, int i, String str) {
        if (str != null) {
            int a = m4231a(parcel, i);
            parcel.writeString(str);
            m4250b(parcel, a);
        }
    }

    /* renamed from: a */
    public static void m4245a(Parcel parcel, int i, String[] strArr) {
        if (strArr != null) {
            int a = m4231a(parcel, i);
            parcel.writeStringArray(strArr);
            m4250b(parcel, a);
        }
    }

    /* renamed from: a */
    public static void m4240a(Parcel parcel, int i, List list) {
        if (list != null) {
            int a = m4231a(parcel, i);
            parcel.writeStringList(list);
            m4250b(parcel, a);
        }
    }

    /* renamed from: a */
    public static void m4244a(Parcel parcel, int i, Parcelable[] parcelableArr, int i2) {
        if (parcelableArr != null) {
            int a = m4231a(parcel, i);
            parcel.writeInt(r0);
            for (Parcelable parcelable : parcelableArr) {
                if (parcelable == null) {
                    parcel.writeInt(0);
                } else {
                    m4247a(parcel, parcelable, i2);
                }
            }
            m4250b(parcel, a);
        }
    }

    /* renamed from: a */
    private static void m4247a(Parcel parcel, Parcelable parcelable, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }

    /* renamed from: b */
    public static void m4252b(Parcel parcel, int i, List list) {
        if (list != null) {
            int a = m4231a(parcel, i);
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                Parcelable parcelable = (Parcelable) list.get(i2);
                if (parcelable == null) {
                    parcel.writeInt(0);
                } else {
                    m4247a(parcel, parcelable, 0);
                }
            }
            m4250b(parcel, a);
        }
    }

    /* renamed from: a */
    public static boolean m4248a(Context context) {
        if (f4848b == null) {
            buk.m4256a();
            f4848b = Boolean.valueOf(context.getPackageManager().hasSystemFeature("android.hardware.type.watch"));
        }
        return f4848b.booleanValue();
    }

    /* renamed from: b */
    public static void m4249b(Context context) {
        if (m4248a(context)) {
            int i = Build.VERSION.SDK_INT;
            if (f4849c == null) {
                int i2 = Build.VERSION.SDK_INT;
                f4849c = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
            }
            if (f4849c.booleanValue()) {
                buk.m4258b();
            }
        }
    }
}
