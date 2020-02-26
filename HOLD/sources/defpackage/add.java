package defpackage;

import android.os.Build;
import android.util.Log;
import java.io.File;

/* renamed from: add  reason: default package */
/* compiled from: PG */
public final class add {
    public static volatile add a;
    private static final File d = new File("/proc/self/fd");
    public final boolean b;
    public final int c;
    private final int e;
    private int f;
    private boolean g = true;

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    public add() {
        char c2;
        boolean z = true;
        if (Build.MODEL != null && Build.MODEL.length() >= 7) {
            String substring = Build.MODEL.substring(0, 7);
            switch (substring.hashCode()) {
                case -1398613787:
                    if (substring.equals("SM-A520")) {
                        c2 = 6;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1398431166:
                    if (substring.equals("SM-G930")) {
                        c2 = 5;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1398431161:
                    if (substring.equals("SM-G935")) {
                        c2 = 4;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1398431073:
                    if (substring.equals("SM-G960")) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1398431068:
                    if (substring.equals("SM-G965")) {
                        c2 = 3;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1398343746:
                    if (substring.equals("SM-J720")) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1398222624:
                    if (substring.equals("SM-N935")) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                default:
                    c2 = 65535;
                    break;
            }
            switch (c2) {
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
        this.b = z;
        if (Build.VERSION.SDK_INT >= 28) {
            this.e = 20000;
            this.c = 0;
            return;
        }
        this.e = 700;
        this.c = 128;
    }

    public final synchronized boolean a() {
        int i = this.f + 1;
        this.f = i;
        if (i >= 50) {
            boolean z = false;
            this.f = 0;
            int length = d.list().length;
            if (length < this.e) {
                z = true;
            }
            this.g = z;
            if (!z && Log.isLoggable("Downsampler", 5)) {
                int i2 = this.e;
                StringBuilder sb = new StringBuilder(126);
                sb.append("Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors ");
                sb.append(length);
                sb.append(", limit ");
                sb.append(i2);
                Log.w("Downsampler", sb.toString());
            }
        }
        return this.g;
    }
}
