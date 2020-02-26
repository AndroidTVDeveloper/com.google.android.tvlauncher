package p000;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: tc */
/* compiled from: PG */
public final class C0518tc {

    /* renamed from: a */
    public final String f10440a;

    /* renamed from: b */
    public final long[] f10441b;

    /* renamed from: c */
    public File[] f10442c;

    /* renamed from: d */
    public boolean f10443d;

    /* renamed from: e */
    public C0517tb f10444e;

    /* renamed from: f */
    public final /* synthetic */ C0520te f10445f;

    /* renamed from: g */
    private File[] f10446g;

    public /* synthetic */ C0518tc(C0520te teVar, String str) {
        this.f10445f = teVar;
        this.f10440a = str;
        int i = teVar.f10451d;
        this.f10441b = new long[i];
        this.f10442c = new File[i];
        this.f10446g = new File[i];
        StringBuilder sb = new StringBuilder(str);
        sb.append('.');
        int length = sb.length();
        for (int i2 = 0; i2 < teVar.f10451d; i2 = 1) {
            sb.append(0);
            this.f10442c[0] = new File(teVar.f10448a, sb.toString());
            sb.append(".tmp");
            this.f10446g[0] = new File(teVar.f10448a, sb.toString());
            sb.setLength(length);
        }
    }

    /* renamed from: b */
    public final File mo5963b() {
        return this.f10442c[0];
    }

    /* renamed from: c */
    public final File mo5964c() {
        return this.f10446g[0];
    }

    /* renamed from: a */
    public final String mo5962a() {
        StringBuilder sb = new StringBuilder();
        for (long append : this.f10441b) {
            sb.append(' ');
            sb.append(append);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static final IOException m8343a(String[] strArr) {
        String valueOf = String.valueOf(Arrays.toString(strArr));
        throw new IOException(valueOf.length() == 0 ? new String("unexpected journal line: ") : "unexpected journal line: ".concat(valueOf));
    }
}
