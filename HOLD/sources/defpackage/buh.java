package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: buh  reason: default package */
/* compiled from: PG */
public final class buh {
    public static int a(int i) {
        return (char) i;
    }

    public static int b(int i) {
        int i2 = 0;
        while (i > 0) {
            i2++;
            i >>>= 1;
        }
        return i2;
    }

    public static boolean a(int i, bky bky, boolean z) {
        if (bky.b() >= 7) {
            if (bky.d() == i) {
                if (bky.d() == 118 && bky.d() == 111 && bky.d() == 114 && bky.d() == 98 && bky.d() == 105 && bky.d() == 115) {
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
            int b = bky.b();
            StringBuilder sb = new StringBuilder(29);
            sb.append("too short header: ");
            sb.append(b);
            throw new ako(sb.toString());
        }
    }

    public static void b(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void b(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void a(Handler handler) {
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
        a(handler, sb.toString());
    }

    public static void a(Handler handler, String str) {
        if (Looper.myLooper() != handler.getLooper()) {
            throw new IllegalStateException(str);
        }
    }

    public static String a(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException("Given String is empty or null");
    }

    public static void b(String str) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IllegalStateException(str);
        }
    }

    public static Object a(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("null reference");
    }

    public static Object a(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException((String) obj2);
    }

    public static void a(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void a(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException((String) obj);
        }
    }

    public static Bundle h(Parcel parcel, int i) {
        int a = a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + a);
        return readBundle;
    }

    public static byte[] i(Parcel parcel, int i) {
        int a = a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + a);
        return createByteArray;
    }

    public static byte[][] j(Parcel parcel, int i) {
        int a = a(parcel, i);
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

    public static int[] k(Parcel parcel, int i) {
        int a = a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + a);
        return createIntArray;
    }

    public static Parcelable a(Parcel parcel, int i, Parcelable.Creator creator) {
        int a = a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + a);
        return parcelable;
    }

    public static String f(Parcel parcel, int i) {
        int a = a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + a);
        return readString;
    }

    public static String[] l(Parcel parcel, int i) {
        int a = a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + a);
        return createStringArray;
    }

    public static ArrayList m(Parcel parcel, int i) {
        int a = a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + a);
        return createStringArrayList;
    }

    public static Object[] b(Parcel parcel, int i, Parcelable.Creator creator) {
        int a = a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        Object[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + a);
        return createTypedArray;
    }

    public static ArrayList c(Parcel parcel, int i, Parcelable.Creator creator) {
        int a = a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        ArrayList createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + a);
        return createTypedArrayList;
    }

    public static void n(Parcel parcel, int i) {
        if (parcel.dataPosition() != i) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("Overread allowed size end=");
            sb.append(i);
            throw new bug(sb.toString(), parcel);
        }
    }

    private static void a(Parcel parcel, int i, int i2) {
        int a = a(parcel, i);
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

    public static boolean c(Parcel parcel, int i) {
        a(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    public static int a(Parcel parcel) {
        return parcel.readInt();
    }

    public static IBinder g(Parcel parcel, int i) {
        int a = a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + a);
        return readStrongBinder;
    }

    public static int d(Parcel parcel, int i) {
        a(parcel, i, 4);
        return parcel.readInt();
    }

    public static long e(Parcel parcel, int i) {
        a(parcel, i, 8);
        return parcel.readLong();
    }

    public static int a(Parcel parcel, int i) {
        return (i & -65536) != -65536 ? i >>> 16 : parcel.readInt();
    }

    public static void b(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + a(parcel, i));
    }

    public static int b(Parcel parcel) {
        int readInt = parcel.readInt();
        int a = a(parcel, readInt);
        int dataPosition = parcel.dataPosition();
        if (a(readInt) != 20293) {
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
