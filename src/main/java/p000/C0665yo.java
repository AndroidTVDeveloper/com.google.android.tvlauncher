package p000;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: yo */
/* compiled from: PG */
final class C0665yo implements aii {
    /* renamed from: b */
    private static final C0666yp m8681b() {
        try {
            return new C0666yp(MessageDigest.getInstance("SHA-256"));
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo316a() {
        return m8681b();
    }
}
