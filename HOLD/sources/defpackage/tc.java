package defpackage;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: tc  reason: default package */
/* compiled from: PG */
public final class tc {
    public final String a;
    public final long[] b;
    public File[] c;
    public boolean d;
    public tb e;
    public final /* synthetic */ te f;
    private File[] g;

    public /* synthetic */ tc(te teVar, String str) {
        this.f = teVar;
        this.a = str;
        int i = teVar.d;
        this.b = new long[i];
        this.c = new File[i];
        this.g = new File[i];
        StringBuilder sb = new StringBuilder(str);
        sb.append('.');
        int length = sb.length();
        for (int i2 = 0; i2 < teVar.d; i2 = 1) {
            sb.append(0);
            this.c[0] = new File(teVar.a, sb.toString());
            sb.append(".tmp");
            this.g[0] = new File(teVar.a, sb.toString());
            sb.setLength(length);
        }
    }

    public final File b() {
        return this.c[0];
    }

    public final File c() {
        return this.g[0];
    }

    public final String a() {
        StringBuilder sb = new StringBuilder();
        for (long append : this.b) {
            sb.append(' ');
            sb.append(append);
        }
        return sb.toString();
    }

    public static final IOException a(String[] strArr) {
        String valueOf = String.valueOf(Arrays.toString(strArr));
        throw new IOException(valueOf.length() == 0 ? new String("unexpected journal line: ") : "unexpected journal line: ".concat(valueOf));
    }
}
