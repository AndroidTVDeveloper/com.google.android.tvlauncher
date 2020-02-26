package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: bno  reason: default package */
/* compiled from: PG */
public final class bno extends buf {
    public static final Parcelable.Creator CREATOR = new bnp();
    public static final bno a = new bno(0);
    public final int b;
    public final PendingIntent c;
    public final String d;
    private final int e;

    public final boolean a() {
        return (this.b == 0 || this.c == null) ? false : true;
    }

    public final boolean b() {
        return this.b == 0;
    }

    public bno(int i) {
        this(i, null, (byte) 0);
    }

    public bno(int i, int i2, PendingIntent pendingIntent, String str) {
        this.e = i;
        this.b = i2;
        this.c = pendingIntent;
        this.d = str;
    }

    public bno(int i, PendingIntent pendingIntent) {
        this(i, pendingIntent, (byte) 0);
    }

    private bno(int i, PendingIntent pendingIntent, byte b2) {
        this(1, i, pendingIntent, null);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bno) {
            bno bno = (bno) obj;
            return this.b == bno.b && bty.a(this.c, bno.c) && bty.a(this.d, bno.d);
        }
    }

    static String a(int i) {
        if (i == 99) {
            return "UNFINISHED";
        }
        if (i == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    default:
                        StringBuilder sb = new StringBuilder(31);
                        sb.append("UNKNOWN_ERROR_CODE(");
                        sb.append(i);
                        sb.append(")");
                        return sb.toString();
                }
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), this.c, this.d});
    }

    public final String toString() {
        btx a2 = bty.a(this);
        a2.a("statusCode", a(this.b));
        a2.a("resolution", this.c);
        a2.a("message", this.d);
        return a2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = buj.a(parcel);
        buj.b(parcel, 1, this.e);
        buj.b(parcel, 2, this.b);
        buj.a(parcel, 3, this.c, i);
        buj.a(parcel, 4, this.d);
        buj.b(parcel, a2);
    }
}
