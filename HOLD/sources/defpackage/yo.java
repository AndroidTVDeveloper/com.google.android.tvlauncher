package defpackage;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: yo  reason: default package */
/* compiled from: PG */
final class yo implements aii {
    private static final yp b() {
        try {
            return new yp(MessageDigest.getInstance("SHA-256"));
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public final /* bridge */ /* synthetic */ Object a() {
        return b();
    }
}
