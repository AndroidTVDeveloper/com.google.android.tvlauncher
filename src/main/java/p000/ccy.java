package p000;

import android.content.Context;
import android.os.Process;

/* renamed from: ccy */
/* compiled from: PG */
public final class ccy {
    private ccy() {
    }

    /* renamed from: a */
    public static String m4554a(int i) {
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

    /* renamed from: a */
    public static cck m4552a() {
        return new cck((byte) 0);
    }

    /* renamed from: a */
    public static dnz m4553a(Context context) {
        dja l = dnz.f9017e.mo4516l();
        long elapsedCpuTime = Process.getElapsedCpuTime();
        if (l.f8673b) {
            l.mo4505b();
            l.f8673b = false;
        }
        dnz dnz = (dnz) l.f8672a;
        dnz.f9018a |= 1;
        dnz.f9019b = elapsedCpuTime;
        boolean b = ccx.m4549b(context);
        if (l.f8673b) {
            l.mo4505b();
            l.f8673b = false;
        }
        dnz dnz2 = (dnz) l.f8672a;
        dnz2.f9018a |= 2;
        dnz2.f9020c = b;
        int activeCount = Thread.activeCount();
        if (l.f8673b) {
            l.mo4505b();
            l.f8673b = false;
        }
        dnz dnz3 = (dnz) l.f8672a;
        dnz3.f9018a |= 4;
        dnz3.f9021d = activeCount;
        return (dnz) l.mo4509g();
    }
}
