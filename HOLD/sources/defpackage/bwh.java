package defpackage;

import com.google.android.gms.common.api.Scope;

/* renamed from: bwh  reason: default package */
/* compiled from: PG */
public final class bwh {
    public static final bok a = new bok("SignIn.API", b, c, (byte) 0, (byte) 0);
    public static final cel b = new bwe();
    private static final bog c = new bog((byte) 0);
    private static final bog d = new bog((byte) 0);
    private static final cel e = new bwf();

    static {
        new Scope("profile");
        new Scope("email");
        new bok("SignIn.INTERNAL_API", e, d, (byte) 0, (byte) 0);
    }
}
