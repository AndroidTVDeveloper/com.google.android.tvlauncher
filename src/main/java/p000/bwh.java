package p000;

import com.google.android.gms.common.api.Scope;

/* renamed from: bwh */
/* compiled from: PG */
public final class bwh {

    /* renamed from: a */
    public static final bok f4944a = new bok("SignIn.API", f4945b, f4946c, (byte) 0, (byte) 0);

    /* renamed from: b */
    public static final cel f4945b = new bwe();

    /* renamed from: c */
    private static final bog f4946c = new bog((byte) 0);

    /* renamed from: d */
    private static final bog f4947d = new bog((byte) 0);

    /* renamed from: e */
    private static final cel f4948e = new bwf();

    static {
        new Scope("profile");
        new Scope("email");
        new bok("SignIn.INTERNAL_API", f4948e, f4947d, (byte) 0, (byte) 0);
    }
}
