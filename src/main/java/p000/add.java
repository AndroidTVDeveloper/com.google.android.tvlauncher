package p000;

import android.os.Build;
import android.util.Log;
import java.io.File;

/* renamed from: add */
/* compiled from: PG */
public final class add {

    /* renamed from: a */
    public static volatile add f131a;

    /* renamed from: d */
    private static final File f132d = new File("/proc/self/fd");

    /* renamed from: b */
    public final boolean f133b;

    /* renamed from: c */
    public final int f134c;

    /* renamed from: e */
    private final int f135e;

    /* renamed from: f */
    private int f136f;

    /* renamed from: g */
    private boolean f137g = true;

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    public add() {
        char c;
        boolean z = true;
        if (Build.MODEL != null && Build.MODEL.length() >= 7) {
            String substring = Build.MODEL.substring(0, 7);
            switch (substring.hashCode()) {
                case -1398613787:
                    if (substring.equals("SM-A520")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case -1398431166:
                    if (substring.equals("SM-G930")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case -1398431161:
                    if (substring.equals("SM-G935")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case -1398431073:
                    if (substring.equals("SM-G960")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -1398431068:
                    if (substring.equals("SM-G965")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -1398343746:
                    if (substring.equals("SM-J720")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -1398222624:
                    if (substring.equals("SM-N935")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    if (Build.VERSION.SDK_INT == 26) {
                        z = false;
                        break;
                    }
                    break;
            }
        }
        this.f133b = z;
        if (Build.VERSION.SDK_INT >= 28) {
            this.f135e = 20000;
            this.f134c = 0;
            return;
        }
        this.f135e = 700;
        this.f134c = 128;
    }

    /* renamed from: a */
    public final synchronized boolean mo66a() {
        int i = this.f136f + 1;
        this.f136f = i;
        if (i >= 50) {
            boolean z = false;
            this.f136f = 0;
            int length = f132d.list().length;
            if (length < this.f135e) {
                z = true;
            }
            this.f137g = z;
            if (!z && Log.isLoggable("Downsampler", 5)) {
                int i2 = this.f135e;
                StringBuilder sb = new StringBuilder(126);
                sb.append("Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors ");
                sb.append(length);
                sb.append(", limit ");
                sb.append(i2);
                Log.w("Downsampler", sb.toString());
            }
        }
        return this.f137g;
    }
}
