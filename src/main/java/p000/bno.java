package p000;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: bno */
/* compiled from: PG */
public final class bno extends buf {
    public static final Parcelable.Creator CREATOR = new bnp();

    /* renamed from: a */
    public static final bno f4481a = new bno(0);

    /* renamed from: b */
    public final int f4482b;

    /* renamed from: c */
    public final PendingIntent f4483c;

    /* renamed from: d */
    public final String f4484d;

    /* renamed from: e */
    private final int f4485e;

    /* renamed from: a */
    public final boolean mo2194a() {
        return (this.f4482b == 0 || this.f4483c == null) ? false : true;
    }

    /* renamed from: b */
    public final boolean mo2195b() {
        return this.f4482b == 0;
    }

    public bno(int i) {
        this(i, null, (byte) 0);
    }

    public bno(int i, int i2, PendingIntent pendingIntent, String str) {
        this.f4485e = i;
        this.f4482b = i2;
        this.f4483c = pendingIntent;
        this.f4484d = str;
    }

    public bno(int i, PendingIntent pendingIntent) {
        this(i, pendingIntent, (byte) 0);
    }

    private bno(int i, PendingIntent pendingIntent, byte b) {
        this(1, i, pendingIntent, null);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bno) {
            bno bno = (bno) obj;
            return this.f4482b == bno.f4482b && bty.m4184a(this.f4483c, bno.f4483c) && bty.m4184a(this.f4484d, bno.f4484d);
        }
    }

    /* renamed from: a */
    static String m3793a(int i) {
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
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f4482b), this.f4483c, this.f4484d});
    }

    public final String toString() {
        btx a = bty.m4182a(this);
        a.mo2440a("statusCode", m3793a(this.f4482b));
        a.mo2440a("resolution", this.f4483c);
        a.mo2440a("message", this.f4484d);
        return a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = buj.m4230a(parcel);
        buj.m4251b(parcel, 1, this.f4485e);
        buj.m4251b(parcel, 2, this.f4482b);
        buj.m4238a(parcel, 3, this.f4483c, i);
        buj.m4239a(parcel, 4, this.f4484d);
        buj.m4250b(parcel, a);
    }
}
