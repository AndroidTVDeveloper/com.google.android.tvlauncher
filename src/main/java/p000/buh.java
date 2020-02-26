package p000;

import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: buh */
/* compiled from: PG */
public final class buh {
    /* renamed from: a */
    public static int m4195a(int i) {
        return (char) i;
    }

    /* renamed from: b */
    public static int m4208b(int i) {
        int i2 = 0;
        while (i > 0) {
            i2++;
            i >>>= 1;
        }
        return i2;
    }

    /* renamed from: a */
    public static boolean m4207a(int i, bky bky, boolean z) {
        if (bky.mo2070b() >= 7) {
            if (bky.mo2074d() == i) {
                if (bky.mo2074d() == 118 && bky.mo2074d() == 111 && bky.mo2074d() == 114 && bky.mo2074d() == 98 && bky.mo2074d() == 105 && bky.mo2074d() == 115) {
                    return true;
                }
                if (z) {
                    return false;
                }
                throw new ako("expected characters 'vorbis'");
            } else if (z) {
                return false;
            } else {
                String valueOf = String.valueOf(Integer.toHexString(i));
                throw new ako(valueOf.length() == 0 ? new String("expected header type ") : "expected header type ".concat(valueOf));
            }
        } else if (z) {
            return false;
        } else {
            int b = bky.mo2070b();
            StringBuilder sb = new StringBuilder(29);
            sb.append("too short header: ");
            sb.append(b);
            throw new ako(sb.toString());
        }
    }

    /* renamed from: b */
    public static void m4212b(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: b */
    public static void m4213b(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: a */
    public static void m4202a(Handler handler) {
        String str;
        if (Looper.myLooper() == null) {
            str = "null current looper";
        } else {
            str = Looper.myLooper().getThread().getName();
        }
        String name = handler.getLooper().getThread().getName();
        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 36 + String.valueOf(str).length());
        sb.append("Must be called on ");
        sb.append(name);
        sb.append(" thread, but got ");
        sb.append(str);
        sb.append(".");
        m4203a(handler, sb.toString());
    }

    /* renamed from: a */
    public static void m4203a(Handler handler, String str) {
        if (Looper.myLooper() != handler.getLooper()) {
            throw new IllegalStateException(str);
        }
    }

    /* renamed from: a */
    public static String m4201a(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException("Given String is empty or null");
    }

    /* renamed from: b */
    public static void m4211b(String str) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IllegalStateException(str);
        }
    }

    /* renamed from: a */
    public static Object m4199a(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("null reference");
    }

    /* renamed from: a */
    public static Object m4200a(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException((String) obj2);
    }

    /* renamed from: a */
    public static void m4205a(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: a */
    public static void m4206a(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException((String) obj);
        }
    }

    /* renamed from: h */
    public static Bundle m4221h(Parcel parcel, int i) {
        int a = m4197a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + a);
        return readBundle;
    }

    /* renamed from: i */
    public static byte[] m4222i(Parcel parcel, int i) {
        int a = m4197a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + a);
        return createByteArray;
    }

    /* renamed from: j */
    public static byte[][] m4223j(Parcel parcel, int i) {
        int a = m4197a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        byte[][] bArr = new byte[readInt][];
        for (int i2 = 0; i2 < readInt; i2++) {
            bArr[i2] = parcel.createByteArray();
        }
        parcel.setDataPosition(dataPosition + a);
        return bArr;
    }

    /* renamed from: k */
    public static int[] m4224k(Parcel parcel, int i) {
        int a = m4197a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + a);
        return createIntArray;
    }

    /* renamed from: a */
    public static Parcelable m4198a(Parcel parcel, int i, Parcelable.Creator creator) {
        int a = m4197a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + a);
        return parcelable;
    }

    /* renamed from: f */
    public static String m4219f(Parcel parcel, int i) {
        int a = m4197a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + a);
        return readString;
    }

    /* renamed from: l */
    public static String[] m4225l(Parcel parcel, int i) {
        int a = m4197a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + a);
        return createStringArray;
    }

    /* renamed from: m */
    public static ArrayList m4226m(Parcel parcel, int i) {
        int a = m4197a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + a);
        return createStringArrayList;
    }

    /* renamed from: b */
    public static Object[] m4214b(Parcel parcel, int i, Parcelable.Creator creator) {
        int a = m4197a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        Object[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + a);
        return createTypedArray;
    }

    /* renamed from: c */
    public static ArrayList m4215c(Parcel parcel, int i, Parcelable.Creator creator) {
        int a = m4197a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        ArrayList createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + a);
        return createTypedArrayList;
    }

    /* renamed from: n */
    public static void m4227n(Parcel parcel, int i) {
        if (parcel.dataPosition() != i) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("Overread allowed size end=");
            sb.append(i);
            throw new bug(sb.toString(), parcel);
        }
    }

    /* renamed from: a */
    private static void m4204a(Parcel parcel, int i, int i2) {
        int a = m4197a(parcel, i);
        if (a != i2) {
            String hexString = Integer.toHexString(a);
            StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 46);
            sb.append("Expected size ");
            sb.append(i2);
            sb.append(" got ");
            sb.append(a);
            sb.append(" (0x");
            sb.append(hexString);
            sb.append(")");
            throw new bug(sb.toString(), parcel);
        }
    }

    /* renamed from: c */
    public static boolean m4216c(Parcel parcel, int i) {
        m4204a(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    /* renamed from: a */
    public static int m4196a(Parcel parcel) {
        return parcel.readInt();
    }

    /* renamed from: g */
    public static IBinder m4220g(Parcel parcel, int i) {
        int a = m4197a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + a);
        return readStrongBinder;
    }

    /* renamed from: d */
    public static int m4217d(Parcel parcel, int i) {
        m4204a(parcel, i, 4);
        return parcel.readInt();
    }

    /* renamed from: e */
    public static long m4218e(Parcel parcel, int i) {
        m4204a(parcel, i, 8);
        return parcel.readLong();
    }

    /* renamed from: a */
    public static int m4197a(Parcel parcel, int i) {
        return (i & -65536) != -65536 ? i >>> 16 : parcel.readInt();
    }

    /* renamed from: b */
    public static void m4210b(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + m4197a(parcel, i));
    }

    /* renamed from: b */
    public static int m4209b(Parcel parcel) {
        int readInt = parcel.readInt();
        int a = m4197a(parcel, readInt);
        int dataPosition = parcel.dataPosition();
        if (m4195a(readInt) != 20293) {
            String valueOf = String.valueOf(Integer.toHexString(readInt));
            throw new bug(valueOf.length() == 0 ? new String("Expected object header. Got 0x") : "Expected object header. Got 0x".concat(valueOf), parcel);
        }
        int i = a + dataPosition;
        if (i >= dataPosition && i <= parcel.dataSize()) {
            return i;
        }
        StringBuilder sb = new StringBuilder(54);
        sb.append("Size read is invalid start=");
        sb.append(dataPosition);
        sb.append(" end=");
        sb.append(i);
        throw new bug(sb.toString(), parcel);
    }
}
