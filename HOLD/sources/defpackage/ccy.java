package defpackage;

import android.content.Context;
import android.os.Process;

/* renamed from: ccy  reason: default package */
/* compiled from: PG */
public final class ccy {
    private ccy() {
    }

    public static String a(int i) {
        switch (i) {
            case -1:
                return "SUCCESS_CACHE";
            case 0:
                return "SUCCESS";
            case 1:
            case 9:
            case 11:
            case 12:
            default:
                StringBuilder sb = new StringBuilder(32);
                sb.append("unknown status code: ");
                sb.append(i);
                return sb.toString();
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
            case 10:
                return "DEVELOPER_ERROR";
            case 13:
                return "ERROR";
            case 14:
                return "INTERRUPTED";
            case 15:
                return "TIMEOUT";
            case 16:
                return "CANCELED";
            case 17:
                return "API_NOT_CONNECTED";
            case 18:
                return "DEAD_CLIENT";
        }
    }

    public static cck a() {
        return new cck((byte) 0);
    }

    public static dnz a(Context context) {
        dja l = dnz.e.l();
        long elapsedCpuTime = Process.getElapsedCpuTime();
        if (l.b) {
            l.b();
            l.b = false;
        }
        dnz dnz = (dnz) l.a;
        dnz.a |= 1;
        dnz.b = elapsedCpuTime;
        boolean b = ccx.b(context);
        if (l.b) {
            l.b();
            l.b = false;
        }
        dnz dnz2 = (dnz) l.a;
        dnz2.a |= 2;
        dnz2.c = b;
        int activeCount = Thread.activeCount();
        if (l.b) {
            l.b();
            l.b = false;
        }
        dnz dnz3 = (dnz) l.a;
        dnz3.a |= 4;
        dnz3.d = activeCount;
        return (dnz) l.g();
    }
}
